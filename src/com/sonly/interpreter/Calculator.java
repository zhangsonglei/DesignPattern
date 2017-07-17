package com.sonly.interpreter;

import java.util.Map;
import java.util.Stack;

public class Calculator {
	Expression expression;
	
	public Calculator(String expStr) {
		char[] chs = expStr.toCharArray();
		expression = null;

        //栈，用来暂存中间结果
        Stack<Expression> stkExp = new Stack<>();

        Expression left  = null;
        Expression right = null;

        /*从左到向分析表达式（如:a+b-c)，最终的语法树如下：
         *           -
         *         /   \
         *       +     c
         *     /   \
         *    a     b
        */
        for(int i = 0; i< chs.length; i++) {
            switch(chs[i]) {
            case '+':  //加法
                //1.先从栈中取出左操作数
                left = stkExp.peek();
                stkExp.pop();

                //2.从表达式中取出+号后面的右操作数，并生成终结符解析对象
                right = new VarExpression(expStr.substring(i + 1, i + 2));
                i++;
                //3.将左右操作数相加，并把结果放入栈中
                stkExp.push(new AddExpression(left, right));

                break;

            case '-':
                //1.先从栈中取出左操作数
                left = stkExp.peek();
                stkExp.pop();

                //2.从表达式中取出+号后面的右操作数，并生成终结符解析对象
                right = new VarExpression(expStr.substring(i + 1, i + 2));
                i++;
                //3.将左右操作数相减，并把结果放入栈中
                stkExp.push(new SubExpression(left, right));

                break;

            default:
                //如果是变量（终结符）：如a+b+c中的a\b\c，
                //则直接生成对应的变量解析器对象
                stkExp.push(new VarExpression(expStr.substring(i, i + 1)));
            }
        }

        //栈中保存的就是最终语法树的根结点（本例为SuuExpression对象）
        if(!stkExp.empty()) {
            expression = stkExp.peek();
            stkExp.pop();
        }
	}
	
	void deltree(Expression expression)
    {
        SymbolExpression branch = (SymbolExpression)expression;
        //叶子结点
        if (branch == null)
            expression = null;
        else { //分支结点
            //左子树
            deltree(branch.getLeft());
            //右子树
            deltree(branch.getRight());
            //结点
            expression = null;
        }
    }

    //开始运算
    int run(Map<String, Integer> var) {
        return (expression == null) ? 0 : expression.interpreter(var);
    }
}
