package assingment2;

public class StampCoupling {

    public int[] array = {6, 5, 4, 3, 2, 1};

    public class anotherCoupling
    {
        public void Print_ArrayLength(StampCoupling sc)
        {
            System.out.println("The array length is: "+ sc.array.length);
        }
    }

}
/*
 --- Explanation ---
    Here, StampCoupling class has an array and AnotherCoupling class has a method which prints the length of an array.
    But it takes a whole instance of a class as parameter here that array is stored. Then the method uses a small part of
    that object.
 */

