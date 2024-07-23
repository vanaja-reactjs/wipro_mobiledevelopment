package com.example.democar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegistrationActivity extends AppCompatActivity {
    EditText username,password,conpassword,email;
    Button btn;
    TextView tv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        username=findViewById(R.id.reg_user);
        password=findViewById(R.id.regPassword);
        conpassword=findViewById(R.id.confirm_Password);
        email=findViewById(R.id.regemail_user);
        btn=findViewById(R.id.btnregistor);
        tv=findViewById(R.id.exitUser);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String ema = email.getText().toString();
                String pass = password.getText().toString();
                String conpass = conpassword.getText().toString();
                Databases db=new Databases(getApplicationContext(),"loginapp",null,1);
                if (user.isEmpty() || pass.isEmpty() || ema.isEmpty() || conpass.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Fill Required Fields", Toast.LENGTH_SHORT).show();
                } else {
                    if (pass.compareTo(conpass) == 0) {
                        if (isValid(pass)) {
                            db.register(user,ema,pass);
                            Toast.makeText(getApplicationContext(), "registration successful", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
                        } else {
                            Toast.makeText(getApplicationContext(), "password atleast having letters digits and special characters", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Password and confirm password didn't match", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public static boolean isValid(String passwordchar){
        int f1=0,f2=0,f3=0;
        if(passwordchar.length()<8){
            return false;
        }
        else {
            for (int i = 0; i < passwordchar.length(); i++) {
                if (Character.isLetter(passwordchar.charAt(i))) {
                    f1 = 1;
                }
            }
            for (int j = 0; j < passwordchar.length(); j++) {
                if (Character.isDigit(passwordchar.charAt(j))) {
                    f2 = 1;
                }
            }
            for (int k = 0; k < passwordchar.length(); k++) {
                char c = passwordchar.charAt(k);
                if (c >= 33 && c <= 46 || c == 64) {
                    f3 = 1;
                }
            }
            if (f1 == 1 && f2 == 1 && f3 == 1)
                return true;
            return false;
        }
    }
}