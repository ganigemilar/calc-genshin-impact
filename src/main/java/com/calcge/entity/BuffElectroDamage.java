package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffElectroDamage extends Buff<PercentageValue> {

	public BuffElectroDamage(Double value) {
		super(BuffType.ELECTRO_BONUS_DAMAGE, new PercentageValue(value));
	}
}
