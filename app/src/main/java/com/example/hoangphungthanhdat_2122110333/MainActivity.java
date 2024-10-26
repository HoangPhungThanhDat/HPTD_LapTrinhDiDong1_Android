package com.example.hoangphungthanhdat_2122110333;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button Login= findViewById(R.id.Login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText btnEmail =findViewById(R.id.TextEmail);
                String DataEmail=btnEmail.getText().toString();

                EditText btnPass=findViewById(R.id.TextPassword);
                String DataPass=btnPass.getText().toString();
                int Temp=1;
                if(Temp==1)
                {
                    Intent it = new Intent(getApplicationContext(), HomeActivity2.class);
                    it.putExtra("email",DataEmail);
                    startActivity(it);
                }
                else {
                    CharSequence text = "Hello toast!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(getApplicationContext(), "SAI THONG TIN DANG NHAP ", duration);
                    toast.show();
                }
            }

        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}