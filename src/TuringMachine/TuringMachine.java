/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuringMachine;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Ameer Ayman
 */
public class TuringMachine {

    static LinkedList state;
    public static void main(String[] args) {
        
        Nodes n = new Nodes();
        Scanner input = new Scanner(System.in);
        char symbol;
        char ch = 'E';
        while (true) {
            System.out.println("Enter the string");
            String st = input.next();
            st = st + ch;
            n.linkedNodes();
            char[] inputString = st.toCharArray();
            int i = 0;
            n.setCurrentState((String) state.get(0));
            while (i < inputString.length) {
                symbol = inputString[i];
                if ("startState".equals(n.getCurrentState())) {
                    switch (symbol) {
                        case '0':
                            inputString[i] = 'E';
                            n.setCurrentState((String) state.get(1));
                            i++;
                            break;
                        case 'x':
                            n.setCurrentState((String) state.get(6));
                            break;
                        case 'E':
                            n.setCurrentState((String) state.get(6));
                            break;
                    }
                }

                else if ("q1".equals(n.getCurrentState())) {
                    symbol = inputString[i];
                    switch (symbol) {
                        case 'E':
                            n.setCurrentState((String) state.get(5));
                            i++;
                            break;
                        case '0':
                            inputString[i] = 'x';
                            i++;
                            n.setCurrentState((String) state.get(3));
                            break;
                        case 'x':
                            n.setCurrentState((String) state.get(1));
                            i++; 
                            break;

                    }
                }
                else if ("q3".equals(n.getCurrentState())) {
                    symbol = inputString[i];
                    switch (symbol) {
                        case '0':
                            n.setCurrentState((String) state.get(4));
                            i++;
                            break;
                        case 'x':
                            n.setCurrentState((String) state.get(3));
                            i++;
                            break;
                        case 'E':
                            n.setCurrentState((String) state.get(2));
                            i--;
                            break;
                    }

                }
                else if ("q2".equals(n.getCurrentState())) {
                    symbol = inputString[i];
                    switch (symbol) {
                        case '0':
                            n.setCurrentState((String) state.get(2));
                            i--;
                            break;
                        case 'x':
                            n.setCurrentState((String) state.get(2));
                            i--;
                            break;
                        case 'E':
                            n.setCurrentState((String) state.get(1));
                            i++;
                            break;
                    }

                }
                else if ("q4".equals(n.getCurrentState())) {
                    switch (symbol) {
                        case '0':
                            inputString[i] = 'x';
                            n.setCurrentState((String) state.get(3));
                            i++;
                            break;
                        case 'x':
                            n.setCurrentState((String) state.get(4));
                            i++;
                            break;
                        case 'E':
                            n.setCurrentState((String) state.get(6));
                            i++;
                            break;
                    }
                }

            }
            System.out.println("The string of the tape ");
            for (int j = 0; j < inputString.length; j++) {
                System.out.print(inputString[j ]);
            }
            System.out.println();
            n.validation(n.getCurrentState());
            System.out.println("-------------------------");
        }
    }

}
