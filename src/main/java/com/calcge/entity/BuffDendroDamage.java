package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffDendroDamage extends Buff<PercentageValue> {

	public BuffDendroDamage(Double value) {
		super(BuffType.DENDRO_BONUS_DAMAGE, new PercentageValue(value));
	}
}
