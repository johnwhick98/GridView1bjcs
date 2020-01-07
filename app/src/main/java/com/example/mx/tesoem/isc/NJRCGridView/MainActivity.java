package com.example.mx.tesoem.isc.NJRCGridView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gvdatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvdatos=findViewById(R.id.gvDatos);

        String[] arreglo= new String[]{"num-1","num-2","num-3","num-4"
                ,"num-5","num-6","num-7","num-8","num-9","num-10","num-11","num-12"
                ,"num-13","num-14","num-15","num-16","num-17","num-18","num-19","num-20"
                ,"num-21","num-22","num-23","num-24","num-25","num-26","num-27","num-28"
                ,"num-29","num-30","num-31","num-32","num-33","num-34","num-35","num-36"
                ,"num-37","num-38","num-39","num-40","num-41","num-42","num-43","num-44"
                ,"num-45","num-46","num-47","num-48","num-49","num-50","num-51","num-52"
                ,"num-53","num-54","num-55","num-56","num-57","num-58","num-59","num-60"
                ,"num-61","num-62","num-63","num-64","num-65","num-66","num-67","num-68"
                ,"num-69","num-70","num-71","num-72","num-73","num-74","num-75","num-76"
                ,"num-77","num-78","num-79","num-80"};
        ArrayAdapter adaptador= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arreglo);
        gvdatos.setAdapter(adaptador);
    }
}
