package com.example.clearmydoubt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mButtonTeacher,mButtonStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonStudent=findViewById(R.id.buttonStudent);
        mButtonTeacher=findViewById(R.id.buttonTeacher);

        mButtonStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToStudent();
            }
        });

        mButtonTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToTeacher();
            }
        });
    }

    public void goToTeacher()
    {
        Intent intentTeacher = new Intent(this,TeacherCourse.class);
        startActivity(intentTeacher);
    }

    public void goToStudent()
    {
        Intent intentStudent = new Intent(this,StudentCourse.class);
        startActivity(intentStudent);
    }
}
