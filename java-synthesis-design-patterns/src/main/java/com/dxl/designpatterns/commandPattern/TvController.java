package com.dxl.designpatterns.commandPattern;

public class TvController {
    private Command TvClose;

    private Command TvOpen;

    private Command TvChange;

    public TvController(TvOpen tvOpen, TvClose tvClose, TvChange tvChange) {
        this.TvOpen = tvOpen;
        this.TvClose = tvClose;
        this.TvChange = tvChange;
    }

    /**
     * 打开电视剧
     */
    public void open() {
        TvOpen.excute();
    }

    /**
     * 关闭电视机
     */
    public void close() {
        TvClose.excute();
    }

    /**
     * 换频道
     */
    public void change() {
        TvChange.excute();
    }

}
