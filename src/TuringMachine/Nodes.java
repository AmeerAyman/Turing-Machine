/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuringMachine;

import java.util.LinkedList;
import static TuringMachine.TuringMachine.state;

/**
 *
 * @author Ameer Ayman
 */
public class Nodes {
    private String currentState;

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }
    
     public void validation(String state)
    {
        if("acceptState".equals(state))
            System.out.println("the string is accepted");
        else
            System.out.println("the string is rejected");
    }
     
     
     public void linkedNodes() {
        state = new LinkedList();
        state.add("startState");
        state.add("q1");
        state.add("q2");
        state.add("q3");
        state.add("q4");
        state.add("acceptState");
        state.add("rejectState");

    }
    
}
