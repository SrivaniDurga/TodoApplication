
package com.example.todo;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.todo.Todo;
import com.example.todo.TodoService;
@RestController
public class TodoController{
    TodoService todoservice = new TodoService();
    @GetMapping("/todos")
    public ArrayList<Todo> getTodo(){
        return todoservice.getTodo();
    }
    @GetMapping("/todos/{id}")
    public Todo getTodoById(@PathVariable ("id") int id){
        return todoservice.getTodoById(id);
    }
    @PostMapping("/todos")
    public Todo addTodopost(@RequestBody Todo todo){
        return todoservice.addTodo(todo);
    }
    @PutMapping("/todos/{id}")
    public Todo updateTodo(@PathVariable ("id") int id , @RequestBody Todo todo){
        return todoservice.updateTodo(id , todo);
    }
    @DeleteMapping("/todos/{id}")
    public void deleteTodos(@PathVariable ("id") int id){
        todoservice.deleteTodo(id);
    }
}