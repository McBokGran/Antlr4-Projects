import gen.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    private static class MyVisitor extends Z3GrammarBaseVisitor<Integer>{
        @Override
        public Integer visitStart(Z3GrammarParser.StartContext ctx) {
            ArrayList<ArrayList<Integer> > sudoku = new ArrayList<ArrayList<Integer> >();
            for (int i = 0; i < 9; i++){
                sudoku.add(new ArrayList<Integer>());
            }

            for (ArrayList<Integer> list : sudoku){
                for (int i = 0; i < 9; i++){
                    list.add(null);
                }
            }

            for (Z3GrammarParser.DefinefunContext definefun : ctx.definefun()){
                System.out.println(definefun.BOX().toString() + "=" + definefun.INT().toString());

                int column = Integer.parseInt(definefun.BOX().toString().substring(1, 2));
                int row = Integer.parseInt(definefun.BOX().toString().substring(2, 3));
                int answer = Integer.parseInt(definefun.INT().toString());
                sudoku.get(row - 1).set(column - 1, answer);
            }

            for (ArrayList<Integer> row : sudoku){
                System.out.println(row);
            }
            return 0;
        }
    }

    public static void main(String[] args) throws Exception {
        String fileName = "input.txt";
        File file = new File(fileName);
        FileInputStream fis = null;
        fis = new FileInputStream(file);
        ANTLRInputStream input = new ANTLRInputStream(fis);
        Z3GrammarLexer lexer = new Z3GrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Z3GrammarParser parser = new Z3GrammarParser(tokens);
        ParseTree tree = parser.start();
        Z3GrammarVisitor<Integer> visitor = new MyVisitor();

        visitor.visit(tree);
    }
}