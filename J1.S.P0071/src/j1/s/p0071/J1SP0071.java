/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import entity.Task;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class J1SP0071 {

    /**
     * @param args the command line arguments
     */
    // nhắc trước nha, cô t toàn bắt làm theo mô hình 3 lớp mấy cais bài quản lý như này.
    //sẽ có main là 1
    //class view là chuyên print ra các cấu hỏi cho người dung, và gọi đến controller
    // Controller sẽ thục hiện các thuật toán và chỉ đucợ return các giá trị để view in ra chứ cỏtroller ko đucợ phép in ra
    
    public static void main(String[] args) throws ParseException, Exception {
        List<Task> task = new ArrayList<>();

        J1SP0071 m = new J1SP0071();
        DataInput in = new DataInput();
        TaskManagement tm = new TaskManagement(task);
        View v = new View(tm);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        task.add(new Task(1, "Code", "Dev Program", sdf.parse("06/06/2020"), 8, 15, "Dev", "Lead"));
        task.add(new Task(2, "Test", "Test Program", sdf.parse("07/06/2020"), 9, 15.5, "Dev", "Lead"));        
        task.add(new Task(3, "Design", "Design Program", sdf.parse("10/06/2020"), 10.5, 17.5, "Dev", "Lead"));        
        task.add(new Task(4, "Review", "Review Program", sdf.parse("13/06/2020"), 9.5, 12, "Dev", "Lead"));       
        task.add(new Task(5, "Code", "Coder", sdf.parse("13/06/2020"), 9.5, 16, "Coder", "Lead"));        
        boolean isStop = false;
        while (!isStop) {
            m.displayMenu();
            int choice = in.inputChoice(1, 4);
            switch (choice) {
                case 1: {
                    tm.loadId();
                    v.addTask();
                    break;
                }
                case 2: {
                    tm.loadId();
                    v.removeTask();
                    break;
                }
                case 3: {
                    v.displayTask();
                    break;
                }
                case 4: {
                    isStop = true;
                    break;
                }
                case 5: {
                    tm.removeId();
                    break;
                }
            }
        }
    }

    private void displayMenu() {
        System.out.println("=======Task program=======");
        System.out.println("1. Add Task");
        System.out.println("2. Delete Task");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.print("Your choice: ");
    }
    
}
