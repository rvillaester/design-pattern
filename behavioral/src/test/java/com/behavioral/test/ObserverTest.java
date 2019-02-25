package com.behavioral.test;

import com.behavioral.observer.EmailObserver;
import com.behavioral.observer.MessageObservable;
import com.behavioral.observer.SmsObserver;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void canNotifyObservers(){
        MessageObservable observable = new MessageObservable();
        observable.addObserver(new EmailObserver());
        observable.addObserver(new SmsObserver());
        observable.messageArrive("Test Message");
    }
}
