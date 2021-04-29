package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffCritRate extends Buff<PercentageValue> {

	public BuffCritRate(Double value) {
		super(BuffType.CRIT_RATE, new PercentageValue(value));
	}
}
