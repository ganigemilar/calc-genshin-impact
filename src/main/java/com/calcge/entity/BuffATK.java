package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffATK extends Buff<FlatValue> {

	public BuffATK(Double value) {
		super(BuffType.ATK, new FlatValue(value));
	}
}
