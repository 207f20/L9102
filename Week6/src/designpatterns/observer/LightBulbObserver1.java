package designpatterns.observer;

// Complete your custom Observer class in Observer.java to get this code to work
public class LightBulbObserver1 implements Observer {
	
	@Override
	public void update() {
		System.out.println("Something has Changed");
	}
}
