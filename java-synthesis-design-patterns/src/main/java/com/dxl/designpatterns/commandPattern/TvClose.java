package com.dxl.designpatterns.commandPattern;

public class TvClose implements Command{
    Television tv;

    public TvClose(Television tv){
        this.tv = tv;
    }

    @Override
    public void excute() {
        this.tv.close();
    }
}
