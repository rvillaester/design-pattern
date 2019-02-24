package com.behavioral.command;

public class VolumeUpCommand implements Command{

    private RemoteControl remoteControl;
    private int level;

    public VolumeUpCommand(RemoteControl remoteControl, int level){
        this.remoteControl = remoteControl;
        this.level = level;
    }

    @Override
    public void execute() {
        this.remoteControl.volumeUp(this.level);
    }
}
