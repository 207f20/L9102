package designpatterns.observer;

public class LightBulbObserver2 implements Observer {

	private int numChanges = 0;

	@Override
	public void update() {
		this.numChanges++;
		System.out.println("numChanges = " + this.numChanges);
	}
}
