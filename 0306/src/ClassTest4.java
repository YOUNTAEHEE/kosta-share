class Triangle {
	Point p1 = new Point();
	Point p2 = new Point();
	Point p3 = new Point();
	
	Triangle() {}
	Triangle(int x1,int y1,int x2,int y2,int x3,int y3) {
		p1.x=x1;
		p1.y=y1;
		p2.x=x2;
		p2.y=y2;
		p3.x=x3;
		p3.y=y3;
	}
	
	String draw() {
		return "[삼각형:점1-"+p1+",점2-"+p2+",점3-"+p3+"]";
	}
}

public class ClassTest4 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(10,10,20,20,30,30);//p1:(10,10)  p2:(20,20), p3:(30,30)
		System.out.println(t1.draw()); //[삼각형:점1-(10,10),점2-(20,20),점3-(30,30)]

	}

}
