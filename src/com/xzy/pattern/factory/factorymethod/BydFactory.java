package com.xzy.pattern.factory.factorymethod;

/**
 * Created by Administrator on 2017/12/21.
 */
public class BydFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Byd();
    }

}
