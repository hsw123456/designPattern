package com.hsw.designPattern.decorator;

/**
 * ���Ͻ�����
 *
 * @author hsw
 */
public class GoldenHair extends GirlDecorator {

    private Girl girl;


    public GoldenHair(Girl girl) {
        this.girl = girl;
    }


    @Override
    public String getDescription() {
        return girl.getDescription() + " +with Golden Hair";
    }

}
