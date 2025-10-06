# ⚙️ TaskCore

**TaskCore** is a modular Java-based task management engine with JSON persistence and TypeScript-powered analytics. Designed for developers who value clean architecture, CLI control, and cross-language extensibility.
---

## 🚀 Features

- 🧠 Java-powered task engine with add, list, complete, and export functions
- 📦 JSON-based storage for persistent task tracking
- 📊 TypeScript dashboard that reads exported summaries
- 🧩 Balanced structure with 8 focused files — no clutter, just power
- 🔗 Multi-language ready: Java + JSON + TypeScript
---

## 🛠️ Setup & Run

### 🔧 Compile Java

```bash
javac -cp "lib/gson-2.10.1.jar" src/com/taskcore/*.java
```

▶️ Run TaskCore
```bash
java -cp "lib/gson-2.10.1.jar;src" com.taskcore.TaskCore
```

📸 Sample Java Output
```text
📋 TaskCore Menu:
1) Add Task
2) List Tasks
3) Complete Task
4) Save & Export
0) Exit
Choose: 1
Title: HelloWorld
Description: Hi, I like coding with powerful programming languages.

📋 TaskCore Menu:
Choose: 0
```

### 📊 TypeScript Dashboard

📦 Install Node types
```bash
npm install --save-dev @types/node
🧪 Compile & Run
bash
tsc viewer.ts
node viewer.js
✅ Real Output
text
📊 Task Summary:
1) ❌ Finish README
2) ✅ Export summary
```

📄 Sample JSON

```json
[
  {
    "title": "Finish README",
    "description": "Write full documentation for TaskCore",
    "completed": false
  },
  {
    "title": "Export summary",
    "description": "Generate exported.json for frontend",
    "completed": true
  }
]
```

🖋️ Author
Crafted by Murad — visionary full-stack developer and system architect. Branded, modular, and elegant — just the way code should be.

📄 License
MIT — see LICENSE file for details.
