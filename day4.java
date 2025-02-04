// Write a Java program to implement a HashMap that stores student roll numbers (Integer) as keys and their names 
// (String) as values. Perform the following operations: Insert five student records. Retrieve and display the name of a 
// student using a specific roll number. Remove a student entry using a roll number. Display all student records.
import java.util.*;

public class day4 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<Integer, String>();
        students.put(101,"Pooja");
        students.put(102,"Sri");
        students.put(103, "Shanmu");
        students.put(104,"Pavi");
        students.put(105,"Shailu");

        int FindRollnumber = 103;
        if(students.containsKey(FindRollnumber))
        {
            String name = students.get(FindRollnumber);
            System.out.println(FindRollnumber);
        }
        else{
            System.out.println("Roll number not found");
        }
        int DeleteRollnum = 104;
        students.remove(DeleteRollnum);
        System.out.println("All Records");
        for(Map.Entry<Integer,String> entry : students.entrySet())
        {
            System.out.println("Roll number: "+ entry.getKey() + "  Name: "+entry.getValue());
        }
    }
}
