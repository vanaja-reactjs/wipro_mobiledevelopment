package com.example.democar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RenewActivity extends AppCompatActivity {
    EditText poly,veh,eng,amt;
    TextView p1,e1,a1,v1;
    Button btn1,btn2;
    RadioGroup rd;
    RadioButton vehselection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_renew);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        poly=findViewById(R.id.Policynum);
        veh=findViewById(R.id.numvehicle);
        eng=findViewById(R.id.Enginum);
        amt=findViewById(R.id.payamount);
        rd=findViewById(R.id.radiogroup);
        btn1=findViewById(R.id.submitbtn);
        btn2=findViewById(R.id.backbtn);
        rd.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      int selected = rd.getCheckedRadioButtonId();
                                      vehselection = findViewById(selected);
                                      if (selected == -1) {
                                          Toast.makeText(getApplicationContext(), "nothing selected", Toast.LENGTH_SHORT).show();
                                      } else {
                                          Toast.makeText(getApplicationContext(), vehselection.getText(), Toast.LENGTH_SHORT).show();
                                      }
                                  }

        });
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String pol=poly.getText().toString();
                    String ve=veh.getText().toString();
                    String en=eng.getText().toString();
                    String am=amt.getText().toString();
                   Intent nextscreen=new Intent(RenewActivity.this, RenewActivity2.class);
                    nextscreen.putExtra("policy",pol);
                    nextscreen.putExtra("engine number",en);
                    nextscreen.putExtra("vehicle",ve);
                    nextscreen.putExtra("amount",am);
                    startActivity(nextscreen);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(RenewActivity.this, HomeActivity.class));
                }
            });
        }

    }
