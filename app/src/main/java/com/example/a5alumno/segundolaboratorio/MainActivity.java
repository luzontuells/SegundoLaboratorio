package com.example.a5alumno.segundolaboratorio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final int REQUEST_CODE = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(MainActivity.TAG, "onCreate()");

        this.startActivityForResult(new Intent(this, SecondActivity.class), REQUEST_CODE);

        Log.e(MainActivity.TAG, savedInstanceState == null ? "Is null" : "Not null");    // Ejemplo bueno de IF-ELSE en una línea
        Log.e(MainActivity.TAG, "onCreate()");
        //Toast mToast = new Toast(this);   //NO HAY QUE HACERLO, ES UNA CLASE STATIC!!!
        Toast.makeText(this, "onCreate()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        // Check which request we're responding to
        if (requestCode == REQUEST_CODE) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                // The user picked a contact.
                // The Intent's data Uri identifies which contact was selected.
                Toast.makeText(this, "Todo controlado, resultado devuelto", Toast.LENGTH_SHORT).show();
                // Do something with the contact here (bigger example below)
            }
        }
    }
}
