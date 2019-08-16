package com.zzy.design.creation.simpleFactory;
/**
 * 简单工厂-电视机工厂
 * @author Administrator
 *
 */
public class TVFactory {
	/**
	 * 工厂-根据不同的brand创建不同的TV
	 * @param brand
	 * @return
	 */
	public static TV produceTV(String brand) {
		if(brand.equalsIgnoreCase("Haier")) {
			System.out.println("Haier TV createing...");
			return new HaierTV();
		}else if(brand.equalsIgnoreCase("Hisense")) {
			System.out.println("Hisense TV creating...");
			return new HisenseTV();
		}else {
			System.out.println("Sorry,the factory don`t have the brand");
			return null;
		}
	}
}
