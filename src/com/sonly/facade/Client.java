package com.sonly.facade;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		MediumFacade mediumFacade = new MediumFacade();
		mediumFacade.rentHouse(2000);
		mediumFacade.rentHouse(2100);
		mediumFacade.rentHouse(2100);
	}

}
