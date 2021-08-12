package Patryk.company.testXTB;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MeetingRepo {
    Map<Book, Set<Meeting>> meetingRepoMap = new HashMap<>();

    public Map<Book, Set<Meeting>> getMeetingRepoMap() {
        return meetingRepoMap;
    }
}
