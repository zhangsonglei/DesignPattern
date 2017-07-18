package com.sonly.iterator.white;

public class ConcreteAggregate extends Aggregate {

	private Object[] array = null;
	
	/** 
	 * 构造方法，传入聚合对象的具体内容 
	 */  
	public ConcreteAggregate(Object[] array) {
		this.array = array;
	}
	
	
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	
	/** 
	 * 取值方法：向外界提供聚集元素 
	 */  
	public Object getIterm(int index) {
		if(index < array.length)
			return array[index];
		else
			return null;
	}
	
	/** 
     * 取值方法：向外界提供聚集的大小 
     */  
	public int size() {
		return array.length;
	}
}
