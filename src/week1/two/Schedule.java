package week1.two;


public class Schedule {

    private final int day;
    private final int month;
    private final int year;
    private final String task;
    private final Person forPerson;

    public Schedule(int day, int month, int year, String task, Person person) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.task = task;
        this.forPerson = person;
    }



    @Override
    public String toString() {
        return "on " + day + "of "  + getMonth(month) + " " + year  + " we are doing " + task ;
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
