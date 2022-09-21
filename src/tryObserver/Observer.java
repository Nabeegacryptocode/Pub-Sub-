package tryObserver;

public abstract class Observer {
     public String name;
     public Store store;
    public abstract void update(float discount);
}
