import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Gigasecond {
    private LocalDateTime moment;
    private final long GIGASECOND = 1000000000;

    public Gigasecond(LocalDate moment) {
        this.moment = LocalDateTime.of(moment, LocalTime.of(0, 0));
    }

    public Gigasecond(LocalDateTime moment) {
        this.moment = moment;
    }

    public LocalDateTime getDateTime() {
        return moment.plusSeconds(GIGASECOND);
    }
}