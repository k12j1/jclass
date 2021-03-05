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
		System.out.printf("\n�غ��� %2d �̰� ���̰� %2d �̰� ���̰� %5.1f �� �ﰢ��\n"
							,width , height, area);
	}
}
