package ssm.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaseDaoImpl<T> implements BaseDao<T> {
    public List<T> selectList(T t) {
        return null;
    }

    public List<T> selectList(String id) {
        return null;
    }

    public T add(T t) {
        return null;
    }

    public void delete(T t) {

    }

    public void delete(String id) {

    }

    public T update(T t) {
        return null;
    }
}
