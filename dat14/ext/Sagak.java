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
			System.out.printf("\n가로는 %2d 이고 세로는 %2d 이고 넓이는 %5.1f 인 사각형 이다."
					, garo, sero, area);
		}
	
}
