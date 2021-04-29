package com.calcge.weapon;

import com.calcge.entity.Buff;
import com.calcge.entity.BuffATK;

public class WeaponStats<E extends Buff<?>> {
	private BuffATK baseAtk;
	
	private E subStats;

	public BuffATK getBaseAtk() {
		return baseAtk;
	}

	public void setBaseAtk(BuffATK baseAtk) {
		this.baseAtk = baseAtk;
	}

	public E getSubStats() {
		return subStats;
	}

	public void setSubStats(E subStats) {
		this.subStats = subStats;
	}
}
