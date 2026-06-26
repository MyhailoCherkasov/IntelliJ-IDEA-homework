package org.example.model;

public class LongestProject {
    private final int projectId;
    private final int monthCount;

    public LongestProject(int projectId, int monthCount) {
        this.projectId = projectId;
        this.monthCount = monthCount;
    }

    @Override
    public String toString() {
        return "Project " + projectId + " -> " + monthCount + " days";
    }
}