package dat14.ext;

public class Sagak extends Figure{
	private int garo, sero;
	private double area;
	
	public Sagak() {
		
	}
		public Sagak(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
		
	}
		public int getGaro() {
			return garo;
		}
		public void setGaro(int garo) {
			this.garo = garo;
		}
		public int getSero() {
			return sero;
		}
		public void setSero(int sero) {
			this.sero = sero;
		}
		public double getArea() {
			return area;
		}
		public void setArea(double area) {
			this.area =area;
		}
		public void setArea() {
			this.area = garo * sero;
		}
		
		public void toPrint() {
			System.out.printf("\n���δ� %2d �̰� ���δ� %2d �̰� ���̴� %5.1f �� �簢�� �̴�."
					, garo, sero, area);
		}
	
}
