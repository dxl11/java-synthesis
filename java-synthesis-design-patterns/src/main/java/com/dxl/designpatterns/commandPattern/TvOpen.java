package com.dxl.designpatterns.commandPattern;

public class TvOpen implements Command {
    Television tv;

    public TvOpen(Television tv) {
        this.tv = tv;
    }

    @Override
    public void excute() {
        this.tv.open();
    }
}
