package example;

public class Test03 {
	public static void main(String[] args) {
		Programer p = new Programer();
		p.driverBenz();
		p.driverBMW();
	}
}
class Programer{
	private Benz benz;
	private BMW bmw;
	public void driverBenz(){
		benz = new Benz();
		benz.start();
	}
	public void driverBMW(){
		bmw = new BMW();
		bmw.start();
	}
}

class Benz{
	public void start(){
		System.out.println("Benz is started");
	}
}

class BMW{
	public void start(){
		System.out.println("BMW is started");
	}
}
