package com.hsw.designPattern.factorymodel;

public class HumanFactory {

    public Human createHuman(String gender) {

        if ("Mail".equals(gender)) {
            return new Male();
        } else if ("Femail".equals(gender)) {
            return new Female();
        } else {
            System.out.println("��������ȷ������");
        }

        return null;

    }

}
