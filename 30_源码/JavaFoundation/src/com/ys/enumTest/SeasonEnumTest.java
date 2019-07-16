package com.ys.enumTest;

public enum SeasonEnumTest implements SeasonEnumImpl{
	SPRING("����","��ů����"){
		@Override
		public String getMonth() {
			return "12-2";
		}
	},
	SUMMER ("����","����ʢ��"){
		@Override
		public String getMonth() {
			return "3-5";
		}
		
	},
	FALL("����","�����ˬ"){
		@Override
		public String getMonth() {
			return "6-8";
		}
	},
	WINTER("����","��ѩ�׷�"){
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
