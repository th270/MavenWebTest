package com.th.pojo;

/**
 * Created by Administrator on 2018/11/13.
 */
public class Student {
    private String name;
    private Integer age;
    private String sex;
    private String habbit;

    public Student() {
    }

    public Student(String name, Integer age, String sex, String habbit) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.habbit = habbit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHabbit() {
        return habbit;
    }

    public void setHabbit(String habbit) {
        this.habbit = habbit;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' + ", habbit='" + habbit + '\'' + '}';
    }
}
