package com.calcge.character;

import com.calcge.constant.ElementalType;
import com.calcge.constant.WeaponType;

public class Character {
	private String name;
	
	private Integer star;
	
	private ElementalType elementalType;
	
	private WeaponType weaponType;
	
	private CharacterStats characterStats;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStar() {
		return star;
	}

	public void setStar(Integer star) {
		this.star = star;
	}

	public ElementalType getElementalType() {
		return elementalType;
	}

	public void setElementalType(ElementalType elementalType) {
		this.elementalType = elementalType;
	}

	public WeaponType getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	public CharacterStats getCharacterStats() {
		return characterStats;
	}

	public void setCharacterStats(CharacterStats characterStats) {
		this.characterStats = characterStats;
	}
}
