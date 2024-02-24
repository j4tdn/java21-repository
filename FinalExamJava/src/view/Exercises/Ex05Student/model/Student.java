/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.Exercises.Ex05Student.model;

/**
 *
 * @author PC
 */
public class Student {

    private String mssv;
    private String name;
    private double dtb;
    private String gender;

    public Student() {
    }

    public Student(String mssv, String name, double dtb, String gender) {
        this.mssv = mssv;
        this.name = name;
        this.dtb = dtb;
        this.gender = gender;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" + "mssv=" + mssv + ", name=" + name + ", dtb=" + dtb + ", gender=" + gender + '}';
    }
}
