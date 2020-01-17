import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DataBaseHelper{

    private Context mCtx = null;
    private com.example.listatarea1.DataBaseHelperInternal mDBHelper = null;
    private SQLiteDatabase mDb = null;
    private static final String DATABASE_NAME = "TODOLIST";
    private static final int DATABASE_VERSION = 3;

    private static final String DATABASE_CREATE_TODOLIST =
            "create table "+ DATABASE_TABLE_TODOLIST +" ("+SL_ID+" integer primary key, "+SL_ITEM+" text not null, "+SL_PLACE+" text not null, "
                    +SL_IMPORTANCE+" integer not null, "+SL_DESCRIPTION+" text)";

    public  DataBaseHelper(Context ctx){
        this.mCtx = ctx;
    }

}

private static class  DataBaseHelperInternal extends SQLiteOpenHelper {
    public DataBaseHelperInternal(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        createTables(db);

    }
    @Override
    public void onUpgrade(SQLiteDatabase bd, int oldVersion, int newVersion){
        deleteTables(db);
        createTables(db);
    }
    private void createTables(SQLiteDatabase bd){
        db.exexSQL(DATABASE_CREATE_TODOLIST);

    }
    private void deleteTables(SQLiteDatabase db){
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE_TODOLIST);
    }
}