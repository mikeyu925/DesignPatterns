package com.ywh.dp.state;

public class OrderContext {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.handle();
    }

    public OrderContext(){

    }
    public OrderContext(State s){
        this.state = s;
    }
}
