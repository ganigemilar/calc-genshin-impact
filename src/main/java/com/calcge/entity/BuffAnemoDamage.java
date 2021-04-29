package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffAnemoDamage extends Buff<PercentageValue> {

	public BuffAnemoDamage(Double value) {
		super(BuffType.ANEMO_BONUS_DAMAGE, new PercentageValue(value));
	}
}
