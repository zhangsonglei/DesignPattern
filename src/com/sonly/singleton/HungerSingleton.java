package com.sonly.singleton;

/**
 *<ul>
 *<li>Description:饿汉式
 *<li>问题: 如果只是加载本类, 而没有调用getInstance方法, 会造成资源浪费
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月11日
 *</ul>
 */
public class HungerSingleton {
	/**
     * 类初始化时理解初始化该实例
     * 类加载时, 天然的线程安全时刻
     */
    private static final HungerSingleton instance = new HungerSingleton();

    private HungerSingleton() {
    }

    /**
     * 方法没有同步(synchronized), 调用效率高
     */
    public static HungerSingleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "HungerSingleton{}";
    }
}
