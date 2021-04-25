package com.calcge.character;

import com.calcge.entity.FlatValue;

public class BaseStats {
	private FlatValue maxHP;
	
	private FlatValue atk;
	
	private FlatValue def;
	
	private FlatValue elementalMastery;
	
	private FlatValue maxStamina;

	public FlatValue getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(FlatValue maxHP) {
		this.maxHP = maxHP;
	}

	public FlatValue getAtk() {
		return atk;
	}

	public void setAtk(FlatValue atk) {
		this.atk = atk;
	}

	public FlatValue getDef() {
		return def;
	}

	public void setDef(FlatValue def) {
		this.def = def;
	}

	public FlatValue getElementalMastery() {
		return elementalMastery;
	}

	public void setElementalMastery(FlatValue elementalMastery) {
		this.elementalMastery = elementalMastery;
	}

	public FlatValue getMaxStamina() {
		return maxStamina;
	}

	public void setMaxStamina(FlatValue maxStamina) {
		this.maxStamina = maxStamina;
	}
}
