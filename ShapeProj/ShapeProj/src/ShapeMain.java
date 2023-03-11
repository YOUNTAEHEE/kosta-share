import shape.Circle;
import shape.Point;
import shape.Rectangle;
import shape.Shape;
import shape.Triangle;

public class ShapeMain {
	public static void main(String[] args) {
		ShapeSet ss = new ShapeSet();
		ss.addShape(new Circle("red",10,10,5));
		ss.addShape(new Circle("blue",new Point(20,20),10));
		ss.addShape(new Rectangle("green",5,5,20,10));
		ss.addShape(new Rectangle("yellow",new Point(1,1),30,20));
		ss.addShape(new Triangle("orange",1,1,5,5,10,10));
		ss.addShape(new Triangle("purple",new Point(10,10),new Point(15,15), new Point(17,17)));
		
		ss.drawShapes();
	}
}
