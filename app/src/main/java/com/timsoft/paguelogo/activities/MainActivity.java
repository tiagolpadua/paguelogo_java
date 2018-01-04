package com.timsoft.paguelogo.activities;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.timsoft.paguelogo.R;

public class MainActivity extends AppCompatActivity {

    Button btnAddConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton btnAddConta = (FloatingActionButton) findViewById(R.id.btnAddConta);
        btnAddConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                Intent intent = new Intent(context, AddContaActivity.class);
                startActivity(intent);
            }
        });

//        Button btnAddConta = (Button)findViewById(R.id.btnAddConta);
//
//        btnAddConta.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Context context = getApplicationContext();
//                Intent intent = new Intent(context, AddContaActivity.class);
//                startActivity(intent);
//
////                Context context = getApplicationContext();
////                CharSequence text = "Hello toast!";
////                int duration = Toast.LENGTH_SHORT;
////
////                Toast toast = Toast.makeText(context, text, duration);
////                toast.show();
//            }
//        });
    }
}
