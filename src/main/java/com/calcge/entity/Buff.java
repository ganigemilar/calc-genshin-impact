package com.calcge.entity;

import com.calcge.constant.BuffType;

public abstract class Buff<V extends Value> {
	private BuffType buffType;
	
	private V value;

	public Buff(BuffType buffType, V value) {
		this.buffType = buffType;
		this.value = value;
	}

	public BuffType getBuffType() {
		return buffType;
	}

	public void setBuffType(BuffType buffType) {
		this.buffType = buffType;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}
