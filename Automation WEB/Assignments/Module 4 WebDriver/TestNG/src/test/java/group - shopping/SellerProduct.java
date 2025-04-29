package shopping;

import org.testng.annotations.Test;

public class SellerProduct {
	@Test
	public void upload() {
		System.out.println("upload");
	}
	@Test(groups = "seller_update")
	public void manage() {
		System.out.println("manage");
	}
	@Test
	public void remove() {
		System.out.println("remove");
	}
}
