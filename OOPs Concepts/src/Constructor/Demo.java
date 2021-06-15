package Constructor;

public class Demo {
int a;

// Default Constructor
Demo(){}

//Parameterized Constructor
Demo(int a){
	this.a=a;
	System.out.println(a);
	}

public static void main(String[] args) {
	new Demo(10);

}
}

