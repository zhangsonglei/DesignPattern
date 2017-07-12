package com.sonly.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 *<ul>
 *<li>Description: 该羊支持克隆
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月12日
 *</ul>
 */
public class Sheep implements Cloneable, Serializable{
	
	/**
	 * 默认序列号
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	private Date birthday;
	
	private SerializableObject obj;
	
	public Sheep() {
		
	}
	
	public Sheep(String name, Date birthday) {
		this.name = name;
		this.birthday = birthday;
 	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
	}
	
	/**
	 * 浅复制
	 */
	@Override
	protected Sheep clone() throws CloneNotSupportedException {
		return (Sheep) super.clone();
	}
	
	/**
	 * 深复制，需要系列化
	 * @throws ClassNotFoundException 
	 */
	protected Sheep deepClone() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		return (Sheep) ois.readObject();
	}
}

class SerializableObject {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
}