package assingment2;

public class DataCoupling {
    public class Rectangle
    {
        double height;
        double length;
        public void Rectangle(double h, double l)
        {
            this.height=h;
            this.length=l;
        }
    }

    public class CalculateArea
    {
        public double Area(Rectangle rr)
        {
            return rr.length*rr.height;
        }

    }

}
/*
---Explanation---
    The CalculateArea class has a method named Area. This method takes the instance of Rectangle class as a parameter
    and calculate the area of that Rectangle.
 */
