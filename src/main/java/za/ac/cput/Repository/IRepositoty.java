package za.ac.cput.Repository;
@Deprecated
public interface IRepositoty<T, ID>{

    public T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);

}
