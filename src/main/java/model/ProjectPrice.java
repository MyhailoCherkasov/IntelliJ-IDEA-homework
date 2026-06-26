package org.example.model;

public class ProjectPrice {
    private final int projectId;
    private final int price;

    public ProjectPrice(int projectId, int price) {
        this.projectId = projectId;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Project " + projectId + " -> " + price;
    }
}