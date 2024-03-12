package com.example.testEasyRules.rule;

import org.jeasy.rules.annotation.*;

@Rule(name = "MyRule", description = "Description of My Rule")
public class MyRule {

    @Condition
    public boolean myCondition() {
        // Define your condition logic here
        return true; // Example condition always evaluates to true
    }

    @Action
    public void myAction() {
        // Define your action logic here
        System.out.println("Action of My Rule executed!");
    }
}