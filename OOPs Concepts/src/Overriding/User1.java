package Overriding;

class User {

void show(){
System.out.println("Yes");

}
}

public class User1 extends User {

void show(){
System.out.println("no");
}



public static void main(String[] args) {

User obj1 = new User();
User1 obj2 = new User1();

obj1.show();
obj2.show();

}


}







