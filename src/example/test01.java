package example;

public class test01 {

	 public int aMethod() {

        int i = 0;		//不能用static修饰

        i++;

       return i;
	 }
	 
	 public static void main (String args[]) {

         test01 test = new test01();

         test.aMethod();

         int j = test.aMethod();

        System.out.println(j);

 }
}
