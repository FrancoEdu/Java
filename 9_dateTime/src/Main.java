import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //instanciação
        // agora -> data - hora
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();

        //date time GMT, local hour of London.
        Instant d03 = Instant.now();

        //text ISO 8601
        LocalDate d04 = LocalDate.parse("2022-12-07");
        LocalDateTime d05 = LocalDateTime.parse("2022-12-07T18:10:45");

        //Hour of UTC default
        Instant d06 = Instant.parse("2022-12-07T18:10:45Z");

        Instant d07 = Instant.parse("2022-12-07T18:10:45-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2022",fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30",fmt2);

        LocalDate d10 = LocalDate.of(2022,7,20);

        //----------------------------------------------------------------------------
        LocalDate d11 = LocalDate.parse("2022-12-07");
        LocalDateTime d12 = LocalDateTime.parse("2022-12-07T18:10:45");
        Instant d13 = Instant.parse("2022-12-07T18:10:45Z");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Local date: " + d01);
        System.out.println("Local date and time = " + d02);
        System.out.println("London time: " + d03);
        System.out.println("ISO 8601 = "+ d04);
        System.out.println("ISO 8601 = "+ d05);
        System.out.println("ISO 8601 with UTC = "+ d06);
        System.out.println("ISO 8601 with UTC = "+ d07);
        System.out.println("Formatter data = "+ d08);
        System.out.println("Formatter data and time= "+ d09);
        //----------------------------------------------------------------------------
        System.out.println("//----------------------------------------------------------------------------//");
        System.out.println("D11 = " + d11.format(fmt3));
        System.out.println("D11 = " + fmt3.format(d11));
        System.out.println("D11 = " + d11.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("D12 = " + d12.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println(String.format("D13 = " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()).format(d13)));

        //------------ CONVERTENDO DATA-HORA GLOBAL PARA LOCAL -----------//
        System.out.println("//------------ CONVERTENDO DATA-HORA GLOBAL PARA LOCAL -----------//");

    }
}