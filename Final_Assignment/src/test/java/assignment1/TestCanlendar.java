package assignment1;

import assingment1.Calendar;
import assingment1.NameOfMonths;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;


public class TestCanlendar {
    @Test
    public void DateCheck()
    {
        Calendar date1= new Calendar(31, 1,2003, NameOfMonths.January);
        Calendar ans= date1.CalculateNextDate();
        ans.printer();
        Calendar expected= new Calendar(1,2,2003, NameOfMonths.February);
        assertEquals(expected.printer(), ans.printer());
    }
    @Test
    public void CheckLeapYear()
    {
        Calendar date1= new Calendar(28, 2,2002, NameOfMonths.February);
        Calendar ans= date1.CalculateNextDate();
        ans.printer();
        Calendar expected= new Calendar(1,3,2002, NameOfMonths.March);
        assertEquals(expected.printer(), ans.printer());
    }

}
