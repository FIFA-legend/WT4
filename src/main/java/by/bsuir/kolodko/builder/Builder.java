package by.bsuir.kolodko.builder;

import by.bsuir.kolodko.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
