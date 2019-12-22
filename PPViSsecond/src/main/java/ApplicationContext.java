public class ApplicationContext {
    Repository rep;
    Command com;
    public Repository createRepository (String repositoryName){
        return rep;
    }
    public Command createCommand (String commandName){
        return com;
    }

}
