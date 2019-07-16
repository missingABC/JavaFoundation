package com.zzy.book.enums;

/**
 * @author zzy
 * @date 2019/6/24
 * 注意：枚举类没有set方法
 */
public enum AppointStateEnum {
    SUCCESS(1,"预约成功"),
    NO_NUMBER(0,"库存不足"),
    REPEAT_APPOINT(-1,"重复预约"),
    INNER_ERROR(-2,"系统异常");
    private int state;
    private String stateInfo;

    AppointStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public void setState(int state) {
        this.state = state;
    }

    public static AppointStateEnum stateOf(int index){
        for(AppointStateEnum state:values()){
            if(state.getState()==index){
                return state;
            }
        }
        return null;
    }

}
