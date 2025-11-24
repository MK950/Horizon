package com.example.horizon;

public abstract class DashboardWidget {
    protected DataService service;
    protected String title;

    public DashboardWidget(DataService service, String title) {
        this.service = service;
        this.title = title;
    }

    public abstract void update();

    //public abstract Parent getDisplay();
    // related to javaFx

}
