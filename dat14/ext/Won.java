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
		System.out.printf("\n�������� %2d �̰� ���� �ѷ��� %5.1f ���� ���̴� %5.1f �̴�",
							r ,arround , area);
	}
}
