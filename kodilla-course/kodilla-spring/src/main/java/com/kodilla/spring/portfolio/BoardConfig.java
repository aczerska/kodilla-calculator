package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDoList")
    TaskList taskList1;

    @Autowired
    @Qualifier("inProgressList")
    TaskList taskList2;

    @Autowired
    @Qualifier("doneList")
    TaskList taskList3;

    @Bean
    public Board board() {
        return new Board(taskList1, taskList2, taskList3);
    }

    @Bean(name = "toDoList")
    public TaskList createToDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList createInProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    public TaskList createDoneList() {
        return new TaskList();
    }
}
