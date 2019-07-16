package com.ys.enumTest;

public enum SeasonEnumTest implements SeasonEnumImpl{
	SPRING("春天","穿暖花开"){
		@Override
		public String getMonth() {
			return "12-2";
		}
	},
	SUMMER ("夏天","炎炎盛夏"){
		@Override
		public String getMonth() {
			return "3-5";
		}
		
	},
	FALL("秋天","秋高气爽"){
		@Override
		public String getMonth() {
			return "6-8";
		}
	},
	WINTER("冬天","大雪纷飞"){
		@Override
		public String getMonth() {
			return "9-11";
		}
	};
	private final String name;
	private final String desc;
	private SeasonEnumTest(String name,String desc){
		this.name = name;
		this.desc = desc;
	}
}
