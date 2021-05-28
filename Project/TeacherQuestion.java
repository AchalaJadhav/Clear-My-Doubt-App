package com.example.clearmydoubt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

public class TeacherQuestion extends AppCompatActivity {

    Bundle bundle;
    String year,branch,subject,question;
    DBHelper dbHelper;
    ListView questions;
    ArrayList<String> listItem;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_question);

        bundle = getIntent().getExtras();

        dbHelper = new DBHelper(this);
        listItem = new ArrayList<>();

        questions = findViewById(R.id.lvQuestions);

        viewQ();

        questions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                question = questions.getItemAtPosition(i).toString();
                //bundle = getIntent().getExtras();
                bundle.putString("question",question);
                Intent intent = new Intent(TeacherQuestion.this,TeacherAnswer.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private void viewQ() {
        //bundle = getIntent().getExtras();

        //year = bundle.getString("year");
        //branch = bundle.getString("branch");
        //subject = bundle.getString("subject");

        Cursor cursor = dbHelper.viewQuestion();

        if(cursor.getCount() == 0)
        {
            makeText(this,"No Records", LENGTH_SHORT).show();
        }
        else
        {
            while(cursor.moveToNext())
            {
                listItem.add(cursor.getString(3));
            }
            adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listItem);
            questions.setAdapter(adapter);
        }
    }
}
