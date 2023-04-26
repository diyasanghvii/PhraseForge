grammar PhraseForge;

forge_pgm: 'pf_launch' phrase_blk 'pf_abort';

phrase_blk
	: '{' forge_cmd+ '}'
	;

forge_cmd
	: (forge_if|forge_while|forge_enh|forge_loop|echo_forge|forge_asrt)
	;

forge_asrt
	: 'quant' FORGE_VAR (EQT asrt_num)?    #quantAssignment
	| 'quant' FORGE_VAR EQT asrt_tern      #quantAssignment
	| 'logic' FORGE_VAR (EQT asrt_bool)?   #logicAssignment
	| 'logic' FORGE_VAR (EQT asrt_tern)?   #logicAssignment
	| 'phrase' FORGE_VAR (EQT PHRASE_STR)? #phraseAssignment
	| 'phrase' FORGE_VAR (EQT asrt_tern)?  #phraseAssignment
	| FORGE_VAR EQT asrt_num    #quantAssignment
	| FORGE_VAR EQT asrt_bool   #logicAssignment
    ;

asrts
    : asrt_num
    | asrt_bool
    ;

asrt_bool
    : asrt_bool op=(Logical_AND|Logical_OR|EqualTo|NotEqualTo) asrt_bool #logicLogicalExpression
    | asrt_cmp # logicComparisonExpression
    | '(' asrt_bool ')' # logicExpressionInBrackets
    | PHRASE_BOOL       # logicVal
    | FORGE_VAR         # logicVarExpression
    ;

asrt_cmp
    : asrt_num op=(GreaterThan|LesserThan|GreaterThanOrEqualTo|LesserThanOrEqualTo|EqualTo|NotEqualTo) asrt_num
    ;

asrt_num
    : asrt_num op=(Multiplication|Division) asrt_num  #quantMultiplyDivideExpression
    | asrt_num op=(Addition|Subtraction) asrt_num   #quantAdditionSubtractionExpression
    | '(' asrt_num ')' #quantBracketsExpression
    | Subtraction? PHRASE_NUM #quantOnly
    | Subtraction? FORGE_VAR #quantIdentifierOnly
    ;

asrt_eval
    : '(' asrt_bool ')'
    ;

forge_if
    : 'test' asrt_eval phrase_blk (else_forge_if)* (forge_else)? 'forge-test'
    ;

else_forge_if
    : 'routeTest' asrt_eval phrase_blk 'forge-routeTest'
    ;

forge_else
    : 'route' phrase_blk 'forge-route'
    ;

forge_while
    : 'while' asrt_eval phrase_blk 'forge-while'
    ;

echo_forge
    : 'reveal' '(' (PHRASE_NUM|PHRASE_BOOL|FORGE_VAR|asrt_num|asrt_bool|PHRASE_STR) ')'
    | 'reveal' '(' PHRASE_STR ',' (FORGE_VAR|PHRASE_BOOL|PHRASE_STR|PHRASE_NUM) ')'
    ;

forge_enh
    : 'for' FORGE_VAR 'in' 'the' 'range' '(' forgeRange ';;' forgeRange ')' phrase_blk 'forge-for'
    ;

forgeRange
	: FORGE_VAR| PHRASE_NUM
	;

forge_loop
    : 'for' '(' forge_asrt  ';;' asrt_bool ';;'  forge_var ')' phrase_blk 'forge-for'
    ;

forge_var : inc_asrt| dec_asrt|FORGE_VAR EQT asrt_num;

dec_asrt : FORGE_VAR '--'| '--' FORGE_VAR;
inc_asrt : FORGE_VAR '++'| '++' FORGE_VAR;

asrt_tern
    : asrt_eval '??' asrts '::' asrts
    | asrt_eval '??' PHRASE_BOOL '::' PHRASE_BOOL
    | asrt_eval '??' PHRASE_STR '::' PHRASE_STR
    ;


PHRASE_NUM
	: [1-9] [0-9]*
	| '0'
	;

PHRASE_BOOL
	: 'on'
	| 'off'
	;

Addition            : '+';
Subtraction         : '-';
Multiplication      : '*';
Division            : '/';
Logical_AND         : '$&';
Logical_OR          : '$|';
LesserThan          : '$<';
GreaterThan         : '$>';
LesserThanOrEqualTo : '$<=';
GreaterThanOrEqualTo: '$>=';
NotEqualTo          : '$!=';
EqualTo             : '$==';

FORGE_VAR
	: [a-zA-Z_] [a-zA-Z_0-9]*
    ;

PHRASE_STR
    : '@' [a-zA-Z0-9_]* '@'
    ;

EQT   : '->';

FORGE_SPACES    : [ \t\r\n]+ -> skip;
FORGE_COMMENT : ('%^%' ~[\r\n]* | '%^%' .*? '%^%') -> skip;
