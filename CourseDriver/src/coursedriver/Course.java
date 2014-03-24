/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursedriver;

/**
 *
 * @author tuannguyen
 */
import java.util.*;

public class Course {

    String subject;
    String titleOfTheSubject;
    String grade;
    int hour;

    public Course() {
        subject = "math";
        titleOfTheSubject = "Calculus";
        grade = "A";
        hour = 4;
    }

    public Course(String s, String t, String g, int h) {
        subject = s;
        titleOfTheSubject = t;
        grade = g;
        hour = h;
    }

    public String getSubject() {
        return subject;
    }

    public String getTitleOfTheSubject() {
        return titleOfTheSubject;
    }

    public String getGrade() {
        return grade;
    }

    public int getHour() {
        return hour;
    }

    public void setSubject(String s) {
        subject = s;
    }

    public void setTitleOfTheSubject(String t) {
        titleOfTheSubject = t;
    }

    public void setGrade(String g) {
        grade = g;
    }

    public void setHour(int h) {
        hour = h;
    }

    public String toString() {
        return subject + " " + titleOfTheSubject + " " + grade + " " + hour;
    }

}
