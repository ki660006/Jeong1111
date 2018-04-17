/*
 * java -> 클래스, 객체, 인스턴스 
 */



public class Ex01 {
	public static void main(String[] args) {
		/*
		 * Debug 모드는
		 * 멈추는곳에 break point 더블클릭 지정
		 * f5 함수 안으로 진행
		 * f6 한줄 진행
		 * f8 다음 break point 진행 or break point 없으면 끝까지 진행
		 */
		System.out.println("----프로그램 시작----");
		AA aa1 = new AA();
		System.out.println(aa1.a);
		aa1.doA();
		
		AA aa2 = new AA();
		System.out.println(aa2.a);
		aa2.doA();
		
		BB bb1 = new BB();
		System.out.println(bb1.b);
		bb1.doB();
		
		BB bb2 = new BB();
		System.out.println(bb2.b);
		bb2.doB();
		
		CC cc1 = new CC();
		System.out.println(cc1.c);
		cc1.doC();
		
		System.out.println("----프로그램 종료----");
		
	}
}

class AA{
	public int a = 10;
	public void doA() {
		System.out.println("doA 함수 입니다.");
	}
}
class BB{
	public int b = 20;
	public void doB() {
		System.out.println("doB 함수 입니다.");
	}
}
class CC{
	public int c = 30;
	public void doC() {
		System.out.println("doC 함수 입니다.");
	}
}