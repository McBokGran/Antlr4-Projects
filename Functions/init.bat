PATH=%PATH%;"C:\Program Files\Java\jdk-16\bin"
SET CLASSPATH=%CLASSPATH%;obj;antlr-4.9.2-complete.jar

doskey a4=java org.antlr.v4.Tool -visitor LabeledExpr.g4 -o gen
doskey jc=javac gen\LabeledExpr*.java Main.java -d obj
doskey grun=java org.antlr.v4.gui.TestRig LabeledExpr parse -gui test.txt

doskey clean=del /Q gen\* obj\*

