package com.behavioral.command;

public class VolumeDownCommand implements Command{

    private RemoteControl remoteControl;
    private int level;

    public VolumeDownCommand(RemoteControl remoteControl, int level){
        this.remoteControl = remoteControl;
        this.level = level;
    }

    @Override
    public void execute() {
        this.remoteControl.volumeDown(this.level);
    }
}
