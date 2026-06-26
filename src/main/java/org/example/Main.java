package org.example;

public class Main {

    public static void main(String[] args) throws Exception {
        DatabaseQueryService service = new DatabaseQueryService();

        System.out.println("Max projects client:");
        System.out.println(service.findMaxProjectsClient());

        System.out.println("Max salary worker:");
        System.out.println(service.findMaxSalaryWorker());

        System.out.println("Longest project:");
        System.out.println(service.findLongestProject());

        System.out.println("Project prices:");
        System.out.println(service.printProjectPrices());
    }
}