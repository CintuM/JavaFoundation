package org.ict.day2;

public class RectanglePerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectanglePerimeter rp = new RectanglePerimeter();
		rp.perimeterOfRectangle(30, 60);
	}
	
	public void perimeterOfRectangle(int l,int w) {
		int perimeter = (l+w)*2;
		System.out.println("Perimeter of rectangle = "+perimeter);
	}

}
