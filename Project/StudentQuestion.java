package com.example.clearmydoubt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import static android.widget.Toast.*;
import static android.widget.Toast.LENGTH_SHORT;

public class StudentQuestion extends AppCompatActivity {

    DBHelper dbHelper;
    EditText mQuestion;
    Button mAsk;
    String year,subject,branch;

    Bundle bundle;
    ListView qList;
    ArrayList<String> listItem;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_question);

        bundle = getIntent().getExtras();

        dbHelper = new DBHelper(this);

        listItem = new ArrayList<>();


        qList = findViewById(R.id.lvQuestions);
        mAsk = (Button) findViewById(R.id.buttonAskQuestion);
        mQuestion = findViewById(R.id.etQuestion);

        viewQ();

        qList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String question = qList.getItemAtPosition(i).toString();
                //String answer = dbHelper.getAnswer(question);
                listItem.clear();
                viewQ();
                Bundle b = new Bundle();
                b.putString("question",question);
                Intent intent = new Intent(StudentQuestion.this,StudentAnswer.class);
                intent.putExtras(b);
                makeText(StudentQuestion.this, "Tap to View Answer", LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

    private void viewQ() {
        //Bundle bundle = getIntent().getExtras();
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
            qList.setAdapter(adapter);
        }
    }

    public void insertQ(View view)
    {
        Bundle bundle = getIntent().getExtras();
        year = bundle.getString("year");
        branch = bundle.getString("branch");
        subject = bundle.getString("subject");

        String question = mQuestion.getText().toString();
        QuestionAnswer questionAnswer= new QuestionAnswer(year,branch,subject,question,"",false);
        boolean inserted = dbHelper.insertQuestion(questionAnswer);
        if (inserted) {
            makeText(this,"Question Submitted", LENGTH_SHORT).show();
        }
        else {
            makeText(this,"Question Not Submitted. Try Again.", LENGTH_SHORT).show();
            mQuestion.setText(" ");
        }
    }


}
