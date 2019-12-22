import java.util.ArrayList;
import java.util.List;

public class EventRepository implements Repository<Event> {

    Event event;
    List<Event> list;

    public List<Event> findAll(){
        return list;
    }

    @Override
    public Integer Create(Event event) {
        return 1;
    }

    @Override
    public void Delete(int id) {

    }

    @Override
    public Event Read() {
        return event;
    }

    @Override
    public void Update(Event event) {

    }
}
