package com.comviva.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.comviva.app.dto.Task;
import com.comviva.app.service.TaskService;

@RestController
@CrossOrigin("*")
public class TaskController {
	@Autowired
	private TaskService taskService;

	@RequestMapping("/list")
	public List<Task> listTasks() {
		return taskService.listTasks();
	}

	@RequestMapping(path="/save", method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void saveTask(@RequestBody Task task) {
		taskService.saveTask(task);
	}
}
