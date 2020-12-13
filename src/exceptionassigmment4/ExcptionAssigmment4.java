/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionassigmment4;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ExcptionAssigmment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TimeOfDay myTime = new TimeOfDay();
        myTime.setTimeTo("10: 44 pm");
        Scanner s = new Scanner(System.in);
        String timePattern = "HH:mm am";
        System.out.println("Enter time (hh:mm (am , pm) )");
        String time = s.nextLine();
        myException mte = new myException();
        try {
            mte.checkTime(time);
        } catch (InvalidSuffixException | InvalidHourException | InvalidMinuteException | MyInvalidInputException ex) {
            System.err.println(ex.getMessage());
        }

    }

}
