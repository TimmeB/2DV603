package observers;

public interface Observable {
    void addObserver(Object o);
    void notifyObserver();
}
