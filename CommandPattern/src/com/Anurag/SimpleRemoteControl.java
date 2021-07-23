package com.Anurag;

public class SimpleRemoteControl {
    Command slot;  // only one button

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
