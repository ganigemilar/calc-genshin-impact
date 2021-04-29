package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffPyroDamage extends Buff<PercentageValue> {

	public BuffPyroDamage(Double value) {
		super(BuffType.PYRO_BONUS_DAMAGE, new PercentageValue(value));
	}
}
