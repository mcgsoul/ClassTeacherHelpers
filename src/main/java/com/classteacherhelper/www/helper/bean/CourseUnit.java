package com.classteacherhelper.www.helper.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 课程单元类
 */
@Table(name = "course_table_unit")
public class CourseUnit {

    /**编号*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**星期一-星期天1-7*/
    private Integer week_day;

    /**第1-12节课    1-12*/
    private Integer course_order_number;

    /**授课老师名字*/
    private Integer teacher_name;

    /**上课地点*/
    private String location;

    /**课程编号*/
    private Integer course_id;

    /**班级编号*/
    private Integer class_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeek_day() {
        return week_day;
    }

    public void setWeek_day(int week_day) {
        this.week_day = week_day;
    }

    public Integer getCourse_order_number() {
        return course_order_number;
    }

    public void setCourse_order_number(int course_order_number) {
        this.course_order_number = course_order_number;
    }

    public Integer getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(Integer teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }
}
