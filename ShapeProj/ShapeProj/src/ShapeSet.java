import shape.Shape;

public class ShapeSet {
	Shape[] shapes = new Shape[100];
	int cnt;
	
	void addShape(Shape shape) {
		shapes[cnt++] = shape;
	}
	
	void drawShapes() {
		for(int i=0; i<cnt; i++) {
			shapes[i].draw();
//			if(shapes[i] instanceof Circle) {
//				Circle c = (Circle)shapes[i];
//				c.draw();
//			} else if(shapes[i] instanceof Rectangle) {
//				Rectangle r = (Rectangle)shapes[i];
//				r.draw();
//			} else if(shapes[i] instanceof Triangle) {
//				Triangle t = (Triangle)shapes[i];
//				t.draw();
//			}
		}
	}
}
