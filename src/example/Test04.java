package example;

public class Test04 {

	public static void main(String[] args) {
		User user = new User();
		Binli binli = new Binli();
		Ferary f = new Ferary();
		user.driver(f);
		user.driver(binli);
	}
}

interface Car{
	public void start();
}

class Ferary implements Car{

	@Override
	public void start() {
		System.out.println("BMW is started");
		
	}
}

class Binli implements Car{

	@Override
	public void start() {
		System.out.println("Binli is started");
	}
}

class User{
	void driver(Car car){
		car.start();
	}
}