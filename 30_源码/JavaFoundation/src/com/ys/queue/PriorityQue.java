package com.ys.queue;
/**
 * 优先级队列
 * @author zzy
 * @date 创建时间：2019年4月15日
 */
public class PriorityQue {
	private int maxSize;
	private int[] priQueArray;
	private int nItems;
	public PriorityQue(int s){
		maxSize = s;
		priQueArray = new int[maxSize];
		nItems = 0;
	}
	/**
	 * 插入数据，按照从大到小的顺序，使用插入排序
	 * @param value
	 */
	public void insert(int value){
		int j;
		if(nItems == 0){
			priQueArray[nItems++] = value;
		}else{
			j = nItems - 1;
			//选择的排序是插入排序，从大到小排序，最小的再顶端
			while(j>=0&&value>priQueArray[j]){
				priQueArray[j+1] = priQueArray[j];
				j--;
			}
			priQueArray[j+1] = value;
			nItems++;
		}
	}
	/**
	 * 移除数据，指针向下移动。 注意：新增数据时，队尾指针向上移动，移除数据时，对头指针向上移动。
	 * @return
	 */
	public int remove(){
		int k = nItems -1;
		int value = priQueArray[k];
		priQueArray[k] = -1;
		nItems--;
		return value;
	}
	/**
	 * 查看优先级最高的元素
	 * 因为按照优先级从大到小排列的(由大到小)
	 * @return
	 */
	public int peekMin(){
		return priQueArray[nItems-1];
	}
	/**
	 * 判空
	 * @return
	 */
	public boolean isEmpty(){
		return (nItems == 0);
	}
	/**
	 * 判满
	 * @return
	 */
	public boolean isFull(){
		return (nItems == maxSize);
	}
}
