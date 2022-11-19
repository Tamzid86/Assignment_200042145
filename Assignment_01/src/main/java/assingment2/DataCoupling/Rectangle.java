package assingment2.DataCoupling;

public class Rectangle {
    double height;
    double length;
    public double TotalArea(double h, double l)
    {
        this.height=h;
        this.length=l;
        Area area = new Area();
        return area.CalculateArea(h,l);

    }
}
