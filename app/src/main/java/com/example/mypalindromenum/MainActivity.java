package com.example.mypalindromenum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = editText.getText().toString().trim();

                //String str1 = "";

                //for(int i = str.length()-1; i >= 0; i--){
                //    str1 += str.charAt(i);
                //}

                StringBuffer sbuf = new StringBuffer(str);

                String str1 = sbuf.reverse().toString();

                if(str.equals(str1)){
                    textView.setText("True");
                }else{
                    textView.setText("False");
                }
            }
        });

    }
}