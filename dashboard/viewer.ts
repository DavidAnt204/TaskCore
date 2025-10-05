import * as fs from 'fs';

const data = fs.readFileSync('../data/exported.json', 'utf-8');
const tasks = JSON.parse(data);

console.log("📊 Task Summary:");
tasks.forEach((task: { title: string; completed: boolean }, index: number) => {
    const status = task.completed ? "✅" : "❌";
    console.log(`${index + 1}) ${status} ${task.title}`);
});
