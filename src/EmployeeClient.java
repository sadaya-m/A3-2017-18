// **********************************************************************
//  Programmer:         Ma Pauline Sadaya
//  Class:		CS30S
//
//  Assignment:         Assignment 3 Employee Payroll
//
//  Description:	Client code
//
//  Input:		text file
//
//  Output:		describe the result of your program
// ***********************************************************************


import java.io.*;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class EmployeeClient
{  // begin class
    public static void main(String args[]) throws IOException
    {  // begin main
    // ***** declaration of constants *****

    // ***** declaration of variables *****
        
        ArrayList <Employee> employeeList = new ArrayList<Employee>();
        
        String strin;
        String delim = "[ :]+";		// delimiter string for splitting input string
        String[] tokens = null;          // array for splitting input
        
        int n = 0;      //counter
        
        //Employee[] employeeList = new Employee[5];     //array of objects

    // ***** create objects *****
        
        ProgramInfo programInfo = new ProgramInfo();
        BufferedReader fin = new BufferedReader(new FileReader("employeeInfo.txt"));

    // ***** create input stream *****

        //ConsoleReader console = new ConsoleReader(System.in);

    // ***** Print Banner *****

        System.out.println(programInfo.getBanner("A3 Employee Payroll"));

    // ***** get input *****

    // ***** processing *****
   
        strin = fin.readLine();
        
        while(strin != null){
            
            tokens = strin.split(delim);        //split string into tokens
            
            employeeList.add(new Employee(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1])));
  // this eof loop should just load the list do the printing and calculating and other stuff later in the client code
// as i indicated in the comments i added to the class code, your client code should not be concerned with hours > 40
// the client code should simply request the pay or the overtime pay or the regular pay and the class code will determine
// what calculations to make
            if(employeeList.get(n).getHours() <= 40){
                System.out.println(employeeList.get(n).toStringReg());
            }//end if
            else{
                System.out.println(employeeList.get(n).toStringOT());
            }//end else*/
            
            n++;
            strin = fin.readLine();
        }//end eof loop
        
    // ***** output *****
        
        System.out.println("Employee 1 ID: " + employeeList.get(0).getID());
        System.out.println("Employee 2 Regular Pay: " + employeeList.get(1).calculateRegPay());
        System.out.println("Employee 2 Overtime Pay: " + employeeList.get(2).calculateOTPay());

    // ***** closing message *****

        System.out.println(programInfo.getClosingMessage());

	}  // end main	
}  // end class
