package com.company;

public class Event {
    private EventType type;
    private DaneOsoby stareDane;
    private DaneOsoby noweDane;

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public DaneOsoby getStareDane() {
        return stareDane;
    }

    public void setStareDane(DaneOsoby stareDane) {
        this.stareDane = stareDane;
    }

    public DaneOsoby getNoweDane() {
        return noweDane;
    }

    public void setNoweDane(DaneOsoby noweDane) {
        this.noweDane = noweDane;
    }
}
