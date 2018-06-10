package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {

    private String queueID;
    private List<String> tasks;
    private List<Observer> observers;

    public TaskQueue(String queueID) {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
        this.queueID = queueID;
    }

    public void addNewTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getQueueID() {
        return queueID;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
