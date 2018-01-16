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

public class EmployeeClient
{  // begin class
    public static void main(String args[]) throws IOException
    {  // begin main
    // ***** declaration of constants *****

    // ***** declaration of variables *****
        
        String strin;
        String delim = "[ :]+";		// delimiter string for splitting input string
        String[] tokens = null;          // array for splitting input
        
        int n = 0;      //counter
        
        Employee[] employeeList = new Employee[5];     //array of objects

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
            
            employeeList[n] = new Employee();           //create object
            System.out.println(employeeList[n].getID());
            
            tokens = strin.split(delim);        //split string into tokens
            for(int i = 0; i< tokens.length; i++){
                //System.out.println(tokens[0]);          //print each tokens
                employeeList[n].setEmployeeInfo(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
            } // end for tokens*
            
            if(employeeList[n].getHours() <= 40){
                System.out.println(employeeList[n].calculateRegPay());
            }//end if
            else{
                System.out.println(employeeList[n].calculateOTPay());
                System.out.println(employeeList[n].calculateOTRegPay());
            }//end else
            
            //System.out.println(employeeList[n].getRate());
            //System.out.println(employeeList[n].getHours());
            
            //System.out.println(strin);
            strin = fin.readLine();
        }//end eof loop

    // ***** output *****

        // all formatted ouput is printed in this section

    // ***** closing message *****

        System.out.println(programInfo.getClosingMessage());

	}  // end main	
}  // end class