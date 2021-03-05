package dat14.ext;

public class Samgak extends Figure{
	private int width, height;
	private double area;
			
	public Samgak() {}
	public Samgak(int width,int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {
		this.area = width * height / 2.0;
	}
	public void toPrint() {
		System.out.printf("\n밑변이 %2d 이고 높이가 %2d 이고 넓이가 %5.1f 인 삼각형\n"
							,width , height, area);
	}
}
