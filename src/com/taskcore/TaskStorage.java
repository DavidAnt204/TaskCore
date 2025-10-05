package com.taskcore;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class TaskStorage {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static List<Task> loadTasks(String filePath) {
        try (Reader reader = new FileReader(filePath)) {
            Type listType = new TypeToken<List<Task>>() {}.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            System.out.println("⚠️ Could not load tasks: " + e.getMessage());
            return new java.util.ArrayList<>();
        }
    }

    public static void saveTasks(List<Task> tasks, String filePath) {
        try (Writer writer = new FileWriter(filePath)) {
            gson.toJson(tasks, writer);
            System.out.println("📁 Tasks saved to " + filePath);
        } catch (IOException e) {
            System.out.println("❌ Failed to save tasks: " + e.getMessage());
        }
    }
}
