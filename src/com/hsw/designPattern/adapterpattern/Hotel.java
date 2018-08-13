package com.hsw.designPattern.adapterpattern;

/**
 * �¹��ù���һ���ͻ��ˣ��������е±�Ľӿڣ�����ʹ������±�ӿڸ��ֻ���磺
 * @author hsw
 *
 */
public class Hotel {
	
	//�ù��еĵ±���
	private DBSocketInterface dbSocket;
	
	public Hotel(){}

	public Hotel(DBSocketInterface dbSocket) {
		this.dbSocket = dbSocket;
	}

	public void setDbSocket(DBSocketInterface dbSocket) {
		this.dbSocket = dbSocket;
	}
	
	//�ù����и�Ϊ�ֻ����Ĺ���
	public void charge(){
		//ʹ�õ±��ڳ��
		dbSocket.powerWithTwoRound();
	}
	
	
	
	
}
