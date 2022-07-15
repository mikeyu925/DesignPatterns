package com.ywh.dp.command;

public class OffCommand implements Command{
    // 对命令进行处理
    private ConditionReceiver receiver;
    public OffCommand(ConditionReceiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.off();
    }
}
