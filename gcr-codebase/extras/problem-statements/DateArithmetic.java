import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.now();
        System.out.println("Starting Date: " + startDate);

        LocalDate resultDate = startDate.plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        System.out.println("After adding 7 days, 1 month, 2 years: " + resultDate);

        LocalDate finalDate = resultDate.minusWeeks(3);

        System.out.println("After subtracting 3 weeks: " + finalDate);
    }
}
