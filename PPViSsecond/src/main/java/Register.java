public class Register implements Command {

    UIModel m;
    private UserRepository repository;

    @Override
    public UIModel action() {
        return m;
    }
}