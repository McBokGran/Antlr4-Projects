
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Stack;
import java.lang.Math;
import java.util.HashMap;
import java.util.Map;


public class Calc {	
private static class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
    
    Map<String, Integer> memory = new HashMap<String, Integer>();

    
    @Override
    public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
        String id = ctx.ID().getText();  // id is left-hand side of '='
        int value = visit(ctx.expr());   // compute value of expression on right
        memory.put(id, value);           // store it in our memory
        return value;
    }

    
    @Override
    public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expr()); // evaluate the expr child
        System.out.println(value);         // print the result
        return 0;                          // return dummy value
    }

    
    @Override
    public Integer visitInt(LabeledExprParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

 
    @Override
    public Integer visitId(LabeledExprParser.IdContext ctx) {
        String id = ctx.ID().getText();
		int result=0;
		
        while ( memory.containsKey(id) ){
			
			result= memory.get(id);
			break;
			
		}
        return result;
    }
	
	 @Override
    public Integer visitExp(LabeledExprParser.ExpContext ctx) {
        int left = visit(ctx.expr(0));  
        int right = visit(ctx.expr(1)); 
		return (int)Math.pow(left,right);
       
    }

    @Override
    public Integer visitFact(LabeledExprParser.FactContext ctx) {
		//int left = visit(ctx.expr(0));  
        int right = visit(ctx.expr()); 
		int result = 0;
			   int fact = 1;
			 
			   for(int i=1;i<=right;i++){    
						fact=fact*i;    
				}    
				
                result = fact;
				
		return result;
       
    }
	
    @Override
    public Integer visitMul(LabeledExprParser.MulContext ctx) {
        int left = visit(ctx.expr(0));  
        int right = visit(ctx.expr(1)); 
		return left * right;
       
    }
	
	 @Override
    public Integer visitDiv(LabeledExprParser.DivContext ctx) {
        int left = visit(ctx.expr(0));  
        int right = visit(ctx.expr(1)); 
      
        return left / right; 
    }

    
    @Override
    public Integer visitAdd(LabeledExprParser.AddContext ctx) {
        int left = visit(ctx.expr(0));  
        int right = visit(ctx.expr(1)); 
        return left + right;
      
    }
	 @Override
    public Integer visitSub(LabeledExprParser.SubContext ctx) {
        int left = visit(ctx.expr(0));  
        int right = visit(ctx.expr(1)); 
        
        return left - right; 
    }


    @Override
    public Integer visitParens(LabeledExprParser.ParensContext ctx) {
        return visit(ctx.expr()); 
    }
}

    public static void main(String[] args) throws Exception {
       String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        LabeledExprLexer lexer = new LabeledExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExprParser parser = new LabeledExprParser(tokens);
        ParseTree tree = parser.prog(); // parse

        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);

    }
}
