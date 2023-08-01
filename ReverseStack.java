package com.gurukul.dataStructureStack;

import java.util.Stack;

class Reverse {
    String x;
    String y = "";

    Reverse(String x) {
	this.x = x;
    }

    public boolean ReverseXY() {
	Stack<Character> s = new Stack<Character>();
	int i = 0;
	while (x.charAt(i) != 'C') {
	    char ch = x.charAt(i);
	    s.push(ch);
	    i++;
	}
	for (int k = i + 1; k < x.length(); k++) {
	    char compare = s.pop();
	    if (x.charAt(k) != compare)
		return false;
	}

	return true;

    }
}

public class ReverseStack {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Reverse r = new Reverse("ABBABACABABBA");
	if (r.ReverseXY())
	    System.out.println("Reverse " + "TRUE");
	else
	    System.out.print("not Reverse" + "FALSE");

    }

}
