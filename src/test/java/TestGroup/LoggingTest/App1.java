package TestGroup.LoggingTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class App1 {
	private static final Logger log = LogManager.getLogger(App1.class);
	public static void main(String[] args) {
		System.out.println("Hello World!");
		log.info("Hello World!");
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { TestGroup.LoggingTest.YouTubeAdFree.class });
		testng.addListener(tla);
		testng.run();


	}
}
