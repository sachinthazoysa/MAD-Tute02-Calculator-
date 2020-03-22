package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    public static final String number1 = "com.example.intentsproj.MESSAGE1";

    public static final String number2= "com.example.intentsproj.MESSAGE2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


    }

    public void Okbtn(View view){
        Intent intent=new Intent(this,SecondActivity.class);


        //Toast message
        Context context = getApplicationContext();
        CharSequence message = "You just clicked the OK button";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
        toast.setGravity(Gravity.TOP|Gravity.CENTER, 0, 0);


        //sending text to the next activity as extra message
        EditText editText = (EditText) findViewById(R.id.editText);
        String first = editText.getText().toString();
        intent.putExtra(number1,first);


        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String second = editText2.getText().toString();
        intent.putExtra(number2,second);


        //starting activity
        startActivity(intent);

    }


}
