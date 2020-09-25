package com.sejin.classbell;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView title; // 뷰별로 구분해서 선언

    TableLayout table; // 레이아웃별로 구분해서 정리

    ArrayList[] classTime = new ArrayList[5];   // 요일 별 ArrayList 선언

    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title =findViewById(R.id.title);
        table =findViewById(R.id.tableLayout);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        // classTime Array 의 ArrayList 참조
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("1주차");
        ArrayList<Timetable> mon = new ArrayList<Timetable>();
        ArrayList<Timetable> tue = new ArrayList<Timetable>();
        ArrayList<Timetable> wed = new ArrayList<Timetable>();
        ArrayList<Timetable> thu = new ArrayList<Timetable>();
        ArrayList<Timetable> fri = new ArrayList<Timetable>();
        classTime[0] = mon;
        classTime[1] = tue;
        classTime[2] = wed;
        classTime[3] = thu;
        classTime[4] = fri;
    }

    public void addClass(View view) {
        Intent intent = new Intent(MainActivity.this,AddClassActivity.class);
        startActivity(intent);
    }

    public void editClass(View view) {

    }
}