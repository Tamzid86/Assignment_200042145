package assingment2;

import java.util.Scanner;

public class ControlCoupling {
    int number;

    public class AnotherCoupling
    {
        ControlCoupling a = new ControlCoupling();
        Scanner sc= new Scanner(System.in);
        int value = Integer.parseInt(sc.nextLine());
        public void printer(int val)
        {
            if(val==number)
            {
                System.out.println("Mission Successful");
            }
            else
            {
                System.out.println("Mission failed");
            }
        }

    }
}
/*
--- Explanation ---
    Here, The outcome of the printer method in the AnotherCoupling class depends on the ControlCoupling class directly.
 */
