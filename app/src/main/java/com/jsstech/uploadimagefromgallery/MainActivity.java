package com.jsstech.uploadimagefromgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
EditText edtClick;
Button btClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtClick=findViewById(R.id.edtTxt);
        btClick=findViewById(R.id.btOk);
        tv=findViewById(R.id.tv1);

        btClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newTxt=edtClick.getText().toString();
                tv.setText(newTxt);
                closeKeyBoard();

            }
        });
    }

    private void closeKeyBoard() {

        View view=this.getCurrentFocus();
        if (view!=null){
            InputMethodManager im=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            im.hideSoftInputFromWindow(view.getWindowToken(),0);
        }


    }
}