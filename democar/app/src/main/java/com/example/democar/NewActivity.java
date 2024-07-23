package com.example.democar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NewActivity extends AppCompatActivity {
    EditText name,eng,veh,phn,email;
    CheckBox ch1,ch2;
    Button btn1,btn2;
    String str=" ";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_new);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        name = findViewById(R.id.edituser);
        eng = findViewById(R.id.editTexteng);
        veh = findViewById(R.id.editTextvehi);
        phn = findViewById(R.id.editTextPhone);
        email = findViewById(R.id.editTextTextEmailAddress);
        ch1 = findViewById(R.id.checkBox);
        ch2 = findViewById(R.id.checkBox2);
        btn1 = findViewById(R.id.btnsubmitNew);
        btn2 = findViewById(R.id.btnbacknew);
        boolean isChecked=ch1.isChecked();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nam = name.getText().toString();
                String emai = email.getText().toString();
                String ph = phn.getText().toString();
                String en = eng.getText().toString();
                String vh = veh.getText().toString();
                Intent i = new Intent(NewActivity.this, NewActivity2.class);
                i.putExtra("name", nam);
                i.putExtra("email", emai);
                i.putExtra("phone", ph);
                i.putExtra("engine", en);
                i.putExtra("vehicle", vh);
                ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if(isChecked) {
                            String str = ch1.getText().toString();
                            Intent i=new Intent(NewActivity.this, NewActivity2.class);
                            i.putExtra("selected", str);
                        }
                        else{
                            Toast.makeText(getApplicationContext(),"not selected ",Toast.LENGTH_SHORT).show();
                        }

                    }
                });
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NewActivity.this, HomeActivity.class));

            }
        });

        



    }
}
    