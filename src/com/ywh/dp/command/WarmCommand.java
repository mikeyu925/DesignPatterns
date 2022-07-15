package com.ywh.dp.command;

public class WarmCommand implements Command{
    // 对命令进行处理
    private ConditionReceiver receiver;
    public WarmCommand(ConditionReceiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.doWarm();
    }
}
