package com.calcge.character;

public class CharacterStats {
	private BaseStats baseStats;
	
	private AdvancedStats advancedStats;
	
	private ElementalTypeStats elementalTypeStats;

	public BaseStats getBaseStats() {
		return baseStats;
	}

	public void setBaseStats(BaseStats baseStats) {
		this.baseStats = baseStats;
	}

	public AdvancedStats getAdvancedStats() {
		return advancedStats;
	}

	public void setAdvancedStats(AdvancedStats advancedStats) {
		this.advancedStats = advancedStats;
	}

	public ElementalTypeStats getElementalTypeStats() {
		return elementalTypeStats;
	}

	public void setElementalTypeStats(ElementalTypeStats elementalTypeStats) {
		this.elementalTypeStats = elementalTypeStats;
	}
}
