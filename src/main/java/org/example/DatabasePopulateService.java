package org.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.Statement;

public class DatabasePopulateService {
    public static void main(String[] args) throws Exception {
        String sql = Files.readString(Path.of("sql/populate_db.sql"));

        Connection conn = Database.getInstance().getConnection();

        try (Statement statement = conn.createStatement()) {
            statement.execute(sql);
        }

        System.out.println("Database populated");
    }
}