import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Gigasecond {

    private final LocalDateTime moment;

    public Gigasecond(LocalDate moment) {
        this.moment = LocalDateTime.of(moment, LocalTime.MIDNIGHT);
    }

    public Gigasecond(LocalDateTime moment) {
        this.moment = moment;
    }

    public LocalDateTime getDateTime() {
        return moment.plusSeconds(1000000000L);
    }
}
