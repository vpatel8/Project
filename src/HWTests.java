import static org.junit.Assert.*;
import org.junit.Test;

public class HWTests {
	public static void main(String args[]){
		org.junit.runner.JUnitCore.main("HWTests");
	}
	HelloWorld hworld = new HelloWorld();
	@Test 
	public void helloTest() {
		String output = hworld.getM();
		assertEquals("Hello World!", output);
	}
}


