package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private String username;
    private int counter;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println("You have new task waiting for verification in " + taskQueue.getQueueID() +
        ". You have in total " + taskQueue.getTasks().size() + " tasks in this queue.");
        counter++;
    }

    public String getUsername() {
        return username;
    }

    public int getCounter() {
        return counter;
    }
}
