package week1.two;


public class Birthdate {

    private final int day;
    private final int month;
    private final int year;

    public Birthdate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    @Override
    public String toString() {
        return "born on the " +  day +  " of " + getMonth(month) + " " + year  ;
    }



    private String getMonth(int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        if (month < 1 || month > 12) {
            throw new RuntimeException("month must be in range 1 to 12");
        }

        return months[month - 1];
    }

}
