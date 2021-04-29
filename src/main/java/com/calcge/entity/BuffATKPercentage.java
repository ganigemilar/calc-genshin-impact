package com.calcge.entity;

import com.calcge.constant.BuffType;

public class BuffATKPercentage extends Buff<PercentageValue> {
	
	public BuffATKPercentage(Double value) {
		super(BuffType.ATK_PERCENTAGE, new PercentageValue(value));
	}
}
