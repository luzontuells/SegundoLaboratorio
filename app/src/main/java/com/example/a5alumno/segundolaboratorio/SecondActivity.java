package com.example.a5alumno.segundolaboratorio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //this.startActivity(new Intent(this,MainActivity.class));

        Intent resultIntent = new Intent();
        resultIntent.putExtra("returnValue", "string value");

        this.setResult(Activity.RESULT_OK, resultIntent);
        this.finish();
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.e(SecondActivity.TAG, "onStart()");
//        Toast.makeText(this, "onStart()", Toast.LENGTH_SHORT).show();
//
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.e(SecondActivity.TAG, "onResume()");
//        Toast.makeText(this, "onResume()", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.e(SecondActivity.TAG, "onPause()");
//        Toast.makeText(this, "onPause()", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.e(SecondActivity.TAG, "onStop()");
//        Toast.makeText(this, "onStop()", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.e(SecondActivity.TAG, "onRestart()");
//        Toast.makeText(this, "onRestart()", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.e(SecondActivity.TAG, "onDestroy()");
//        Toast.makeText(this, "onDestroy()", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//
//        Log.e(SecondActivity.TAG, "onSaveInstanceState()");
//        Toast.makeText(this, "onSaveInstanceState()", Toast.LENGTH_SHORT).show();
//        outState.putString("myString", "Hello World");
//    }
}





