package com.th.service;

import com.th.pojo.Student;
import org.junit.Test;

/**
 * Created by Administrator on 2018/11/13.
 */
public class StudentService {

    @Test
    public  void test(){
        Student stu1 = new Student();
        Student stu2 = stu1;
        stu1.setAge(5);
        stu1.setName("Tom1");
        System.out.println("Hello Idea  " + stu1.getName() + "  " + stu2.getName());
    }
}
