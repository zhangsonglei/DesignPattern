package com.sonly.facade;

/**
 *<ul>
 *<li>Description: 中介类 Facade: 知道哪些子系统负责处理请求, 将客户的请求代理给适当的子系统对象: 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月14日
 *</ul>
 */
public class MediumFacade {

	private XihuApartment xihu;
	private XixiApartment xixi;
	private CuiyuanApartment cuiyuan;
	
	public MediumFacade() {
		xihu = new XihuApartment("西湖小区", 2500, 1);
		xixi = new XixiApartment("西溪小区", 2000, 1);
		cuiyuan = new CuiyuanApartment("翠园小区", 1000, 1);
	}
	
	public void rentHouse(double price) {
		// 价钱合适而且有房可组
		if (price >= xihu.getPrice() && xihu.getStatus() != 0) {
            System.out.println("预订" + xihu.getLocation());
            xihu.setStatus(0);
        }else if (price >= xixi.getPrice() && xixi.getStatus() != 0) {
            System.out.println("预订" + xixi.getLocation());
            xixi.setStatus(0);
        }else if (price >= cuiyuan.getPrice() && cuiyuan.getStatus() != 0) {
            System.out.println("预订" + cuiyuan.getLocation());
            cuiyuan.setStatus(0);
        }else {
            System.out.println("出价太低/没有房源 ...");
        }
	}
}
