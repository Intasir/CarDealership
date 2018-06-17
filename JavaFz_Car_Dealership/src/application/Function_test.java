package application;

import static org.junit.Assert.*;

import org.junit.Test;

public class Function_test {

	@Test
	public void test() {
	Price_Management price=new Price_Management();
	int p=price.carManagement("   Crossover  ");
	int q=price.carType(p, "  Maruti Suzuki S-Cross    ");
	assertEquals(14000,q);
	}
	

}
