package com.gurukul.dataStructureStack;

import java.util.Stack;

class Baseball {
    int ans;

    int Records(String[] arr) {
	Stack<String> s = new Stack<>();
	int ans = 0;
	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] == "C") {
		ans -= Integer.parseInt(s.pop());
	    } else if (arr[i] == "D") {
		int sum = Integer.parseInt(s.peek()) * 2;
		ans += sum;
		s.push("" + sum);
	    } else if (arr[i] == "+") {
		String a = s.pop();
		String b = s.peek();
		int sum = (Integer.parseInt(b) + Integer.parseInt(a));
		s.push(a);
		s.push("" + sum);
		ans += sum;
	    } else {
		s.push(arr[i]);
		ans += Integer.parseInt(arr[i]);
	    }
	}
	return ans;
    }
}

public class BaseballRecord {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Baseball b = new Baseball();
	String[] arr = { "5", "-2", "4", "C", "D", "9", "+", "+" };
	int sum = b.Records(arr);
	System.out.print(sum);

    }

}
