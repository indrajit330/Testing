package shopping;

import org.testng.annotations.Test;

public class CustomerProduct {
	@Test(groups = "seller_update")
	public void search() {
		System.out.println("search");
	}

	@Test
	public void addToWishList() {
		System.out.println("wishlist");
	}

	@Test(groups = {"pay_update","seller_update"})
	public void addToCart() {
		System.out.println("add to cart");
	}

	@Test
	public void manageCart() {
		System.out.println("manage cart");
	}
}
