package com.ywh.dp.command;


public class OnCommand implements Command{
    // 对命令进行处理
    private ConditionReceiver receiver;
    public OnCommand(ConditionReceiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.on();
    }
}
