package com.gurukul.dataStructureStack;

import java.util.Stack;

class PostExpression {
    String exp;

    PostExpression(String exp) {
	this.exp = exp;
    }

    String converPostfix() {
	String infix = "";
	Stack<String> s = new Stack<>();

	for (int i = 0; i < exp.length(); i++) {
	    char ch = exp.charAt(i);
	    if (Character.isLetter(ch)) {
		s.push("" + ch);
	    } else {
		String temp1 = s.pop();
		String temp2 = s.pop();
		infix = "(" + temp2 + ch + temp1 + ")";
		s.push(infix);
	    }

	}
	return infix;
    }

}

public class Infix {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	PostExpression p = new PostExpression("abc*de/-fg*/+");

	System.out.println(p.converPostfix());
    }

}
