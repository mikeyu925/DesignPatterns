package com.ywh.dp.command;

public class CoolCommand implements Command{
    // 对命令进行处理
    private ConditionReceiver receiver;
    public CoolCommand(ConditionReceiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.doCool();
    }
}
