package mavenTestGroupID.MavenTest2022;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.function.Supplier;

import org.openqa.selenium.By;
import org.openqa.selenium.Credentials;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
//WebDriverEventListener is deprecated for WebDriverListener

public class HandleEvents implements WebDriverListener {

	@Override
	public void beforeBack(Navigation navigation) {
		System.out.println("Inside BeforeBack method");
		WebDriverListener.super.beforeBack(navigation);
	}

	@Override
	public void beforeForward(Navigation navigation) {
		 System.out.println("Inside BeforeForward method");
		WebDriverListener.super.beforeForward(navigation);
	}

	@Override
	public void beforeTo(Navigation navigation, String url) {
		System.out.println("Inside BeforeTo Stringurl method");
		WebDriverListener.super.beforeTo(navigation, url);
	}

	@Override
	public void beforeTo(Navigation navigation, URL url) {
		System.out.println("Inside BeforeTo URLurl method");
		WebDriverListener.super.beforeTo(navigation, url);
	}

	@Override
	public void onError(Object target, Method method, Object[] args, InvocationTargetException e) {
		System.out.println("Inside onError method");
		WebDriverListener.super.onError(target, method, args, e);
	}

	@Override
	public void afterBack(Navigation navigation) {
		System.out.println("Inside afterBack method");
		WebDriverListener.super.afterBack(navigation);
	}

	@Override
	public void afterClick(WebElement element) {
		System.out.println("Inside afterClick method");
		WebDriverListener.super.afterClick(element);
	}

	@Override
	public void afterFindElement(WebElement element, By locator, WebElement result) {
		System.out.println("Inside afterFindElement method");
		WebDriverListener.super.afterFindElement(element, locator, result);
	}

	@Override
	public void afterForward(Navigation navigation) {
		System.out.println("Inside afterForward method");
		WebDriverListener.super.afterForward(navigation);
	}

	@Override
	public void afterTo(Navigation navigation, URL url) {
		System.out.println("Inside afterTo method ");
		WebDriverListener.super.afterTo(navigation, url);
	}
	

}
