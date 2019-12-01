package com.Learning.com;

import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import com.protectsoft.webviewcode.Codeview;
import com.protectsoft.webviewcode.Settings;

public class Fragment_sql_java extends Fragment {
    private ProgressDialog mProgressDialog;
    private int themePos = 0;
    TextView title2;
    String Code="import android.app.AlertDialog;\n" +
            "import android.database.Cursor;\n" +
            "import android.os.Bundle;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.view.Menu;\n" +
            "import android.view.MenuItem;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.EditText;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    DatabaseHelper myDb;\n" +
            "    EditText editName,editSurname,editMarks ,editTextId;\n" +
            "    Button btnAddData;\n" +
            "    Button btnviewAll;\n" +
            "    Button btnDelete;\n" +
            "\n" +
            "    Button btnviewUpdate;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        myDb = new DatabaseHelper(this);\n" +
            "\n" +
            "        editName = (EditText)findViewById(R.id.editText_name);\n" +
            "        editSurname = (EditText)findViewById(R.id.editText_surname);\n" +
            "        editMarks = (EditText)findViewById(R.id.editText_Marks);\n" +
            "        editTextId = (EditText)findViewById(R.id.editText_id);\n" +
            "        btnAddData = (Button)findViewById(R.id.button_add);\n" +
            "        btnviewAll = (Button)findViewById(R.id.button_viewAll);\n" +
            "        btnviewUpdate= (Button)findViewById(R.id.button_update);\n" +
            "        btnDelete= (Button)findViewById(R.id.button_delete);\n" +
            "        AddData();\n" +
            "        viewAll();\n" +
            "        UpdateData();\n" +
            "        DeleteData();\n" +
            "    }\n" +
            "    public void DeleteData() {\n" +
            "        btnDelete.setOnClickListener(\n" +
            "                new View.OnClickListener() {\n" +
            "                    @Override\n" +
            "                    public void onClick(View v) {\n" +
            "                        Integer deletedRows = myDb.deleteData(editTextId.getText().toString());\n" +
            "                        if(deletedRows > 0)\n" +
            "                            Toast.makeText(MainActivity.this,\"Data Deleted\",Toast.LENGTH_LONG).show();\n" +
            "                        else\n" +
            "                            Toast.makeText(MainActivity.this,\"Data not Deleted\",Toast.LENGTH_LONG).show();\n" +
            "                    }\n" +
            "                }\n" +
            "        );\n" +
            "    }\n" +
            "    public void UpdateData() {\n" +
            "        btnviewUpdate.setOnClickListener(\n" +
            "                new View.OnClickListener() {\n" +
            "                    @Override\n" +
            "                    public void onClick(View v) {\n" +
            "                        boolean isUpdate = myDb.updateData(editTextId.getText().toString(),\n" +
            "                                editName.getText().toString(),\n" +
            "                                editSurname.getText().toString(),editMarks.getText().toString());\n" +
            "                        if(isUpdate == true)\n" +
            "                            Toast.makeText(MainActivity.this,\"Data Update\",Toast.LENGTH_LONG).show();\n" +
            "                        else\n" +
            "                            Toast.makeText(MainActivity.this,\"Data not Updated\",Toast.LENGTH_LONG).show();\n" +
            "                    }\n" +
            "                }\n" +
            "        );\n" +
            "    }\n" +
            "    public  void AddData() {\n" +
            "        btnAddData.setOnClickListener(\n" +
            "                new View.OnClickListener() {\n" +
            "                    @Override\n" +
            "                    public void onClick(View v) {\n" +
            "                        boolean isInserted = myDb.insertData(editName.getText().toString(),\n" +
            "                                editSurname.getText().toString(),\n" +
            "                                editMarks.getText().toString() );\n" +
            "                        if(isInserted == true)\n" +
            "                            Toast.makeText(MainActivity.this,\"Data Inserted\",Toast.LENGTH_LONG).show();\n" +
            "                        else\n" +
            "                            Toast.makeText(MainActivity.this,\"Data not Inserted\",Toast.LENGTH_LONG).show();\n" +
            "                    }\n" +
            "                }\n" +
            "        );\n" +
            "    }\n" +
            "\n" +
            "    public void viewAll() {\n" +
            "        btnviewAll.setOnClickListener(\n" +
            "                new View.OnClickListener() {\n" +
            "                    @Override\n" +
            "                    public void onClick(View v) {\n" +
            "                        Cursor res = myDb.getAllData();\n" +
            "                        if(res.getCount() == 0) {\n" +
            "                            // show message\n" +
            "                            showMessage(\"Error\",\"Nothing found\");\n" +
            "                            return;\n" +
            "                        }\n" +
            "\n" +
            "                        StringBuffer buffer = new StringBuffer();\n" +
            "                        while (res.moveToNext()) {\n" +
            "                            buffer.append(\"Id :\"+ res.getString(0)+\"\\n\");\n" +
            "                            buffer.append(\"Name :\"+ res.getString(1)+\"\\n\");\n" +
            "                            buffer.append(\"Surname :\"+ res.getString(2)+\"\\n\");\n" +
            "                            buffer.append(\"Marks :\"+ res.getString(3)+\"\\n\\n\");\n" +
            "                        }\n" +
            "\n" +
            "                        // Show all data\n" +
            "                        showMessage(\"Data\",buffer.toString());\n" +
            "                    }\n" +
            "                }\n" +
            "        );\n" +
            "    }\n" +
            "\n" +
            "    public void showMessage(String title,String Message){\n" +
            "        AlertDialog.Builder builder = new AlertDialog.Builder(this);\n" +
            "        builder.setCancelable(true);\n" +
            "        builder.setTitle(title);\n" +
            "        builder.setMessage(Message);\n" +
            "        builder.show();\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "\n" +
            "}\n";
    String Code2="import android.content.ContentValues;\n" +
            "import android.content.Context;\n" +
            "import android.database.Cursor;\n" +
            "import android.database.sqlite.SQLiteDatabase;\n" +
            "import android.database.sqlite.SQLiteOpenHelper;\n" +
            "\n" +
            "public class DatabaseHelper extends SQLiteOpenHelper {\n" +
            "    public static final String DATABASE_NAME = \"Student.db\";\n" +
            "    public static final String TABLE_NAME = \"student_table\";\n" +
            "    public static final String COL_1 = \"ID\";\n" +
            "    public static final String COL_2 = \"NAME\";\n" +
            "    public static final String COL_3 = \"SURNAME\";\n" +
            "    public static final String COL_4 = \"MARKS\";\n" +
            "\n" +
            "    public DatabaseHelper(Context context) {\n" +
            "        super(context, DATABASE_NAME, null, 1);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onCreate(SQLiteDatabase db) {\n" +
            "        db.execSQL(\"create table \" + TABLE_NAME +\" (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SURNAME TEXT,MARKS INTEGER)\");\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {\n" +
            "        db.execSQL(\"DROP TABLE IF EXISTS \"+TABLE_NAME);\n" +
            "        onCreate(db);\n" +
            "    }\n" +
            "\n" +
            "    public boolean insertData(String name,String surname,String marks) {\n" +
            "        SQLiteDatabase db = this.getWritableDatabase();\n" +
            "        ContentValues contentValues = new ContentValues();\n" +
            "        contentValues.put(COL_2,name);\n" +
            "        contentValues.put(COL_3,surname);\n" +
            "        contentValues.put(COL_4,marks);\n" +
            "        long result = db.insert(TABLE_NAME,null ,contentValues);\n" +
            "        if(result == -1)\n" +
            "            return false;\n" +
            "        else\n" +
            "            return true;\n" +
            "    }\n" +
            "\n" +
            "    public Cursor getAllData() {\n" +
            "        SQLiteDatabase db = this.getWritableDatabase();\n" +
            "        Cursor res = db.rawQuery(\"select * from \"+TABLE_NAME,null);\n" +
            "        return res;\n" +
            "    }\n" +
            "\n" +
            "    public boolean updateData(String id,String name,String surname,String marks) {\n" +
            "        SQLiteDatabase db = this.getWritableDatabase();\n" +
            "        ContentValues contentValues = new ContentValues();\n" +
            "        contentValues.put(COL_1,id);\n" +
            "        contentValues.put(COL_2,name);\n" +
            "        contentValues.put(COL_3,surname);\n" +
            "        contentValues.put(COL_4,marks);\n" +
            "        db.update(TABLE_NAME, contentValues, \"ID = ?\",new String[] { id });\n" +
            "        return true;\n" +
            "    }\n" +
            "\n" +
            "    public Integer deleteData (String id) {\n" +
            "        SQLiteDatabase db = this.getWritableDatabase();\n" +
            "        return db.delete(TABLE_NAME, \"ID = ?\",new String[] {id});\n" +
            "    }\n" +
            "}\n";
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.two_heading_codeview, container, false);
        WebView webview = (WebView)view.findViewById(R.id.webview);
        title2=(TextView)view.findViewById(R.id.title2);
        title2.setText("DatabaseHelper.Java");
        WebView webView2=(WebView)view.findViewById(R.id.webview2);
        Button copy1=(Button)view.findViewById(R.id.copy1);
        copy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("clip", Code);
                clipboard.setPrimaryClip(clip);
            }
        });
        Button copy2=(Button)view.findViewById(R.id.copy2);
        copy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("clip", Code2);
                clipboard.setPrimaryClip(clip);
            }
        });
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webview);
        Codeview.with(getActivity().getApplicationContext())
                .withCode(Code2)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.JAVA)
                .into(webView2);
        return view;
    }



}

