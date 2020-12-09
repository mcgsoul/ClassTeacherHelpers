package com.classteacherhelper.www.helper.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.lang.annotation.Repeatable;
import java.util.Date;

/**
 * 查寝工作类
 */
@Table(name = "check_class_room")
public class KnowingWork {

    /**编号*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**开始类型时间*/
    private Date start_time;

    /**结束时间*/
    private Date end_time;

    /**进度 1、开始 2、结束*/
    private Integer progress_flag;

    /**学生编号*/
    private Integer student_id;

    /**班主任编号*/
    private Integer teacher_id;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Integer getProgress_flag() {
        return progress_flag;
    }

    public void setProgress_flag(Integer progress_flag) {
        this.progress_flag = progress_flag;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }
}
