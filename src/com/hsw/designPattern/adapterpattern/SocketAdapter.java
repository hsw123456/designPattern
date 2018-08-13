package com.hsw.designPattern.adapterpattern;

/**
 * �������࣬����ʵ�ֹ����ͷ���±��ͷ��ת��
 * 
 * @author hsw
 * 
 */
public class SocketAdapter implements DBSocketInterface {// ʵ�־ɽӿ�

	// ����½ӿ�
	private GBSocketInterface gbSocket;

	/**
	 * ������������ʱ����봫���½ӿڵ�ʵ����
	 * 
	 * @param gbSocket
	 */
	public SocketAdapter(GBSocketInterface gbSocket) {
		this.gbSocket = gbSocket;
	}

	/**
	 * �Ծɽӿڵĵ������䵽�½ӿ�
	 */
	@Override
	public void powerWithTwoRound() {
		gbSocket.powerWithThreeFlat();
	}

}
