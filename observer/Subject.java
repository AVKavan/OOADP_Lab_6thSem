package observer;

public abstract class Subject {

	public abstract void addObserver(Observer o);
	public abstract void removeObserver(Observer o);
   abstract void notifyObservers();
}
