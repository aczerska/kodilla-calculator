package com.kodilla.good.patterns.challenges;

public class User {

    private String username;
    private String name;
    private String lastName;

    public User(final String username, final String name, final String lastName) {
        this.username = username;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
