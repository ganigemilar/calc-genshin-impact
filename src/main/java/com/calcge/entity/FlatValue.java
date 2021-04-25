package com.calcge.entity;

import com.calcge.constant.ValueType;

public class FlatValue extends Value {
	
	public FlatValue(Double value) {
		super(ValueType.FLAT, value);
	}
}
