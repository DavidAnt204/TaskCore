package com.taskcore;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title, String description) {
        tasks.add(new Task(title, description));
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("📭 No tasks available.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ") " + tasks.get(i));
        }
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();
            System.out.println("✅ Task marked as completed.");
        } else {
            System.out.println("❌ Invalid task index.");
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
