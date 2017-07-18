package com.sonly.iterator.black;

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
		return new ConcreteIterator();
	}
	
	private class ConcreteIterator implements Iterator {
	
		//内部索引，记录当前迭代到的索引位置  
		private int index = 0;  
		//记录当前聚集对象的大小  
		private int size = 0;  
		
		public ConcreteIterator() {
			this.index = 0;
			this.size = array.length;
		}
		
		@Override
		public void first() {
			index = 0;
		}

		@Override
		public void next() {
			if(index < size)
				index++;
		}

		@Override
		public boolean isDone() {
			return index >= size;
		}

		@Override
		public Object currentItem() {
			return array[index];
		}
		
	}
}
