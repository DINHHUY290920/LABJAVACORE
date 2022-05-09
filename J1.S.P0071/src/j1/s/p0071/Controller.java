/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import entity.Task;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dinhh
 */
public class Controller {

    List<Task> task = new ArrayList<>();
    TaskManagement tm;

    public Controller(TaskManagement tm) {
        this.tm = tm;
    }
    DataInput in = new DataInput();
    List<Task> taskList;

    public int addTask(int id,String requirementName, String taskType, Date date, double planFrom, double planTo, String assign, String reviewer)throws Exception{
        id = tm.ID();
        requirementName = in.inputString("Requirement Name");
        taskType = in.getType();
        date = in.inputDate();
        planFrom = in.inputPlanFrom();
        planTo = in.inputPlanTo(planFrom);
        assign = in.inputString("Assignee");
        reviewer = in.inputString("Reviewer");
        Task t = new Task(id, taskType, requirementName, date, planFrom, planTo, assign, reviewer);
        tm.addTask(t);
        return id;
    }
    public void deleteTask(String id){
        int k = Integer.parseInt(id);
       k = in.inputExistedID(tm.getTaskList());
       tm.deleteTask(k);
    }
    public void settingsGetDataTask(){
                System.out.printf("%-3s | %-15s | %-10s | %-10s | %-5s | %-8s | %-7s\n",
                "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (Task t : tm.getTaskList()) {
            System.out.printf("%-3s | %-15s | %-10s | %-10s | %-5s | %-8s | %-7s\n",
                    t.getId(), t.getRequirementName(), t.getTaskType(), sdf.format(t.getDate()),
                    t.getPlanTo() - t.getPlanFrom(), t.getAssign(), t.getReviewer());
        }
    }
}
