package repository;

import java.util.List;

public interface GenericRepository<T, ID> {

    void save(T entity);

    List<T> getAll();

    T findById(ID id);

    void update(T entity);

    void delete(ID id);
}