package com.example.clearmydoubt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TeacherAnswer extends AppCompatActivity {

    Bundle bundle;
    TextView mTVQuestion;
    EditText mETAnswer;
    Button mBSubmitAnswer;
    String year, branch, subject,question,answer;
    DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_answer);

        bundle = getIntent().getExtras();
        year = bundle.getString("year");
        branch = bundle.getString("branch");
        subject = bundle.getString("subject");
        question = bundle.getString("question");

        mTVQuestion = findViewById(R.id.tvQuestion);
        mBSubmitAnswer = findViewById(R.id.bSubmitAnswer);
        mETAnswer = findViewById(R.id.etAnswer);
        dbHelper = new DBHelper(this);
        mTVQuestion.setText(question);
    }
    public void updateAnswer(View view)
    {

        answer = mETAnswer.getText().toString();
        QuestionAnswer questionAnswer = new QuestionAnswer(year,branch,subject,question,answer,false);
        boolean result = dbHelper.updateAnswer(questionAnswer);
        if (result == true)
        {
            Toast.makeText(TeacherAnswer.this, "Answer Submitted", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(TeacherAnswer.this,TeacherQuestion.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(TeacherAnswer.this, "Answer Not Submitted", Toast.LENGTH_SHORT).show();
            mETAnswer.setText(" ");
        }
    }
}
