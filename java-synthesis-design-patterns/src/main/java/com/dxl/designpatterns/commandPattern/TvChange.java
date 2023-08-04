package com.dxl.designpatterns.commandPattern;

public class TvChange implements Command {
    Television tv;

    public TvChange(Television tv) {
        this.tv = tv;
    }

    @Override
    public void excute() {
        this.tv.channgleTv();
    }
}
