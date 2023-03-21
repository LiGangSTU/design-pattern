package com.ligang.Porxy.static_proxy;

public class PorxyPoint implements SellTickets{

    private TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        System.out.println("收费代理点");
        trainStation.sell();
    }
}
