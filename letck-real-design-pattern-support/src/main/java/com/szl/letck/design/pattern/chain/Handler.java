package com.szl.letck.design.pattern.chain;

public abstract class Handler {
    private Handler nextHandler;
    private int level;

    public Handler(int level){
        this.level = level;
    }

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    protected void handleMessage(Request request){
        if(level == request.getRequestLevel()){
            this.handleRequest(request);
        } else {
            if(this.nextHandler != null){
                this.nextHandler.handleMessage(request);
            } else {
                System.out.println("已经是最后一步了！");
            }
        }
    }

    public abstract void handleRequest(Request request);
}
