package com.sonly.composite.transparent;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		Component root = new Composite("服装");
		Component c1 = new Composite("男装");
		Component c2 = new Composite("女装");
        
		Component leaf1 = new Leaf("衬衫");
		Component leaf2 = new Leaf("夹克");
		Component leaf3 = new Leaf("裙子");
		Component leaf4 = new Leaf("套装");
        
        root.addChild(c1);
        root.addChild(c2);
        
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c1.addChild(leaf4);
        c2.addChild(leaf1);
        c2.addChild(leaf3);
        c2.addChild(leaf4);
        
        root.printStruct("");
	}
}
