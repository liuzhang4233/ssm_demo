package ssm.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaseDaoImpl<T> implements BaseDao<T> {
    @Override
    public List<T> selectList(T t) {
        return null;
    }

    @Override
    public List<T> selectList(String id) {
        return null;
    }

    @Override
    public T add(T t) {
        return null;
    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public T update(T t) {
        return null;
    }
}
