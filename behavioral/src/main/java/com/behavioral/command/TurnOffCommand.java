package com.behavioral.command;

public class TurnOffCommand implements Command{

    private RemoteControl remoteControl;

    public TurnOffCommand(RemoteControl remoteControl){
        this.remoteControl = remoteControl;
    }

    @Override
    public void execute() {
        this.remoteControl.turnOff();
    }
}
