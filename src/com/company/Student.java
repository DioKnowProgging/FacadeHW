package com.company;

public class Student {
    public void solveProblems(StudentState studentState) {
        if (!studentState.exhaustState()){
            System.out.println("Student is solving problem");
        }else {
            System.out.println("Student is chilling");
        }
    }
}
