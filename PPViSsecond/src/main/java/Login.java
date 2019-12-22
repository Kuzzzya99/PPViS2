public class Login implements Command {

    UIModel m;
    private UserRepository repository;

    @Override
    public UIModel action() {
        return m;
    }
}