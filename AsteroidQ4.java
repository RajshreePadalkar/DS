package com.gurukul.dataStructureStack;

import java.util.Stack;

class Asteroid {
    public void asteroidExplode(int[] arr) {
	Stack<Integer> s = new Stack<Integer>();

	for (int i = 0; i < arr.length; i++) {
	    if (s.isEmpty()) {
		s.push(arr[i]);
	    } else {
		if ((arr[i] < 0) && (s.peek() >= 0) || (arr[i] >= 0 && s.peek() < 0)) {
		    if (Math.abs(arr[i]) > Math.abs(s.peek())) {
			s.pop();
			s.push(arr[i]);
		    } else if (Math.abs(arr[i]) == Math.abs(s.peek())) {
			s.pop();
		    }
		} else {
		    if (arr[i] > s.peek()) {
			s.push(arr[i]);

		    }
		}
	    }
	}

	for (int num : s) {
	    System.out.print(num + " ");
	}

    }
}

public class AsteroidQ4 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Asteroid a = new Asteroid();
	int[] arr = { 5, 10, -5 };
	a.asteroidExplode(arr);
    }

}
