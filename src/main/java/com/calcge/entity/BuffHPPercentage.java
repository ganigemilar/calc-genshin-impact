package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffHPPercentage extends Buff<PercentageValue> {
	
	public BuffHPPercentage(Double value) {
		super(BuffType.HP_PERCENTAGE, new PercentageValue(value));
	}
}
