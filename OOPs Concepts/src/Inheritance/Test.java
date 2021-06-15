package Inheritance;

class A {
	int i;

	A(int i) {
		this.i = i;
	}

	void show1() {
		System.out.println("Show1 called with i value " + i);
	}
}

public class Test extends A {
	int i;

	Test(int i) {
		super(i + 10); // super keyword refers to parent class variable i
		this.i = i; // this keyword refers to current class inst. variable
	}

	void show(Test ObjParam) {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(ObjParam.i);
	}

	public static void main(String[] args) {
		Test t1 = new Test(10);
		Test t2 = new Test(20);

		t1.show(t1);
		t1.show(t2);
		t2.show(t1);
		t2.show(t2);

		t1.show1();
		t2.show1();
	}

}