package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffEnergyRecharge extends Buff<PercentageValue> {
	
	public BuffEnergyRecharge(Double value) {
		super(BuffType.ENERGY_RECHARGE, new PercentageValue(value));
	}
}
