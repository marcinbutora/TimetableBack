package com.timetable.app.classroom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int floor;
    private int classRoomNumber;

    public Classroom(int floor, int classRoomNumber) {
        this.floor = floor;
        this.classRoomNumber = classRoomNumber;
    }

    public Classroom() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getClassRoomNumber() {
        return classRoomNumber;
    }

    public void setClassRoomNumber(int classRoomNumber) {
        this.classRoomNumber = classRoomNumber;
    }
}
