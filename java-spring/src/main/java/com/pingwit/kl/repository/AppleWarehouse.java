package com.pingwit.kl.repository;

import com.pingwit.kl.entity.Apple;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AppleWarehouse {
    private static final String URL = "jdbc:postgresql://localhost:5432/first_dat";
    private static final String USER = "postgres";
    private static final String PASSWORD = "docker";
    private static final String a = "*";

    public List<Apple> getAll() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        List<Apple> applies;
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM apple_warehouse");

            applies = new ArrayList<>();
            //Map<Long, Apple> applies = new HashMap<>();

            while (rs.next()) {
                Apple apple = new Apple(rs.getLong(1), rs.getString(2),
                        rs.getString(3), rs.getInt(4),
                        rs.getDouble(5));
                applies.add(apple);
            }
            //System.out.println(applies);
            applies.forEach(System.out::println);
        }
        return applies;
    }

    public List<Apple> getById(Long Id) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        List<Apple> applies;
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM apple_warehouse WHERE name = Prince");

            applies = new ArrayList<>();
            //Map<Long, Apple> applies = new HashMap<>();

            while (rs.next()) {
                Apple apple = new Apple(rs.getLong(1), rs.getString(2),
                        rs.getString(3), rs.getInt(4),
                        rs.getDouble(5));
                applies.add(apple);
            }
            //System.out.println(applies);
            applies.forEach(System.out::println);
        }
        return applies;
    }
}
