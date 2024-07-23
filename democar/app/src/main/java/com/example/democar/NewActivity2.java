package com.example.democar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NewActivity2 extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_new2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        t1=findViewById(R.id.textView1);
        t2=findViewById(R.id.textView2);
        t3=findViewById(R.id.textView3);
        t4=findViewById(R.id.textView4);
        t5=findViewById(R.id.textView5);
        t6=findViewById(R.id.textView6);
        btn=findViewById(R.id.buttonback);
        Intent i=getIntent();
        String tv1=i.getStringExtra("name");
        String tv2=i.getStringExtra("vehicle");
        String tv3=i.getStringExtra("engine");
        String tv4=i.getStringExtra("phone");
        String tv5=i.getStringExtra("email");
        String tv6=i.getStringExtra("selected");
        t1.setText(tv1);
        t2.setText(tv5);
        t3.setText(tv4);
        t4.setText(tv3);
        t5.setText(tv2);
        t6.setText(tv6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewActivity2.this,NewActivity.class));

            }
        });
    }
}