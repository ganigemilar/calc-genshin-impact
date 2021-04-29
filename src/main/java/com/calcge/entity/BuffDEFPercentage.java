package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffDEFPercentage extends Buff<PercentageValue> {
	
	public BuffDEFPercentage(Double value) {
		super(BuffType.DEF_PERCENTAGE, new PercentageValue(value));
	}
}
