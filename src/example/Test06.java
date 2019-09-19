package example;

public class Test06 {

	public static void main(String[] args) {
		final String a="a";
		final String b="b";
		String c=a+b;
		String d=new String("ab");
		//String d="ab";
		System.out.println(a.equals(b));
		System.out.println(a+b==c);
		System.out.println(c==d);
		System.out.println(c.equals(d));
	}
}
