package com.example.dao.data;

import java.util.ArrayList;

/**
 * Created by Samuel on 2017/11/13.
 */

public class StudentDaoTest1 {
    int MaxID = 1;
    ArrayList<Student> data = new ArrayList<>();

    public void add(Student student) {
        student.id = MaxID;
        data.add(student);
        MaxID++;
    }

    public ArrayList<Student> getData() {
        return data;
    }

    public void  update(Student student){
        for (Student tmp :data){
            if(tmp.id == student.id){
                tmp.name = student.name;
                tmp.address = student.address;
                tmp.tel = student.tel;
            }
        }
    }


}
