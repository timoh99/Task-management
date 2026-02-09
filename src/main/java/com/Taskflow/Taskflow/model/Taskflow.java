package com.Taskflow.Taskflow.model;

public class Taskflow {
    private Long Id;
    private Long projectId;
    private Long TaskId;
    private String Username;
    private String projectname;
    private String Tasktitle;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getTaskId() {
        return TaskId;
    }

    public void setTaskId(Long taskId) {
        TaskId = taskId;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getTasktitle() {
        return Tasktitle;
    }

    public void setTasktitle(String tasktitle) {
        Tasktitle = tasktitle;
    }
}
