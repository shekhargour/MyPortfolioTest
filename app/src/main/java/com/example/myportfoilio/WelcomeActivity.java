package com.example.myportfoilio;



import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WelcomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EmployeeAdapter adapter;
    private List<Employee> employeeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerViewEmployees);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize employee data (replace with your actual data retrieval)
        initializeEmployees();

        // Initialize and set adapter
        adapter = new EmployeeAdapter(employeeList);
        recyclerView.setAdapter(adapter);
    }

    private void initializeEmployees() {
        // Sample data - Replace with your actual data retrieval logic
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ritya", "Manager", "IT", 5000.0, "2023-01-01"));
        employeeList.add(new Employee("Smith", "Engineer", "Engineering", 4500.0, "2022-12-15"));
        employeeList.add(new Employee("Michael Jackson", "Developer", "IT", 4000.0, "2023-02-20"));
        employeeList.add(new Employee("Emma watson", "Designer", "Creative", 3800.0, "2023-03-10"));
        employeeList.add(new Employee("Dawood gunman", "Analyst", "Finance", 4200.0, "2023-04-05"));
    }
}


