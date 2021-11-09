package com.company;

public class StudentState {
    private boolean isExhausted = false;

    public boolean exhaustState() {
        return isExhausted;
    }

    public void work(){
        System.out.println("Hard work...");
        isExhausted = true;
    }

    public void Rest(){
        System.out.println("Chill...");
        isExhausted = false;
    }



}
