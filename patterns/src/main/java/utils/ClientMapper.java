package utils;

import entities.Address;
import entities.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientMapper {
    private final Connection connection;

    public ClientMapper(Connection connection) {
        this.connection = connection;
    }

    public Client findById(long cliendId) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "SELECT id, clientName, telephoneNum, address FROM clients WHERE id =?");
        statement.setLong(1, cliendId);
        try (ResultSet resultSet = statement.executeQuery()) {
            Client client = new Client();
            client.setId(resultSet.getLong(1));
            client.setClientName(resultSet.getString(2));
            client.setTelephoneNum(resultSet.getInt(3));
            client.setAddress((Address) resultSet.getObject(4));
            return client;
        }
    }

    public void insert(Client client) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO clients (id, clientName, telephoneNum, address) VALUES " +
                        "(?, ?, ?, ?)");
        statement.setLong(1, client.getId());
        statement.setString(2, client.getClientName());
        statement.setInt(3, client.getTelephoneNum());
        statement.setObject(4, client.getAddress());
        statement.execute();
    }

    public void updateById(Client client) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "UPDATE clients SET clientName=?, telephoneNum=?, address=? WHERE id =?");
        statement.setString(1, client.getClientName());
        statement.setInt(2, client.getTelephoneNum());
        statement.setObject(3, client.getAddress());
        statement.setLong(4, client.getId());
        statement.execute();

    }

    public void delete(Client client) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "DELETE FROM clients WHERE clientId=?");
        statement.setLong(1, client.getId());
        statement.execute();
    }
}
