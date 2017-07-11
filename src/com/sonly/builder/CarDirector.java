package com.sonly.builder;

/**
 *<ul>
 *<li>Description: 使用Director控制建造过程, 也用它来隔离用户与建造过程的关联: 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月11日
 *</ul>
 */
public class CarDirector {

	/**
	 * <li>确定一种稳定的构造过程  
	 * @param carBuilder
	 */
	public static void constructor(CarBuilder carBuilder) {
		carBuilder.buildEngine();
		
		carBuilder.buildSeat();
		
		carBuilder.buildTyre();
	}
}
