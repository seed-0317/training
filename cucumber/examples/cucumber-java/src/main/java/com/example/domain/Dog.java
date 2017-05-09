package com.example.domain;

public class Dog {

    private boolean isRested;

    public void setRested(boolean rested) {
        isRested = rested;
    }

    public boolean catchesFrisbee(){
        if(isRested) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNapping() {
        if(isRested) {
            return false;
        } else {
            return true;
        }
    }

}
