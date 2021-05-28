package com.example.clearmydoubt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class StudentAnswer extends AppCompatActivity {


    ArrayList<String> listItem;
    Bundle bundle;

    ListView answers;
    ArrayAdapter adapter;
    String question,answer;
    TextView mQuestionTV;
    Button mGoBack;
    DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_answer);

        bundle = getIntent().getExtras();
        question = bundle.getString("question");

        mQuestionTV = findViewById(R.id.tvQuestion);
        mGoBack = findViewById(R.id.bGoBack);

        answers = findViewById(R.id.lvAnswers);
        mQuestionTV.setText(question);

        Cursor cursor = dbHelper.getAnswer(question);
        if (cursor.getCount() == 0)
        {
            Toast.makeText(StudentAnswer.this, "Not yet answered", Toast.LENGTH_SHORT).show();
        }
        else
        {
            while(cursor.moveToNext())
            {
                listItem.add(cursor.getString(3));
            }
            adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listItem);
            answers.setAdapter(adapter);
        }
    }

    public void goBack(View view)
    {
        Intent intent = new Intent(StudentAnswer.this,StudentQuestion.class);
        startActivity(intent);
    }
}
