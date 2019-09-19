package example;

public class Test05 {

	public static void main(String[] args) {
		
	}
	public int testException() { 
	    int i = 0; 
	    try {
	        i++; 
	        throw new Exception("error");
	    } catch (Exception e) {  
	        return i++;
	    } finally {
	        i++;
	    }
	}
}

