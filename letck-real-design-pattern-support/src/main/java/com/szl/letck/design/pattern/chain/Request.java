package com.szl.letck.design.pattern.chain;

import lombok.Data;

@Data
public class Request {
    private int requestLevel;

    public int getRequestLevel() {
        return requestLevel;
    }

    public void setRequestLevel(int requestLevel) {
        this.requestLevel = requestLevel;
    }
}
