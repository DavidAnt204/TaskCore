"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var fs = require("fs");
var data = fs.readFileSync('../data/exported.json', 'utf-8');
var tasks = JSON.parse(data);
console.log("📊 Task Summary:");
tasks.forEach(function (task, index) {
    var status = task.completed ? "✅" : "❌";
    console.log("".concat(index + 1, ") ").concat(status, " ").concat(task.title));
});
