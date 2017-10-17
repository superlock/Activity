package com.activity.Calculator.operation;

import com.activity.Calculator.Operations;

public class Addition implements Operations {

	@Override
	public int compute(int x, int y) {
		return x + y;
	}

}
