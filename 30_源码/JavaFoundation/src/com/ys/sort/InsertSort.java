package com.ys.sort;
/**
 * 插入排序
 * @author zzy
 * @date 2019年4月13日
 */
public class InsertSort {
	public static int[] sort(int[] array){
		int j;
		//默认下标为0的第一个元素为有序，从1开始插入
		for(int i=1;i<array.length;i++){
			int temp = array[i];
			j = i;
			//向前遍历
			while(j>0&&temp<array[j-1]){
				array[j] = array[j-1];//向后移动
				j--;
			}
			array[j] = temp;
		}
		return array;
	}
	/**
	 * main 方法
	 * @param args
	 */
	public static void main(String[] args) {
		int [] array = {15,24,11,8,35,9,26,18,16};
		display(array);
		sort(array);
		
		System.out.println("排序后的数组：");
		display(array);
	}
	/**
	 * 遍历显示数组
	 * @param array数组
	 */
	public static void display(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"->");
		}
		System.out.println();
	}
}
