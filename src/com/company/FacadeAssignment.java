package com.company;

public class FacadeAssignment {
    Assignment assignment = new Assignment();
    StudentState studentState = new StudentState();
    Student student = new Student();

    public void doTasks() {
        assignment.doAssignment();
        student.solveProblems(studentState);
        studentState.work();
        student.solveProblems(studentState);
        studentState.Rest();
    }
}
