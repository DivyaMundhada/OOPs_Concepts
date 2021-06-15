package Aggregation;

class Operation {
	int square(int side) {
		return side * side;
	}
}

class Circle {
	Operation op;					// aggregation
	double pi = 3.14;

	double area(int radius) {
		op = new Operation();
		int rsquare = op.square(radius);
		return pi * rsquare;
	}

	public static void main(String args[]) {
		Circle c = new Circle();
		double result = c.area(10);
		System.out.println(result);
	}
}
