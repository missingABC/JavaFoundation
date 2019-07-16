package com.ys.array;

/**
 * @author zzy
 * @date 2019/6/4
 */
public class TestStr {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = new String("Hello").intern();
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        //+号拼接
        String strs = "";
        long start1 = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            strs += "c";
        }
        long end1 = System.currentTimeMillis();
        System.out.println("+号拼接耗时："+(end1-start1)+"ms");
        //concat拼接
        long start2 = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            strs = strs.concat("c");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("concat拼接耗时："+(end2-start2)+"ms");
        //StringBuilder
        long start3 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("");
        for(int i=0;i<100000;i++){
            builder.append("c");
        }
        long end3 = System.currentTimeMillis();
        System.out.println("StringBuilder拼接耗时："+(end3-start3)+"ms");
        //StringBuffer
        long start4 = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("");
        for(int i=0;i<100000;i++){
            buffer.append("c");
        }
        long end4 = System.currentTimeMillis();
        System.out.println("StringBuffer拼接耗时："+(end4-start4)+"ms");
    }
}
