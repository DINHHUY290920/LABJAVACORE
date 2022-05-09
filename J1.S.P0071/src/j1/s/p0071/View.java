/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import entity.Task;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author dinhh
 */
public class View {
    TaskManagement tm;

    public View(TaskManagement tm) {
        this.tm = tm;
    }

    //cái này là hàm tạo thêm task
    public void addTask() throws Exception {
        DataInput in = new DataInput();
        Controller con = new Controller(tm);
        System.out.println("-------Add Task-------");
        while (true) {
            int id = 0;
            String requirementName = null;
            String taskType = null;
            Date date = null;
            double planFrom = 0;
            double planTo = 0;
            String assign = null;
            String reviewer = null;
            con.addTask(id,requirementName,taskType,date,planFrom,planTo,assign,reviewer);
            System.out.println("Add task successful.");
            System.out.println("");
            if (!in.checkYesNo()) {
                break;
            } else {
                continue;
            }
        }
    }
    //delte task dựa trên ID
    public void removeTask() {
        DataInput in = new DataInput();
        Controller con = new Controller(tm);
        tm.removeId();
        System.out.println("-------Del Task-------");
        while (true) {
            if (tm.getTaskList().isEmpty()) {
                System.out.println("List empty! You must add task first.");
                System.out.println("");
                break;
            }
            System.out.println("List task");
            con.settingsGetDataTask();
            String id = "0";
            con.deleteTask(id);
            System.out.println("Remove task successful.");
            System.out.println("");
            System.out.println("List after deteled");
            con.settingsGetDataTask();
            if (!in.checkYesNo()) {
                break;
            } else {
                continue;
            }
        }
    }
    //Display Task dựa theo yêu cầu thôi
    public void displayTask() {
        Controller con = new Controller(tm);
        System.out.println("-----------------------------------Task-----------------------------------");
        if (tm.getTaskList().isEmpty()) {
            System.out.println("List empty! You must add task first.");
            System.out.println("");
            return;
        }
        con.settingsGetDataTask();
    }

    
}
