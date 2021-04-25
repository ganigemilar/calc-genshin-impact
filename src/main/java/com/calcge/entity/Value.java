package com.calcge.entity;

import com.calcge.constant.ValueType;

public class Value {
	private ValueType valueType;
	
	private Double value;
	
	public Value(ValueType valueType, Double value) {
		this.valueType = valueType;
		this.value = value;
	}
	
	public ValueType getValueType() {
		return valueType;
	}

	protected void setValueType(ValueType valueType) {
		this.valueType = valueType;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
