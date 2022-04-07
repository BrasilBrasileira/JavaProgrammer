
    import java.util.Date;
    public class JavaDateGetYearExample1 {
        public static void main(String[] args) {
            Date d=new Date();
            int year=d.getYear();
            System.out.println("Year for date object is : "+year);
            System.out.println("***To get current year add 1900 to the value of year obtained from this date object***");
            int currentYear=year+1900;
            System.out.println("Current year is : "+currentYear);
        }
    }

