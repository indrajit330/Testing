package shopping;

import org.testng.annotations.Test;

public class Seller {
	@Test
	public void CA() {
		System.out.println("create account");
	}

	@Test(groups = "seller_update")
	public void login() {
		System.out.println("login");
	}

	@Test
	public void profile() {

		System.out.println("profile");
	}

	@Test
	public void changePass() {
		System.out.println("change password");
	}

	@Test
	public void logout() {
		System.out.println("logout");
	}
}
