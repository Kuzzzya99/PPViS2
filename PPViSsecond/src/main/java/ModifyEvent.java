public class ModifyEvent implements Command {

    UIModel m;
    private EventRepository repository;

    @Override
    public UIModel action() {
        return m;
    }
}