package com.ys.sort;

/**
 * 选择排序
 * @author zzy
 * @date 2019年4月13日
 */
public class ChoiceSort {
	public static int[] sort(int [] array){
		for(int i=0;i<array.length;i++){
			int min = i;
			for(int j=i+1;j<array.length;j++){
				if(array[min]>array[j]){
					min = j;//记录能找到的最小值得下标
				}
			}
			if(i !=min){
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
			
			System.out.println("第"+(i+1)+"次排序的结果为：");
			display(array);
		}
		return array;
	}
	public static void display(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"->");
		}
	}
	public static void main(String[] args) {
		
		int[] MyArray =  {25,13,27,11,49,2,42,8,19,51};
		sort(MyArray);
	}
		
}
