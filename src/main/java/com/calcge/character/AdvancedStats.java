package com.calcge.character;

import com.calcge.entity.PercentageValue;

public class AdvancedStats {
	private PercentageValue critRate;
	
	private PercentageValue critDamage;
	
	private PercentageValue healingBonus;
	
	private PercentageValue incomingHealingBonus;
	
	private PercentageValue energyRecharge;
	
	private PercentageValue powerfulShield;

	public PercentageValue getCritRate() {
		return critRate;
	}

	public void setCritRate(PercentageValue critRate) {
		this.critRate = critRate;
	}

	public PercentageValue getCritDamage() {
		return critDamage;
	}

	public void setCritDamage(PercentageValue critDamage) {
		this.critDamage = critDamage;
	}

	public PercentageValue getHealingBonus() {
		return healingBonus;
	}

	public void setHealingBonus(PercentageValue healingBonus) {
		this.healingBonus = healingBonus;
	}

	public PercentageValue getIncomingHealingBonus() {
		return incomingHealingBonus;
	}

	public void setIncomingHealingBonus(PercentageValue incomingHealingBonus) {
		this.incomingHealingBonus = incomingHealingBonus;
	}

	public PercentageValue getEnergyRecharge() {
		return energyRecharge;
	}

	public void setEnergyRecharge(PercentageValue energyRecharge) {
		this.energyRecharge = energyRecharge;
	}

	public PercentageValue getPowerfulShield() {
		return powerfulShield;
	}

	public void setPowerfulShield(PercentageValue powerfulShield) {
		this.powerfulShield = powerfulShield;
	}
}
