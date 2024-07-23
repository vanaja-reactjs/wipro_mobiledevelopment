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

public class RenewActivity2 extends AppCompatActivity {
    TextView p1,e1,v1,a1;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_renew2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        p1=findViewById(R.id.textPolicy);
        e1=findViewById(R.id.textEngine);
        v1=findViewById(R.id.textVehiclenum);
        a1=findViewById(R.id.textamount);
        btn=findViewById(R.id.closebtn);
        Intent i=getIntent();
        String pol=i.getStringExtra("policy");
        String veh=i.getStringExtra("vehicle");
        String eng=i.getStringExtra("engine number");
        String amt=i.getStringExtra("amount");
        p1.setText(pol);
        v1.setText(veh);
        e1.setText(eng);
        a1.setText(amt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RenewActivity2.this, RenewActivity.class));
            }
        });
    }
}