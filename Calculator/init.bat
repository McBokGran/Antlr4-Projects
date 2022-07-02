PATH=%PATH%;"C:\Program Files\Java\jdk-16\bin"
SET CLASSPATH=%CLASSPATH%;obj;antlr-4.9.2-complete.jar

doskey a3=java org.antlr.v4.Tool -no-listener -visitor LabeledExpr.g4 -o gen
doskey jc1=javac gen\LabeledExpr*.java Calc.java  -d obj
doskey run=java Calc $L t.txt

doskey clean=del /Q gen\* obj\*

