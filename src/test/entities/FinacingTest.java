package test.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import facctory.FinacingFacctory;

public class FinacingTest {

	
	@Test
	public void ConstructorShouldCreateObjectWithCorrectDataWhenDataIsValid() {
		Financing f2 =  FinacingFacctory.create(100000.0, 2000.0, 80);
		Assertions.assertNotNull(f2);
		
		Assertions.assertEquals(100000.0, f2.getTotalAmount());
		Assertions.assertEquals(2000.0, f2.getIncome());
		Assertions.assertEquals(80, f2.getMonths());
	}
	
	
	
	@Test 
	public void ConstructorShouldThrowIllegalArgumentExceptionWhenTheDataIsNotValid() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			Financing f1 =  FinacingFacctory.create(100000.0, 2000.0, 20);
		});
	}
	
	
	@Test
	public void setTotalAmountShouldUpdateThevalueWhenTheDataIsValid() {
		double expectedValue = 90000.0;
		Financing f2 =  FinacingFacctory.create(100000.0, 2000.0, 80);
		f2.setTotalAmount(90000.0);
		
		Assertions.assertEquals(expectedValue, f2.getTotalAmount());
		
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionwhenTheDataIsNotValid() {
		
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			Financing f2 =  FinacingFacctory.create(100000.0, 2000.0, 80);
			f2.setTotalAmount(110000.0);
		});
		
	}
	
	
	@Test
	public void setIncomeShouldUpdateThevalueWhenTheDataIsValid() {
		double expectedValue = 2100.0;
		Financing f2 =  FinacingFacctory.create(100000.0, 2000.0, 80);
		f2.setIncome(2100.0);
		
		Assertions.assertEquals(expectedValue, f2.getIncome());
		
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionwhenTheDataIsNotValid() {
		
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			Financing f2 =  FinacingFacctory.create(100000.0, 2000.0, 80);
			f2.setIncome(1000.0);
		});
		
	}
	
	@Test
	public void setMonthsShouldUpdateThevalueWhenTheDataIsValid() {
		int expectedValue = 100;
		Financing f2 =  FinacingFacctory.create(100000.0, 2000.0, 80);
		f2.setMonths(100);
		
		Assertions.assertEquals(expectedValue, f2.getMonths());
		
	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionwhenTheDataIsNotValid() {
		
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			Financing f2 =  FinacingFacctory.create(100000.0, 2000.0, 80);
			f2.setMonths(20);
		});
		
	}
	
	@Test
	public void entryShouldCorrectlyCalculateTheEntryValue() {
		double expectedValue = 20000.0;
		Financing f2 =  FinacingFacctory.create(100000.0, 2000.0, 80);
		double result = f2.entry();
		
		Assertions.assertEquals(expectedValue, result);
		
	}
	
	@Test
	public void contingentShouldCorrectlyCalculateTheInstallmentAmount() {
		double expectedValue = 1000.0;
		Financing f2 =  FinacingFacctory.create(100000.0, 2000.0, 80);
		double result = f2.quota();
		
		Assertions.assertEquals(expectedValue, result);
		
	}
	
}
