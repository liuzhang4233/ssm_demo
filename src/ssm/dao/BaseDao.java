package ssm.dao;

import ssm.po.User;

import java.util.List;

public interface BaseDao<T> {

    List<T> selectList(T t);

    List<T> selectList(String id);

    T add(T t);

    void delete(T t);

    void delete(String id);

    T update(T t);
}
