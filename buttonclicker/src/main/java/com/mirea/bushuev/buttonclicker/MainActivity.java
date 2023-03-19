package com.mirea.bushuev.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;
    private Button btnWhoAml;
    private Button btnItIsNotMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStudent =findViewById(R.id.tvOut);
        btnWhoAml = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        View.OnClickListener oclBtnWhoAml = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку №2");

            }
        };
        btnWhoAml.setOnClickListener(oclBtnWhoAml);
    }
    public void onMyButtonClick(View view){
        Toast.makeText(this,"Ешё один способ!", Toast.LENGTH_SHORT).show();
        textViewStudent.setText("Это не я сделал");
    }
}