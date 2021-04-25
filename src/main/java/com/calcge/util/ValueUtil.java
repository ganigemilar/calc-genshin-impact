package com.calcge.util;

import com.calcge.entity.FlatValue;
import com.calcge.entity.PercentageValue;

public class ValueUtil {
	public static PercentageValue assignPercentage(Double value) {
		return new PercentageValue(value);
	}
	
	public static FlatValue assignFlat(Double value) {
		return new FlatValue(value);
	}
}
