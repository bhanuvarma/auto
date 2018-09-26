package script;

import org.junit.Test;
import org.testng.Reporter;

import generic.BaseTest;

public class TestDemo extends BaseTest{
	@Test
	public void testA() {
		Reporter.log("testA",true);
	}

}
