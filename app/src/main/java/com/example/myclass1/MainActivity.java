package com.example.myclass1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox dog,cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dog=findViewById(R.id.dog);
        cat=findViewById(R.id.cat);
        dog.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast toast=Toast.makeText(MainActivity.this, "checked1"+ b, Toast.short);
                toast.setGravity(Gravity.CENTER_HORIZONTAL);
                toast.show();

                cat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        Toast toast=Toast.makeText(MainActivity.this, "checked1"+ b, Toast.short);
                        toast.setGravity(Gravity.CENTER_HORIZONTAL);
                        toast.show();

            }
        });
    }
}
