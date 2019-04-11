import java.util.ArrayList;
import java.util.List;

public class Show implements Subject {

    private int usersInShow;
    private List<Observer> observers;

    public Show() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    @Override
    public int getState() {
        return peopleInSpace;
    }

    public void setPeopleInSpace(int n) {
        peopleInSpace = n;
        notifyObservers();
    }
}