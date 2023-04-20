grammar PhraseForge;

forge_pgm
	: 'pf_launch' phrase_blk 'pf_abort'
	;

phrase_blk
	: '{' forge_cmd+ '}'
	;

forge_cmd
	: (forge_if|forge_while|echo_forge|forge_asrt)
	;

forge_asrt
	: 'quant' FORGE_VAR (EQT asrt_num)?
	| 'logic' FORGE_VAR (EQT asrt_bool)?
	| 'phrase' FORGE_VAR (EQT PHRASE_STR)?
	| FORGE_VAR EQT asrt_num
	| FORGE_VAR EQT asrt_bool
    ;

asrt_bool
    : asrt_bool op=(Logical_AND|Logical_OR) asrt_bool
    | asrt_bool op=(EqualTo|NotEqualTo ) asrt_bool
    | comp_expr
    | '(' asrt_bool ')'
    | PHRASE_BOOL
    | FORGE_VAR
    ;

comp_expr
    : asrt_num op=(GreaterThan|LesserThan|GreaterThanOrEqualTo|LesserThanOrEqualTo|EqualTo|NotEqualTo ) asrt_num
    ;

asrt_num
    : asrt_num op=(Multiplication|Division) asrt_num
    | asrt_num op=(Addition|Subtraction) asrt_num
    | '(' asrt_num ')'
    | Subtraction? PHRASE_NUM
    | Subtraction? FORGE_VAR
    ;

asrt_cmp
    : '(' asrt_bool ')'
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