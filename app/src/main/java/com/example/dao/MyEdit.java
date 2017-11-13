package com.example.dao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dao.data.Student;

public class MyEdit extends AppCompatActivity {
    EditText editText,editText2,editText3;
    Button edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myedit);
        editText= (EditText) findViewById(R.id.editText);
        editText2= (EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        edit = (Button)findViewById(R.id.edit);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.stdDAO.add(new Student(editText.getText().toString(),editText2.getText().toString(),editText3.getText().toString()));
                finish();
            }
        });
    }
}
