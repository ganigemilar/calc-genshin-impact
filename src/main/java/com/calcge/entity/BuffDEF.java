package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffDEF extends Buff<FlatValue> {

	public BuffDEF(Double value) {
		super(BuffType.DEF, new FlatValue(value));
	}
}
