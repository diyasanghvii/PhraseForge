## SER502-Spring2023-Team13
## PhraseForge ⚒️

A imperative programming language.

### That's cool. How did we do this?
- First we thought about our unique language idea.
- Then, we selected our reserved keywords and imagined the flow of command.
- We then created the grammer in EBNF format.
- Next, we set up the java maven environment and injected ANTLR dependency after concluding it would be most optimal for Parser and Parse tree generation for our language.
- After that we created a Compiler that visits the parser tree and generates intermediate code (3-4 word instruction format).
- Then we created an Interpreter using Java to make sense of the intermediate code, carry out the instructions and display the desired output.

### Requirements to use PhraseForge

- Intellij IDEA Community Version
- GitHub
- JDK installed in your system
- Antlr v4
- Windows or Mac OS

### We Got Everything Covered For You
- Datatypes : integer (quant), boolean (logic), string (phrase)
- Assignment Operator `->`
- Logical Operators : AND `$&` , OR `&|`, NOT `&!`
- Arithmetic Operators : `+`, `-`, `*`, `/`
- Comparision Operators : `$>`, `$<`, `$>=`, `$<=`, `$==`, `$!=`
- Ternary Operator : (exp)??asrt1::asrt2
- Iteration Blocks : while, for, for in the range (enhanced for loop)
- Condition Blocks : test, routTest, route
- Comments : `%^%` comment `%^%`
- Standard Output : reveal(var)
- Symbols Support : `;;`, `{`, `}`,`(`, `)`, `??`, `::`
- Identifiers : Starts with digit or alphabet followed by combination of digits, underscore and alphabets.
- Keywords : quant, logic, phrase, reveal, test, route, routeTest, forge-test, forge-route, forge-routeTest, while, forge-while, for, forge-for, on, off, pf_launch, pf_abort.

## Do you want to try out our new language ?

### Follow these simple steps :

### Step 1 : Downloading the language using GitHub
- Go to https://github.com/adamshoaib/SER502-Spring2023-Team13.
- Make sure you are on the "main" branch.
- Click on the "<> Code" button and copy the HTTPS URL.
- Open your terminal.
- Navigate to the directory where you want the code to be downloaded.
- Run the command - git clone <PASTE THE HTTPS URL HERE>.
- Open the downloaded file in Intellij.

NOTE : Feel free to contribute to our projects if you have
improvements/suggestions. Please do not push anything to the main branch. You can create a new branch from "main" and create pull request to the "development" branch. Feel free to contact us if you have any suggestions.

### Step 2 : Instructions to Build the language

To prepare for this Maven project, you need to install Maven and allow all dependencies to be resolved.

    1. Find and execute Maven to clean and install the project.
    2. The Java class responsible for compiling and producing intermediate code is called "Compiler".
    3. "RMain" is the Java class responsible for interpreting and generating the final output of the code.
    4. For our purposes, we will use "Integrator" as the main class that runs both Compiler and RMain. It contains the main method.
    5. If using a different pom.xml file then add this : 
        <dependencies>
            <!-- https://mvnrepository.com/artifact/org.antlr/antlr4-runtime -->
            <dependency>
                <groupId>org.antlr</groupId>
                <artifactId>antlr4</artifactId>
                <version>4.12.0</version>
            </dependency>
        </dependencies>
### Step 3 : Building the Project jar

There is already an existing Jar file in the repo that you can use to execute your code. In case you encounter difficulties using it and require a new one, you can follow these steps.

    1. Go to File and click on Project Structure (Ctrl+Alt+Shift+S).
    2. Select Artifacts and click on the plus sign (+) icon (Alt+Insert).
    3. Choose JAR, then select "From module with dependencies."
    4. Locate the Main Class, which is "integrator.Integrator."
    5. Click OK and close the window.
    6. Select Build and then click on Build Artifacts.
    7. After the build process is complete, a JAR file should be created in the "out/artifacts/PhraseForge_jar" directory. This is the JAR file for the project, and you can rename it as desired.


### Step 4 : Running your own PhraseForge Program

    1. To execute the program through IntelliJ, follow these steps:
      - Run Maven Clean and Install for the project once.
      - Right-click Integrator and select Modify Run Configuration.
      - Leave everything as is, but in the Program Arguments field, enter the file path of your PhraseForge file (.prage), and then click OK.
      - You can now run your .prage file and see the output on the console.
      - Keep in mind that intermediate code (.pra) and output file (.pge) will be created in the same directory as your (.prage) file.
    
    2. To execute the program using the JAR file:

      - Navigate to the directory where the project jar is located in the terminal.
      - Write your PhraseForge code and save it with a .prage extension, for example, "MyFirstProgram.prage".
      - Open a command prompt or terminal in the directory where your project jar is located. (This can also be done using IntelliJ Terminal).
      - Note that the you must specify its MyFirstProgram.prage file's absolute path in the command prompt or it should be located in the same folder as the project jar.


### Step 5 : Run a PhraseForge File using CMD prompt:

        java -jar <projectjarname>.jar <absolutePathOfProgram>\<ProgramName>.prage



