

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Event {
    private String description;
    private User author;
    private Date date;
    private Address address;
    private List<RegistrationToEvent> registrations;
    private EventStatus status;
    private Time duration;

    List<User> list;
    int freeSpaces;

    public int countFreeSpaces(){
        return freeSpaces;
    }

    public List<User> findParticipants(){
        return list;
    }
}
