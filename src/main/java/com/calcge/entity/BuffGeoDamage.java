package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffGeoDamage extends Buff<PercentageValue> {

	public BuffGeoDamage(Double value) {
		super(BuffType.GEO_BONUS_DAMAGE, new PercentageValue(value));
	}
}
