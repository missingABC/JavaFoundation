package com.ys.thread;
/**
 * 创建生产者线程
 * @author zzy
 * @date 创建时间：2019年6月4日
 */
public class Producer implements Runnable {
	//共享资源
	Person p = null;
	public Producer(Person p){
		this.p = p;
	}
	@Override
	public void run() {
		for(int i=0;i<50;i++){
			//如果有偶数 生产对象tom 11 如果是奇数生产对象Marry 21
			if(i%2==0){
				p.push("Tom", 11);
			}else{
				p.push("Marry", 21);
			}
		}
	}

}
