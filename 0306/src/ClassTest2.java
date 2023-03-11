class Point {
	int x,y;
	Point() {}
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
}

class Circle {
	Point center;
	int radius;
	
	Circle(int x, int y, int r) {
		center = new Point(x, y);
		radius=r;
	}
	
	Circle(Point center, int r) {
		this.center=center;
		radius=r;
	}
	
	Circle() {
		center = new Point();
	}
	
	Circle(int r) {
		center = new Point();
		radius=r;
	}
	
	String draw() {
		return "[원:중심점-"+center.toString()+",반지름-"+radius+"]";
	}
}

public class ClassTest2 {
	public static void main(String[] args) {
		Circle c1 = new Circle(10,10,20); //(x,y,r)
		Circle c2 = new Circle(new Point(20,20),30);
		Circle c3 = new Circle();
		Circle c4 = new Circle(25);
		
		System.out.println(c1.draw()); //[원:중심점-(10,10),반지름-20]
		System.out.println(c2.draw());
		System.out.println(c3.draw());
		System.out.println(c4.draw());
	}
}