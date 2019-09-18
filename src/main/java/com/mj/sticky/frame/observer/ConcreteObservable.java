package com.mj.sticky.frame.observer;



import java.util.ArrayList;

/**
 * Created by Aron on 2017/9/28.
 * 被观察者类
 */

public class ConcreteObservable implements Observable {
    private ArrayList<Observer> observers;

    @Override
    public void addObserver(Observer observer) {
        if (observers == null) {
            observers = new ArrayList<>();
        }
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers == null || observers.size() <= 0) {
            return;
        }
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(EventMsg obj) {
        if (observers == null || observers.size() <= 0) {
            return;
        }
        for(int i=0;i<observers.size();i++){
            Observer observer=observers.get(i);
        }
        for (Observer observer : observers) {
            observer.update(obj);
        }
    }
}
