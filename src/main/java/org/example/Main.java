package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Student std = new Student(Database.getConnection());


        //get all students
        std.getStudents();


        // select the operation
        while(true){
            System.out.println("Select the operation");
            System.out.println("1. Insert a student");
            System.out.println("2. Delete a student");
            System.out.println("3. Update a student");
            System.out.println("0. Exit");

            System.out.println("Enter your choice:");

            int input  = scanner.nextInt();
            System.out.println(input);

            switch(input){
                case 1:
                    System.out.println("Insert a student");

                    System.out.println("Enter student id");
                    String id  = scanner.next();

                    System.out.println("Enter student name:");
                    String name = scanner.next();

                    System.out.println("Enter student address:");
                    String address = scanner.next();

                    std.insertStudent(id, name, address);
                    System.out.println("Student inserted successfully");
                    break;
                case 2:
                        System.out.println("Delete a student");
                        System.out.println("Enter student id");
                        String studentId = scanner.next();
                        std.deleteStudent(studentId);
                        System.out.println("Student deleted successfully");
                        break;
                case 3:
                    System.out.println("Update a student");
                    System.out.println("Enter student id");
                    String std_id  = scanner.next();
                    System.out.println("Enter student name");
                    String std_name  = scanner.next();
                    System.out.println("Enter student address");
                    String std_address = scanner.next();

                    std.updateStudent(std_id, std_name, std_address);
                    System.out.println("Student updated successfully");
                    break;
            }


        }
    }
}