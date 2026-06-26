package org.example;

import org.example.model.LongestProject;
import org.example.model.MaxProjectCountClient;
import org.example.model.MaxSalaryWorker;
import org.example.model.ProjectPrice;

import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {

    public List<MaxProjectCountClient> findMaxProjectsClient() throws Exception {
        String sql = Files.readString(Path.of("sql/find_max_projects_client.sql"));

        Connection conn = Database.getInstance().getConnection();
        List<MaxProjectCountClient> result = new ArrayList<>();

        try (PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                result.add(new MaxProjectCountClient(
                        rs.getString("name"),
                        rs.getInt("project_count")
                ));
            }
        }

        return result;
    }

    public List<MaxSalaryWorker> findMaxSalaryWorker() throws Exception {
        String sql = Files.readString(Path.of("sql/find_max_salary_worker.sql"));

        Connection conn = Database.getInstance().getConnection();
        List<MaxSalaryWorker> result = new ArrayList<>();

        try (PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                result.add(new MaxSalaryWorker(
                        rs.getString("name"),
                        rs.getInt("salary")
                ));
            }
        }

        return result;
    }

    public List<LongestProject> findLongestProject() throws Exception {
        String sql = Files.readString(Path.of("sql/find_longest_project.sql"));

        Connection conn = Database.getInstance().getConnection();
        List<LongestProject> result = new ArrayList<>();

        try (PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                result.add(new LongestProject(
                        rs.getInt("project_id"),
                        rs.getInt("month_count")
                ));
            }
        }

        return result;
    }

    public List<ProjectPrice> printProjectPrices() throws Exception {
        String sql = Files.readString(Path.of("sql/print_project_prices.sql"));

        Connection conn = Database.getInstance().getConnection();
        List<ProjectPrice> result = new ArrayList<>();

        try (PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                result.add(new ProjectPrice(
                        rs.getInt("project_id"),
                        rs.getInt("price")
                ));
            }
        }

        return result;
    }
}