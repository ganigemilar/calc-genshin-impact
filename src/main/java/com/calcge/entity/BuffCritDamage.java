package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffCritDamage extends Buff<PercentageValue> {

	public BuffCritDamage(Double value) {
		super(BuffType.CRIT_DAMAGE, new PercentageValue(value));
	}
}
