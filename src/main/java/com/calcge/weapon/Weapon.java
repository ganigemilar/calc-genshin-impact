package com.calcge.weapon;

import com.calcge.constant.WeaponType;
import com.calcge.entity.Buff;

public class Weapon {
	private String name;
	
	private Integer star;
	
	private WeaponType weaponType;
	
	private WeaponStats<Buff<?>> stats;

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

	public WeaponType getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	public WeaponStats<Buff<?>> getStats() {
		return stats;
	}

	public void setStats(WeaponStats<Buff<?>> stats) {
		this.stats = stats;
	}
}
