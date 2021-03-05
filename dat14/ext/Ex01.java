package dat14.ext;

public class Ex01 {

	public Ex01() {
		Figure f1 = new Samgak();
		Figure f2 = new Sagak();
		Figure f3 = new Won();
		
		Figure[] f = new Figure[10];
		for(int i = 0 ;i < f.length; i++) {
			f[i] = getFigure();
	
			
		}
	
		for(Figure ff : f) {
			ff.toPrint();
		}

	}
	public Figure getFigure() {
		Figure f = null;
		int no = (int)(Math.random() * 3);
		switch(no) {
		case 0:
				f = new Samgak((int)(Math.random() * 9 + 1), (int)(Math.random() * 9 + 1));
			break;
		case 1:
				f = new Sagak((int)(Math.random() * 9 + 1), (int)(Math.random() * 9 + 1));
			break;
		case 2:
				f = new Won((int)(Math.random() * 9 + 1));
			break;
		}
		return f;
		
	}
	public static void main(String[] args) {
		new Ex01();
	}
	}


