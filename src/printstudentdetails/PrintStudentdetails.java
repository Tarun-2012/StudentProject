/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/**
 *store and print details
 * view class - user interaction
 * @author admin
 */
public class PrintStudentdetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //store and print 3 student details
        Student[] list = new Student[3];
        Student name1 = new Student();
        name1.setName("Tarun");
        name1.setID(991673965);
        Student name2 = new Student();
        name2.setName("devarsh");
        name2.setID(991673964);
        Student name3 = new Student();
        name3.setName("Kartik");
        name3.setID(991673456);
        
        list[0] = name1;
        list[1] = name2;
        list[2] = name3;
        
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName() + " " + list[i].getID());
        }
    }
    
}
