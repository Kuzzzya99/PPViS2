public class DeleteEvent implements Command {

    UIModel m;
    private EventRepository repository;

    @Override
    public UIModel action() {
        return m;
    }
}