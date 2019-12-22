import java.util.List;

public class UserRepository implements Repository<User> {
    List<User> userList;
    Event event;
    User user;

    public List<User> findAll(){
        return userList;
    }

    public Event findByEvent(Event event){
        return event;
    }

    @Override
    public Integer Create(User user) {
        return null;
    }

    @Override
    public void Delete(int id) {

    }

    @Override
    public User Read() {
        return null;
    }

    @Override
    public void Update(User user) {

    }
}
