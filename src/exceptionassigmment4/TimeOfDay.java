/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionassigmment4;

/**
 *
 * @author hp probook 450g5
 */
public class TimeOfDay extends myException {

    public TimeOfDay(String mas) {
        super(mas);
    }

    public TimeOfDay() {
    }

    public static boolean setTimeTo(String s) {
        String[] str = s.split(":");
        try {

            int i = Integer.parseInt(str[0]);
            if (i > 12 || i < 1) {
                return false;
            }
            String sub = str[1].substring(0, 2);

            int j = Integer.parseInt(sub);
            if (j > 59 || j < 0) {
                return false;
            }
            String sub2 = str[1].substring(2, 4);
            if (sub2.equalsIgnoreCase("am") || sub2.equalsIgnoreCase("pm")) {

                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }
}
