package vn.techmaster;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formater {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        // Covert LocalDate --> String
        String strDate = ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(strDate);

        // Môt số pattern khác :
        System.out.println(ld.format(DateTimeFormatter.ofPattern("dd MMM, yyyy")));
        System.out.println(ld.format(DateTimeFormatter.ofPattern("dd MMMM, yyyy")));
        System.out.println(ld.format(DateTimeFormatter.ISO_DATE));
        System.out.println(ld.format(DateTimeFormatter.ISO_WEEK_DATE));

        // Covert String --> LocalDate
        String strDate1 = "22/05/2022";
        LocalDate ld4 = LocalDate.parse(strDate1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(ld4);
    }
}
