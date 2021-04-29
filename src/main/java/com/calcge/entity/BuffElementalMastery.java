package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffElementalMastery extends Buff<PercentageValue> {
	
	public BuffElementalMastery(Double value) {
		super(BuffType.ELEMENTAL_MASTERY, new PercentageValue(value));
	}
}
