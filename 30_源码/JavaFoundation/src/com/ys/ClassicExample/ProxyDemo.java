package com.ys.ClassicExample;

/**
 * 代理设计模式
 * @类描述：
 * @创建人：zzy
 * @创建时间：2019年7月17日下午1:07:57
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
		System.out.println("检查用户是否合法");
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
