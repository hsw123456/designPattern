package com.hsw.designPattern.adapterpattern;

/**
 * �¹�����ʵ�ֵ¹���׼
 * @author hsw
 *
 */
public class DBSocket implements DBSocketInterface {

	@Override
	public void powerWithTwoRound() {
			System.out.println("ʹ������Բͷ�Ĳ�׹���");
	}

}
