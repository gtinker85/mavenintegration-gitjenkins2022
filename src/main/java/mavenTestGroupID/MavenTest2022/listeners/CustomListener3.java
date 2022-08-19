package mavenTestGroupID.MavenTest2022.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListener3 implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		// Executes when <suite> tag starts
		System.out.println("CustomListener3 onStart: before suite starts");
		ISuiteListener.super.onStart(suite);
	}

	@Override
	public void onFinish(ISuite suite) {
		// Executes when <suite> tag finishes
		System.out.println("CustomListener3 onFinish: after suite finishes");
		ISuiteListener.super.onFinish(suite);
	}	
}
