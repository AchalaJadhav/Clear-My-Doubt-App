package  com.example.clearmydoubt;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import javax.security.auth.Subject;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="ClearMyDoubt";
    public static final String TABLE_NAME = "QuestionAnswer";
    public static final int VERSION = 1;
    public static final String YEAR = "YEAR";
    public static final String BRANCH = "BRANCH";
    public static final String SUBJECT = "SUBJECT";
    public static final String STATUS = "STATUS";
    public static final String QUESTION = "QUESTION";
    public static final String ANSWER = "ANSWER";

    public DBHelper(Context context)
    {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        final String CREATE_TABLE = "CREATE TABLE " +TABLE_NAME+ "(" +YEAR+" TEXT," +BRANCH+" TEXT," +SUBJECT+" TEXT," +QUESTION+" TEXT," +ANSWER+" TEXT," +STATUS+" BOOLEAN)";
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int iO, int iN) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public boolean insertQuestion(QuestionAnswer questionAnswer)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(YEAR,questionAnswer.getYear());
        contentValues.put(BRANCH,questionAnswer.getBranch());
        contentValues.put(SUBJECT,questionAnswer.getSubject());
        contentValues.put(QUESTION,questionAnswer.getQuestion());
        contentValues.put(ANSWER,questionAnswer.getAnswer());
        contentValues.put(STATUS,questionAnswer.getStatus());
        long result=sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
        if(result == -1) {
            return false;
        }
        else {
            return true;
        }
    }

    public Cursor getAnswer(String question)
    {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();


        Cursor cursor = sqLiteDatabase.query(TABLE_NAME,new String[]{ANSWER},QUESTION,new String[]{question},null,null,null,"10");

        return cursor;


    }

    public Cursor viewQuestion()
    {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();

        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM "+TABLE_NAME,null);

        return cursor;
    }

    public boolean updateAnswer(QuestionAnswer questionAnswer)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        /*contentValues.put(YEAR,questionAnswer.getYear());
        contentValues.put(BRANCH,questionAnswer.getBranch());
        contentValues.put(SUBJECT,questionAnswer.getSubject());
        contentValues.put(QUESTION,questionAnswer.getQuestion());
        */

        contentValues.put(ANSWER,questionAnswer.getAnswer());
        long result = sqLiteDatabase.update(TABLE_NAME,contentValues,"QUESTION = ?",new String[]{questionAnswer.getQuestion()});
        if (result != 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
