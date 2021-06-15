package Interface;

//Interface
interface print{
	void display();
}

public class Show implements print {
	public void display() {
		System.out.println("Display Method");
	}
	
	String message;
	
	Show(){}
	
	Show (String message){
		this.message = message;
	}

public static void main(String[] args) {
	Show ShowObj = new Show();
	ShowObj.display();
}
}