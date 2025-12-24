import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneDisplay {
    public static void main(String[] args) {
        ZoneId gmtZone = ZoneId.of("GMT");
        ZoneId istZone = ZoneId.of("Asia/Kolkata");
        ZoneId pstZone = ZoneId.of("America/Los_Angeles");

        ZonedDateTime nowGmt = ZonedDateTime.now(gmtZone);
        ZonedDateTime nowIst = ZonedDateTime.now(istZone);
        ZonedDateTime nowPst = ZonedDateTime.now(pstZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        System.out.println("Current Time in GMT: " + nowGmt.format(formatter));
        System.out.println("Current Time in IST: " + nowIst.format(formatter));
        System.out.println("Current Time in PST: " + nowPst.format(formatter));
    }
}
