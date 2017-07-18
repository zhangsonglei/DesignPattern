package com.sonly.mediator;

/**
 *<ul>
 *<li>Description: 具体中介者:
 *<li>了解并维护它的各个同事;
 *<li>通过协调各同事对象实现协作行为(从同事接收消息, 向具体同事发出命令). 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月18日
 *</ul>
 */
public class UnitedNationsSecurityCouncil extends UnitedNations{

	@Override
	protected void declare(Country country, String msg) {
		for(Country ctry : countries) {
			if(!ctry.equals(country)) {
				String name = country.getName();
				ctry.receive(name + ": " + msg);
			}
		}
		
	}

}
