package com.hsw.designPattern.decorator;

/**
 * ������ĸߵ�����
 *
 * @author hsw
 */
public class Tall extends GirlDecorator {

    private Girl girl;


    public Tall(Girl girl) {
        super();
        this.girl = girl;
    }


    @Override
    public String getDescription() {
        return girl.getDescription() + " +is very tall";
    }

}
