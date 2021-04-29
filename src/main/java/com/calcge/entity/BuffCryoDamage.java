package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffCryoDamage extends Buff<PercentageValue> {

	public BuffCryoDamage(Double value) {
		super(BuffType.CRYO_BONUS_DAMAGE, new PercentageValue(value));
	}
}
