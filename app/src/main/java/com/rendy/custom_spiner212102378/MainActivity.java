package com.rendy.custom_spiner212102378;

import android.os.Bundle;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        spinner1 = (Spinner) findViewById(R.id.spinner1);

        List<String> negaraList = new ArrayList<>();
        negaraList.add("Albania");
        negaraList.add("Belgia");
        negaraList.add("Hungary");
        negaraList.add("Iran");
        negaraList.add("Solvenia");
        negaraList.add("Indonesia");

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraList);
        spinner1.setAdapter(na);
        ;
    }
}