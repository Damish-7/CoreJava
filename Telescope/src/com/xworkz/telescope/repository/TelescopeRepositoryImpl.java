package com.xworkz.telescope.repository;

import com.xworkz.telescope.dto.TelescopeDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TelescopeRepositoryImpl implements TelescopeRepository{
    @Override
    public boolean parser(TelescopeDto telescopeDto) {
        System.out.println("running in the repository block");
        if (telescopeDto != null) {
            String url = "jdbc:mysql://localhost:3306/java";
            String username = "root";
            String password = "Meghna@8122002";
            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String time = dateTime.format(formatter);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, username, password);
                String sql = "INSERT INTO telescope VALUES (0, '" + telescopeDto.getDate() + "', " + telescopeDto.getCount() + ", " + handwashDto.isSoapUsed() + ", '" + handwashDto.getLocation() + "', " + handwashDto.getDuration() + ", '" + handwashDto.getRemarks() + "')";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
            return true;
        }
        return false;
    }
}





