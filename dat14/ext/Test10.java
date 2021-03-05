package dat14.ext;

public class Test10 {

	public Test10() {
		Grand g1 = new Grand();
		Grand g2 = new Father();
		Grand g3 = new Uncle();
		/*
		Grand[] gg = {g1, g2, g3};
		for(Grand g : gg) {
			g.toPrint();
		*/	
		
		Grand[] g = new Grand[10];
		
		for(int i = 0 ; i < g.length ; i++) {
			g[i] = getGrand();
		}
		
		for(Grand gg : g) {
			gg.toPrint();
		}
		}
		public Grand getGrand() {
			Grand g = null;
			int no = (int)(Math.random() * 3);
			switch(no) {
			case 0:
				g = new Grand();
				break;
			case 1:
				g = new Father();
				break;
			case 2:
				g = new Uncle();
				break;
		}
			return g;
	}
	public static void main(String[] args) {
		new Test10();
	}
}
