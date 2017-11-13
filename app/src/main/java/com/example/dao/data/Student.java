package com.example.dao.data;

/**
 * Created by Samuel on 2017/11/13.
 */

public class Student {
    public int id;
    public String name;
    public String tel;
    public String address;

    public Student(String name,String tel,String address){

        this.name =name;
        this.tel = tel;
        this.address = address;
    }

    @Override
    public String toString(){
        return id+","+ name +","+tel+","+address;
    }
}
