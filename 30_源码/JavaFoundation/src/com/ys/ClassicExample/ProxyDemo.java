package com.ys.ClassicExample;

/**
 * �������ģʽ
 * @��������
 * @�����ˣ�zzy
 * @����ʱ�䣺2019��7��17������1:07:57
 * @version v1.0
 */
interface Network{
	public void broswer();
}
class Real implements Network{

	@Override
	public void broswer() {
		System.out.println("broswering");
	}
	
}
class Proxy implements Network{
	private Network network;
	public Proxy(Network network) {
		this.network = network;
	}
	public void Check() {
		System.out.println("����û��Ƿ�Ϸ�");
	}
	@Override
	public void broswer() {
		this.Check();
		this.network.broswer();
	}
	
}
public class ProxyDemo {

	public static void main(String[] args) {
		Network network = null;
		network = new Proxy(new Real());
		network.broswer();

	}

}
