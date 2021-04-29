package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffHP extends Buff<FlatValue> {

	public BuffHP(Double value) {
		super(BuffType.HP, new FlatValue(value));
	}
}
