package persistence;

import java.util.List;
import product.*;

public interface ProductDAO {

    void save(Product product);

    List<Product> getAll();

    void update(Product product);

    void delete(String id);
}