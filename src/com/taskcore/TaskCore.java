package com.taskcore;

import java.util.Scanner;

public class TaskCore {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.getTasks().addAll(TaskStorage.loadTasks("data/tasks.json"));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n📋 TaskCore Menu:");
            System.out.println("1) Add Task");
            System.out.println("2) List Tasks");
            System.out.println("3) Complete Task");
            System.out.println("4) Save & Export");
            System.out.println("0) Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Description: ");
                    String desc = scanner.nextLine();
                    manager.addTask(title, desc);
                    break;
                case 2:
                    manager.listTasks();
                    break;
                case 3:
                    System.out.print("Task index to complete: ");
                    int index = scanner.nextInt();
                    manager.completeTask(index);
                    break;
                case 4:
                    TaskStorage.saveTasks(manager.getTasks(), "data/tasks.json");
                    TaskExporter.exportSummary(manager.getTasks(), "data/exported.json");
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("❌ Invalid choice.");
            }
        }

        scanner.close();
    }
}
