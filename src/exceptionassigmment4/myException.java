/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionassigmment4;

 

/**
 *
 * @author hp
 */
public class myException extends Exception {

    public myException(String mas) {
        super(mas);
    }

    public myException() {

    }

    public void checkTime(String time) throws InvalidSuffixException, InvalidHourException, MyInvalidInputException, InvalidMinuteException {
        String timePattern = "HH:mm am";
        if (timePattern.length() == time.length()) {
            String[] split = time.split(":");
            int h = Integer.parseInt(split[0]);
            int m = Integer.parseInt(split[1].split(" ")[0]);
            String c = split[1].split(" ")[1];

            if (h >= 0 && h <= 12) {
                System.out.println("valid houre input  ");
                if (m > 0 && m < 60) {
                    System.out.println("valid munite ");

                } else {
                    throw new InvalidMinuteException();
                }

                if (c.equalsIgnoreCase("am") || c.equalsIgnoreCase("pm")) {
                    System.out.println("valid Suffix ");
                } else {
                    throw new InvalidSuffixException();

                }
            } else {
                throw new InvalidHourException();
            }
        } else {
            throw new MyInvalidInputException();
        }

    }

}
