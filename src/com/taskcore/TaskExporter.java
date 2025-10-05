package com.taskcore;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TaskExporter {

    public static void exportSummary(List<Task> tasks, String filePath) {
        JsonArray array = new JsonArray();
        for (Task task : tasks) {
            JsonObject obj = new JsonObject();
            obj.addProperty("title", task.getTitle());
            obj.addProperty("completed", task.isCompleted());
            array.add(obj);
        }

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(array.toString());
            System.out.println("📤 Exported summary to " + filePath);
        } catch (IOException e) {
            System.out.println("❌ Failed to export summary: " + e.getMessage());
        }
    }
}
