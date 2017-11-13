package com.example.dao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.dao.data.Student;
import com.example.dao.data.StudentDAOMemoryImplement;
import com.example.dao.data.StudentDaoTest1;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static StudentDAOMemoryImplement stdDAO = new StudentDAOMemoryImplement();
    RecyclerView rv;
    RecyclerView.Adapter<MyAdapter.ViewHolder> myAdapter;
    RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onResume() {
        super.onResume();
        myAdapter = new MyAdapter(MainActivity.this,stdDAO.getData());
        rv.setAdapter(myAdapter);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView) findViewById(R.id.recycle);
        rv.setHasFixedSize(false);
        mLayoutManager = new LinearLayoutManager(MainActivity.this);
        rv.setLayoutManager(mLayoutManager);
        stdDAO.add(new Student("BOB", "1234", "qazwsx"));
        stdDAO.add(new Student("Mary", "5487", "eedcde"));
        myAdapter = new MyAdapter(MainActivity.this,stdDAO.getData());
        rv.setAdapter(myAdapter);



//        Student[] studentdata = stdDAO.getData();
//        for (Student s : studentdata) {
//            Log.d("StdData", s.toString());
//        }
//
//        Student editStudent = studentdata[0];
//        editStudent.address = "pokecicl";
//        stdDAO.update(editStudent);
//
//        Student[] studentdata2 = stdDAO.getData();
//        for (Student s : studentdata2) {
//            Log.d("StdData_UPDATE", s.toString());
//        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "修改").setIcon(android.R.drawable.ic_menu_edit).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, MyEdit.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
