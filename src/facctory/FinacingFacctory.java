package facctory;

import entities.Financing;

public class FinacingFacctory {

	
	public static Financing create(double a, double b, int c) {
		return new Financing(a, b, c);
	}
}
