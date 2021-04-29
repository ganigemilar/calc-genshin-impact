package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffHydroDamage extends Buff<PercentageValue> {

	public BuffHydroDamage(Double value) {
		super(BuffType.HYDRO_BONUS_DAMAGE, new PercentageValue(value));
	}
}
