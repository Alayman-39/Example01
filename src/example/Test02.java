package example;

//public class Test02 {
//
//	public static void main(String[] args) {
////		long temp=(int)3.9;
////
////		System.out.println(temp);
////		temp%=2;
////		System.out.println(temp);
////		int a=2;
////		int b=6;
////		System.out.println("a+b="+a+b);
//		
////		    String a;
////		    a = 5 ? 0 : 1;
////		    System.out.println(a);
//		
//	}
//}
public class Test02 {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operator(a, b);
		System.out.println(a + "," + b);
	}

	public static void operator(StringBuffer x, StringBuffer y) {
		x.append(y);
		y = x;
	}
}
