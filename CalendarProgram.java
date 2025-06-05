package javaprograms;
import java.util.Calendar;
import java.util.Scanner;
public class CalendarProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for year and month
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        // Create a calendar instance
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        // Get day of the week and total days in the month
        int firstDay = calendar.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Print calendar header
        System.out.println("\nCalendar for " + year + ", " + month);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		for (int i = 1; i < firstDay; i++) {
            System.out.print("    ");
        }
		for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
			if ((day + firstDay - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
		scanner.close();
    }
}