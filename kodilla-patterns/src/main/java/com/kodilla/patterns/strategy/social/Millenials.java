package com.kodilla.patterns.strategy.social;

public class Millenials extends User {
    String username;

    public Millenials(String username) {
        super(username);
        this.socialPublisher = new FacebookPublisher();
    }
}
