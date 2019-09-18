package com.mj.sticky.frame.observer;

/**
 * Created by Aron on 2017/9/28.
 * 被观察者
 */

public interface Observable {
    /**
     * add a observer to the list
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * remove a observer from the list
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * notify all observers in the list
     * @param obj
     */
    void notifyObservers(EventMsg obj);
}
