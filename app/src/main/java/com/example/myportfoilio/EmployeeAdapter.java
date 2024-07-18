package com.example.myportfoilio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {

    private List<Employee> employeeList;

    public EmployeeAdapter(List<Employee> employees) {
        this.employeeList = employees;
    }

    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_employee, parent, false);
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        Employee employee = employeeList.get(position);
        holder.bind(employee);
    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    public static class EmployeeViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewName;
        private TextView textViewPosition;
        private TextView textViewDepartment;
        private TextView textViewSalary;
        private TextView textViewJoinDate;

        public EmployeeViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewPosition = itemView.findViewById(R.id.textViewPosition);
            textViewDepartment = itemView.findViewById(R.id.textViewDepartment);
            textViewSalary = itemView.findViewById(R.id.textViewSalary);
            textViewJoinDate = itemView.findViewById(R.id.textViewJoinDate);
        }

        public void bind(Employee employee) {
            textViewName.setText(employee.getName());
            textViewPosition.setText(employee.getPosition());
            textViewDepartment.setText(employee.getDepartment());
            textViewSalary.setText(String.valueOf(employee.getSalary()));
            textViewJoinDate.setText(employee.getJoinDate());
        }
    }
}

