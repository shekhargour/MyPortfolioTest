package com.example.myportfoilio;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmployeeViewHolder extends RecyclerView.ViewHolder {

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

