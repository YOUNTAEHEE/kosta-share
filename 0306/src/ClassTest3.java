class Rectangle {
	Point startPos;
	int width;
	int height;
	
	Rectangle(int x, int y, int width, int height) {
		startPos = new Point(x,y);
		this.width=width;
		this.height=height;
	}
	
	Rectangle(Point startPos, int width, int height) {
		this.startPos=startPos;
		this.width=width;
		this.height=height;
	}
	
	Rectangle() {
		startPos = new Point();
	}
	
	Rectangle(int width, int height) {
		startPos = new Point();
		this.width=width;
		this.height=height;
	}
}

public class ClassTest3 {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(10,10,20,5);  //시작점(startPos):10,10, 가로(width):20, 세로(height):5
		Rectangle rec2 = new Rectangle(new Point(5,5),30,10);
		Rectangle rec3 = new Rectangle();
		Rectangle rec4 = new Rectangle(30,10);
	}
}
