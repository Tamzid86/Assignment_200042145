package assingment2;

public class ContentCoupling {
     class example
    {
        public int salary=40000;
    }

    public void main(String[] args)
    {
        example ex= new example();
        ex.salary = 50000;
    }
}
/*
---Explanation---
here, The main class directly modifies the content of another class named Example.
 */
