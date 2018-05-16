package com.cts.inheritance;

public class Parent {
	protected int i = 98;

	protected Parent() {

	}

	protected void name() {
		System.out.println("hello Nirmal");
	}

}

class Child extends Parent {
	void methodsOfParent() {
		System.out.println(i);
		new Parent().name();
	}
}
