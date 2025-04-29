package shopping;

import org.testng.annotations.Test;

public class Payment {
	@Test
	public void COD() {
		System.out.println("COD");
	}

	@Test(groups = "pay_update")
	public void creditCard() {
		System.out.println("credit Card");
	}

	@Test
	public void debitCard() {
		System.out.println("debit Card");
	}

	@Test
	public void UPI() {
		System.out.println("UPI");
	}
}
