package com.behavioral.mediator;

public interface SmsMediator {
    void sendMessage(String message, User sender);
    void registerUser(User user);
}
