package Patryk.company.testXTB;

import java.time.LocalDateTime;

public class Meeting {
    private final LocalDateTime time;
    private final String name;

    public Meeting(LocalDateTime time, String name) {
        this.time = time;
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getName() {
        return name;
    }
}
