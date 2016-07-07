package exercise.visibility.C;

import exercise.visibility.AB.A;

public class C {

	public A a;
	
	public C(){
		a = new A();
		System.out.println(a.b);
	}
}
