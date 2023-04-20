package Test;

class OverRiding {
	
	public void method1(int a, int b) {
		System.out.println("Method1 is calling");
	}

	public void method2(String s1, String s2) {
		System.out.println("Method2 is calling");
	}

	public class MethodOverRidding extends OverRiding {
		public void method1(int a, int b) {
			System.out.println("Method is returning :" + (a + b));
		}
		public static void main (String[] args) {
		
			// TODO Auto-generated method stub
			OverRiding m=new MethodOverRidding();
			m.method1(20, 40);

		}

	}
}