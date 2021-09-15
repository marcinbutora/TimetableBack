package com.timetable.app.lesson;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.timetable.app.classroom.Classroom;
import com.timetable.app.subject.Subject;
import com.timetable.app.teacher.Teacher;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime startLesson;
    private LocalDateTime endLesson;
    private LocalDate dayOfWeek;
    @OneToOne(mappedBy = "classroom", fetch = FetchType.LAZY)
    private Classroom classroom;
    @OneToOne(mappedBy = "lesson", fetch = FetchType.LAZY)
    private Teacher teacher;
    @OneToOne(mappedBy = "subject", fetch = FetchType.LAZY)
    private Subject subject;

    public Lesson(LocalDateTime startLesson, LocalDateTime endLesson, LocalDate dayOfWeek, Classroom classroom, Teacher teacher, Subject subject) {
        this.startLesson = startLesson;
        this.endLesson = endLesson;
        this.dayOfWeek = dayOfWeek;
        this.classroom = classroom;
        this.teacher = teacher;
        this.subject = subject;
    }

    public Lesson() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getStartLesson() {
        return startLesson;
    }

    public void setStartLesson(LocalDateTime startLesson) {
        this.startLesson = startLesson;
    }

    public LocalDateTime getEndLesson() {
        return endLesson;
    }

    public void setEndLesson(LocalDateTime endLesson) {
        this.endLesson = endLesson;
    }

    public LocalDate getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(LocalDate dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
