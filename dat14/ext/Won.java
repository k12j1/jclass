package dat14.ext;


public class Won extends Figure{
	private int r;
	private double arround, area; 
	
	public Won() {
	
	}
	public Won(int r) {
		this.r = r;
		setArea();
		setArround();
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public double getArea() {
		return area;
	}	
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {
		this.area = r * r * 3.14;
	}
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public void setArround() {
		this.arround = r * 2 * 3.14;
	}
	public void toPrint() {
		System.out.printf("\n반지름은 %2d 이고 원의 둘레는 %5.1f 원의 넓이는 %5.1f 이다",
							r ,arround , area);
	}
}
