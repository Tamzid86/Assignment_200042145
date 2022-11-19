package assingment2.Independence;

import java.util.Scanner;

public class independence {
    public class person
    {
        String name;
        int age;
        String designation;

        public void Find_hobby()
        {
            String hobby;
            Scanner sc= new Scanner(System.in);
            hobby = sc.nextLine();
            System.out.println("Hobby is "+ hobby);
        }
    }

    public class mobile
    {
        String model;
        int price;
        int number_of_days_of_warranty;

        public void Find_BatteryHealth()
        {
            String health;
            Scanner sc= new Scanner(System.in);
            health = sc.nextLine();
            System.out.println("Hobby is "+ health);
        }

    }
    /* --- Explanation --- */
    /* There exist two classes in the independence class. Both of them are independent class because none of them
     depend on another one.
     */
}
