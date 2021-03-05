package dat14.ex;

import dat14.ext.Ex01;
import dat14.ext.Figure;
import dat14.ext.Sagak;
import dat14.ext.Samgak;
import dat14.ext.Won;

/*
 	전 예제에서 작성한 삼각형 사각형 원 클레스를
 	10개를 기억할 배열을 만들고 랜덤하게 각 클래스의
 	인스턴스를 채워서 출력하는 프로그램을 작성하세요
 */
public class Ex001 {

	public Ex001() {
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
		new Ex001();
	}
	}