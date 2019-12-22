public interface Repository<T> {

    Integer Create(T t);

    void Delete(int id);

    T Read();

    void Update(T t);
}
