package com.zzy.book.dto;

import com.zzy.book.entity.Appointment;
import com.zzy.book.enums.AppointStateEnum;

/**
 * @author zzy
 * @date 2019/6/24
 */
public class AppointExecution {
    //图书id
    private long bookId;
    //预约状态
    private int state;
    //状态标识
    private String stateInfo;
    //预约成功对象
    private Appointment appointment;
    //构造
    public AppointExecution(){
    }

    /**
     * 预约失败的构造器
     * @param bookId
     * @param stateEnum
     */
    public AppointExecution(long bookId, AppointStateEnum stateEnum){
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    /**
     * 预约成功的构造器
     * @param bookId
     * @param stateEnum
     * @param appointment
     */
    public AppointExecution(long bookId,AppointStateEnum stateEnum,Appointment appointment){
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.appointment = appointment;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "AppointExecution{" +
                "bookId=" + bookId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", appointment=" + appointment +
                '}';
    }
}
