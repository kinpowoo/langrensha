package com.jinhanyu.jack.langren.entity;

import java.io.Serializable;

/**
 * Created by anzhuo on 2016/9/10.
 */
public class RoomInfo implements Serializable{
    private  String roomId;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    private String roomName;

    public int getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(int peopleNum) {
        this.peopleNum = peopleNum;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    private int peopleNum;
}
