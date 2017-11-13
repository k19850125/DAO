package com.example.dao.data;

import java.util.ArrayList;

/**
 * Created by Samuel on 2017/11/13.
 */

public interface StudentDao {
    public void add(Student student);
    public Student[] getData();
    public void  update(Student student);
}
