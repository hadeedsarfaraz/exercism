class Leap {

    boolean isLeapYear(int year) {
        boolean leap = (year%4==0);
        if (year%100==0)
            return (year%400==0);
        else return leap;
    }

}
