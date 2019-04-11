import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Observer {
    protected Show show;
    public abstract void update();
}

 public class Show {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void add(Observer o) {
        observers.add(o);
    }

    public int getState() {
        return state;
    }

    public void setState(int value) {
        this.state = value;
        execute();
    }

    private void execute() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

class HexObserver extends Observer {
    public HexObserver(Show show) {
        this.show = show;
        this.show.add(this);
    }

    public void update() {
        System.out.print(" " + Integer.toHexString(show.getState()));
    }
}

class OctObserver extends Observer {
    public OctObserver(Show show) {
        this.show = show;
        this.show.add( this );
    }

    public void update() {
        System.out.print(" " + Integer.toOctalString(show.getState()));
    }
}

class BinObserver extends Observer {
    public BinObserver(Show show) {
        this.show = show;
        this.show.add(this);
    }

    public void update() {
        System.out.print(" " + Integer.toBinaryString(show.getState()));
    }
}

class ObserverDemo {
    public static void main( String[] args ) {
        Show sub = new Show();
        // Client configures the number and type of Observers
        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter a number: ");
            sub.setState(scan.nextInt());
        }
    }
}
