
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Levi
 */
public enum Eiland implements Subject {

    INSTANCE;

    private ArrayList<Observer> observers = new ArrayList<>();
    Gebeurtenis gebeurtenis;

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    public Gebeurtenis getGebeurtenis() {
        return gebeurtenis;
    }

    public void setGebeurtenis(Gebeurtenis gebeurtenis){
        this.gebeurtenis = gebeurtenis;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        System.out.println("We verwittigen alle bewoners als er een gebeurtenis is");
        observers.stream().forEach((ob) -> {
            ob.update(gebeurtenis);
        });

    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }
}
