import java.util.ArrayList;

public abstract class Source {
    ArrayList<MyObserver> observers;
    Source(){
        observers = new ArrayList<MyObserver>();
    }
    public void add(MyObserver observer){
        observers.add(observer);
    }public void remove(MyObserver observer){
        observers.remove(observer);
    }
    public void broadcast(){
        for (MyObserver myObserver : observers) {
            myObserver.update(this);
        }
    }
}
