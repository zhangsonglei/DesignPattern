package com.sonly.templatemethod;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		ChangePasswordBusiness cpb = new ChangePasswordBusiness();
		cpb.run();
		
		CheckOutBusiness cob = new CheckOutBusiness();
		cob.run();
	}

}
