package com.example.dao.data;

import java.util.ArrayList;

/**
 * Created by Samuel on 2017/11/13.
 */

public class StudentDAOMemoryImplement implements StudentDao {
    int MaxID = 1;
    ArrayList<Student> data = new ArrayList<>();
    @Override
    public void add(Student student) {
        student.id = MaxID;
        data.add(student);
        MaxID++;

    }

    @Override
    public Student[] getData() {
        return data.toArray(new Student[data.size()]);
    }

    @Override
    public void update(Student student) {
        for (Student tmp :data){
            if(tmp.id == student.id){
                tmp.name = student.name;
                tmp.address = student.address;
                tmp.tel = student.tel;
            }
        }
    }
}
