package com.classteacherhelper.www.helper.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 班级类
 */
@Table(name = "class")
public class ClassAndGrade {

    /**编号*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**年级（格式：2017）*/
    private Integer grade;

    /**班级序号 （格式：1）*/
    private Integer NAME;

    /**专业名称 （格式：计算机科学与技术）*/
    private String major;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Integer getNAME() {
        return NAME;
    }

    public void setNAME(int NAME) {
        this.NAME = NAME;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
