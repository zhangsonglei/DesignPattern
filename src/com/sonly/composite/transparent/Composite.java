package com.sonly.composite.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 *<ul>
 *<li>Description: 实现了组件接口的组合类 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年7月14日
 *</ul>
 */
public class Composite extends Component{

	/**
     * 用来存储组合对象中包含的子组件对象
     */
	private List<Component> childComponent = new ArrayList<>();
	
	/**
	 * 组合对象的名称
	 */
	private String name;
	
	
	public Composite(String name) {
		this.name = name;
	}
	
	/**
	 * <li>聚集管理方法，增加一个子构件对象  
	 * @param component 子构建对象
	 */
	public void addChild(Component component) {
		childComponent.add(component);
	}
	
	/**
	 * <li>聚集管理方法，删除一个子构件对象 
	 * @param index 子构建对象的下标
	 */
	public void removeChild(int index) {
		childComponent.remove(index);
	}
	
	/**
	 * <li> 聚集管理方法，返回所有子构件对象 
	 * @return 所有子构件对象 
	 */
	public List<Component> getChild() {
		return childComponent;
	}
	
	
	/**
     * 输出对象的自身结构
     * @param preStr 前缀，主要是按照层级拼接空格，实现向后缩进
     */
	@Override
	public void printStruct(String preStr) {
		System.out.println(preStr + "+" + name);
		
		if(childComponent != null){
			preStr += "  ";
			for(Component component : childComponent)
				component.printStruct(preStr);
		}
	}
}
