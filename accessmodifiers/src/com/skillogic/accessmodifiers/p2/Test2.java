package com.skillogic.accessmodifiers.p2;
import com.skillogic.accessmodifiers.p1.Test;
public class Test2 extends Test{
	public void m2() {
		System.out.println(id);
		m1();
	}
	public static void main(String[] args) {
	}
}
