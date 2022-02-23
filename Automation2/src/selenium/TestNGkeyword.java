package selenium;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class TestNGkeyword {
    
	
	@Test
	public void test1() {
		System.out.println("test4");
	}
	@Test
//	@Parameters({"a","b"})
	public void  validation(int a, int b)
{
		System.out.println(a+b);
	}
}
