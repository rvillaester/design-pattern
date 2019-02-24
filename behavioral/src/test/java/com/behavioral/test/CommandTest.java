package com.behavioral.test;

import com.behavioral.command.*;
import org.junit.Test;

public class CommandTest {

    private RemoteControl remoteControl = new RemoteControl();

    @Test
    public void shouldTurnOn(){
        Command command = new TurnOnCommand(remoteControl);
        command.execute();
    }

    @Test
    public void shouldTurnOff(){
        Command command = new TurnOffCommand(remoteControl);
        command.execute();
    }

    @Test
    public void shouldVolumeUp(){
        Command command = new VolumeUpCommand(remoteControl, 23);
        command.execute();
    }

    @Test
    public void shouldVolumeDown(){
        Command command = new VolumeDownCommand(remoteControl, 12);
        command.execute();
    }
}
