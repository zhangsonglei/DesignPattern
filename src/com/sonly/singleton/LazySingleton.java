package com.sonly.singleton;

/**
 *<ul>
 *<li>Description: 懒汉式，线程安全 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月11日
 *</ul>
 */
public class LazySingleton {
	/**
     * 类加载时并没初始化, 延迟加载
     */
    private static LazySingleton instance;

    private LazySingleton() {
    }

    /**
     * 注意synchronized, 线程安全
     */
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "LazySingleton{}";
    }
}
