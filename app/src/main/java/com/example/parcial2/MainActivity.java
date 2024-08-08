package com.example.parcial2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private TextView menu1, menu2, menu3, menu4,menu5, menu6, menu7, menu8, menu9, menu10, menu11, menu12, menu13, menu14, menu15, menu16, menu17, menu18, menu19, menu20, ingredientes1, ingredientes2,ingredientes3,ingredientes4,ingredientes5,ingredientes6,ingredientes7,ingredientes8,ingredientes9,ingredientes10,ingredientes11,ingredientes12,ingredientes13,ingredientes14,ingredientes15,ingredientes16,ingredientes17,ingredientes18,ingredientes19,ingredientes20;
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button19,button20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference("menus");

            menu1 = findViewById(R.id.menu1);
            ingredientes1 = findViewById(R.id.ingredientes1);
            button1 = findViewById(R.id.button1);

            String text1_menu1 = menu1.getText().toString();
            String text2_menu1 = ingredientes1.getText().toString();


            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HashMap<String, Object> menu = new HashMap<>();
                    menu.put("menu", text1_menu1);
                    menu.put("ingredientes", text2_menu1);
                    myRef.push().setValue(menu);
                    Toast.makeText(MainActivity.this, "orden tomada", Toast.LENGTH_SHORT).show();
                }
            });
            menu3 = findViewById(R.id.menu3);
            ingredientes3 = findViewById(R.id.ingredientes3);
            button3 = findViewById(R.id.button3);

            String text1_menu3 = menu3.getText().toString();
            String text2_menu3 = ingredientes3.getText().toString();


            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HashMap<String, Object> menu = new HashMap<>();
                    menu.put("menu", text1_menu3);
                    menu.put("ingredientes", text2_menu3);
                    myRef.push().setValue(menu);
                }
            });
            menu4 = findViewById(R.id.menu4);
            ingredientes4 = findViewById(R.id.ingredientes4);
            button4 = findViewById(R.id.button4);

            String text1_menu4 = menu4.getText().toString();
            String text2_menu4 = ingredientes4.getText().toString();


            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HashMap<String, Object> menu = new HashMap<>();
                    menu.put("menu", text1_menu4);
                    menu.put("ingredientes", text2_menu4);
                    myRef.push().setValue(menu);
                }
            });
            menu5 = findViewById(R.id.menu5);
            ingredientes5 = findViewById(R.id.ingredientes5);
            button5 = findViewById(R.id.button5);

            String text1_menu5 = menu5.getText().toString();
            String text2_menu5 = ingredientes5.getText().toString();


            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HashMap<String, Object> menu = new HashMap<>();
                    menu.put("menu", text1_menu5);
                    menu.put("ingredientes", text2_menu5);
                    myRef.push().setValue(menu);
                }
            });
            menu6 = findViewById(R.id.menu6);
            ingredientes6 = findViewById(R.id.ingredientes6);
            button6 = findViewById(R.id.button6);

            String text1_menu6 = menu6.getText().toString();
            String text2_menu6 = ingredientes6.getText().toString();


            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HashMap<String, Object> menu = new HashMap<>();
                    menu.put("menu", text1_menu6);
                    menu.put("ingredientes", text2_menu6);
                    myRef.push().setValue(menu);
                }
            });
            menu7 = findViewById(R.id.menu7);
            ingredientes7 = findViewById(R.id.ingredientes7);
            button7 = findViewById(R.id.button7);

            String text1_menu7 = menu7.getText().toString();
            String text2_menu7 = ingredientes7.getText().toString();


            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HashMap<String, Object> menu = new HashMap<>();
                    menu.put("menu", text1_menu7);
                    menu.put("ingredientes", text2_menu7);
                    myRef.push().setValue(menu);
                }
            });
            menu8 = findViewById(R.id.menu8);
            ingredientes8 = findViewById(R.id.ingredientes8);
            button8 = findViewById(R.id.button8);

            String text1_menu8 = menu8.getText().toString();
            String text2_menu8 = ingredientes8.getText().toString();


            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HashMap<String, Object> menu = new HashMap<>();
                    menu.put("menu", text1_menu8);
                    menu.put("ingredientes", text2_menu8);
                    myRef.push().setValue(menu);
                }
            });
            menu9 = findViewById(R.id.menu9);
            ingredientes9 = findViewById(R.id.ingredientes9);
            button9 = findViewById(R.id.button9);

            String text1_menu9 = menu9.getText().toString();
            String text2_menu9 = ingredientes9.getText().toString();


            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HashMap<String, Object> menu = new HashMap<>();
                    menu.put("menu", text1_menu9);
                    menu.put("ingredientes", text2_menu9);
                    myRef.push().setValue(menu);
                }
            });
            menu10 = findViewById(R.id.menu10);
            ingredientes10 = findViewById(R.id.ingredientes10);
            button10 = findViewById(R.id.button10);

            String text1_menu10 = menu10.getText().toString();
            String text2_menu10 = ingredientes10.getText().toString();


            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HashMap<String, Object> menu = new HashMap<>();
                    menu.put("menu", text1_menu10);
                    menu.put("ingredientes", text2_menu10);
                    myRef.push().setValue(menu);
                }
            });
            menu11 = findViewById(R.id.menu11);
            ingredientes11 = findViewById(R.id.ingredientes11);
            button11 = findViewById(R.id.button11);

            String text1_menu11 = menu11.getText().toString();
            String text2_menu11 = ingredientes11.getText().toString();


            button11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HashMap<String, Object> menu = new HashMap<>();
                    menu.put("menu", text1_menu11);
                    menu.put("ingredientes", text2_menu11);
                    myRef.push().setValue(menu);
                }
            });
            menu12 = findViewById(R.id.menu12);
            ingredientes12 = findViewById(R.id.ingredientes12);
            button12 = findViewById(R.id.button12);

            String text1_menu12 = menu12.getText().toString();
            String text2_menu12 = ingredientes12.getText().toString();


            button12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HashMap<String, Object> menu = new HashMap<>();
                    menu.put("menu", text1_menu12);
                    menu.put("ingredientes", text2_menu12);
                    myRef.push().setValue(menu);
                }
            });
            menu13 = findViewById(R.id.menu13);
            ingredientes13 = findViewById(R.id.ingredientes13);
            button13 = findViewById(R.id.button13);

            String text1_menu13 = menu13.getText().toString();
            String text2_menu13 = ingredientes13.getText().toString();


            button13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HashMap<String, Object> menu = new HashMap<>();
                    menu.put("menu", text1_menu13);
                    menu.put("ingredientes", text2_menu13);
                    myRef.push().setValue(menu);
                }
            });
            menu14 = findViewById(R.id.menu14);
            ingredientes14 = findViewById(R.id.ingredientes14);
            button14 = findViewById(R.id.button14);

            String text1_menu14 = menu14.getText().toString();
            String text2_menu14 = ingredientes14.getText().toString();


            button14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HashMap<String, Object> menu = new HashMap<>();
                    menu.put("menu", text1_menu14);
                    menu.put("ingredientes", text2_menu14);
                    myRef.push().setValue(menu);
                }
            });
            return insets;
        });
    }
}