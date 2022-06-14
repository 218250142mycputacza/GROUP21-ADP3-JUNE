package za.ac.cput.repository;

import java.util.Optional;

/*Warren Jaftha-219005303*/
public interface IRepository<T,ID> {
    T save (T t);
    Optional<T> read(ID id);
    void delete (T t);
}
