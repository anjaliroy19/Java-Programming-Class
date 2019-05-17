package Month;
public class Month {
private int monthNumber;

/**
 * Creates a new month set to January
 */
public Month(){
    monthNumber = 1;
}

/**
 * Creates a month set to the month number provided by the user
 * @param m the number of the month
 */
public Month(int m) throws MonthsNumberException{
    if (m<1 || m>12){
       throw new MonthsNumberException("Number has to be greater than or equal to 1 and less than 12");
    }else{
        monthNumber = m;
    }
}

/**
 * Creates a month based on the string name provided
 * @param m String values for the name of the month
 */
public Month(String m) throws MonthsNameException{
    switch(m){
        case "January":
            monthNumber = 1;
            break;
        case "February":
            monthNumber = 2;
            break;
        case "March":
            monthNumber = 3;
            break;
        case "April":
            monthNumber = 4;
            break;
        case "May":
            monthNumber = 5;
            break;
        case "June":
            monthNumber = 6;
            break;
        case "July":
            monthNumber = 7;
            break;
        case "August": 
            monthNumber = 8;
            break;
        case "September":
            monthNumber = 9;
            break;
        case "October":
            monthNumber = 10;
            break;
        case "November":
            monthNumber = 11;
            break;
        case "December":
            monthNumber = 12;
            break;
                default:
    throw new MonthsNameException("Invalid month name: " + m);
    }
}

/**
 * changes the month to the number provided
 * @param m the number of the month
 */
public void setMonthNumber(int m) throws MonthsNumberException{
    if (m<1 || m>12){
        throw new MonthsNumberException("Number has to be greater than 1 and less than 12");

    }else{
        monthNumber = m;
    }
}

/**
 * returns the number of the month
 * @return the number of the month
 */
public int getMonthNumber(){
    return monthNumber;
}

/**
 * returns the name of the month
 * @return the name of the month
 */
public String getMonthName(){
    String month="";

    switch(monthNumber){
        case 1:
            month = "January";
            break;
        case 2:
            month = "February";
            break;
        case 3:
            month = "March";
            break;
        case 4:
            month = "April";
            break;
        case 5:
            month = "May";
            break;
        case 6:
            month = "June";
            break;
        case 7:
            month = "July";
            break;
        case 8:
            month = "August";
            break;
        case 9:
            month = "September";
            break;
        case 10:
            month = "October";
            break;
        case 11:
            month = "November";
            break;
        case 12:
            month = "December";
            break;

    }
    return month;
}

/**
 * returns a string representation of the month
 * @return the name of the month
 */
public String toString(){
    return getMonthName();
}

/**
 * if the two items are the same returns true
 * @param m the month object to compare
 * @return true if they are the same, false if not
 */
public boolean equals(Month m){
    if (m.getMonthNumber() == this.getMonthNumber()){
        return true;
    }else{
        return false;
    }
}

/**
 * If this calling item is after the month object passed as argument returns true
 * @param m the month object
 * @return true if calling object greater, false of argument greater
 */
public boolean greaterThan(Month m){
    if (this.getMonthNumber()>m.getMonthNumber()){
        return true;
    }else{
        return false;
    }
}

/**
 * If this calling item is before the month object passed as argument returns true
 * @param m the month object
 * @return true if calling object less than, false of argument less than
 */
public boolean lessThan(Month m){
    if (this.getMonthNumber()<m.getMonthNumber()){
        return true;
    }else{
        return false;
    }
}
class MonthsNumberException extends Exception
{
    public MonthsNumberException(String message)
    {
        super(message);
    }
}
class MonthsNameException extends Exception
{
    public MonthsNameException(String message)
    {
        super(message);
    }
}
}