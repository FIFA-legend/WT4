package by.bsuir.kolodko.repository.creator;

import by.bsuir.kolodko.database.ConnectionPool;
import by.bsuir.kolodko.repository.impl.RoomRepository;
import by.bsuir.kolodko.repository.impl.UserRepository;

import java.sql.Connection;

public class RepositoryCreator implements AutoCloseable {

    private final ConnectionPool connectionPool;

    private final Connection connection;

    public RepositoryCreator() {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.getConnection();
    }

    public UserRepository getUserRepository() {
        return new UserRepository(connection);
    }

    public RoomRepository getRoomRepository() {
        return new RoomRepository(connection);
    }

    @Override
    public void close() {
        connectionPool.returnConnection(connection);
    }
}
