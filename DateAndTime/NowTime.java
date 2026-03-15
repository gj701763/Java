package DateAndTime;

import java.time.LocalDate;

public class NowTime {
    public static void main(String x[]) {
        LocalDate today = LocalDate.now();
        System.out.println("Order placed " + today);
        LocalDate delDate = LocalDate.of(2026, 3, 12);
        System.out.println("Order can deliver " + delDate);

    }

}
