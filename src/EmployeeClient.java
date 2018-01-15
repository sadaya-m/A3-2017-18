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
        
        Employee[] employeeList = new Employee[4];     //array of objects

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
                System.out.println(tokens[i]);          //print each tokens
            } // end for tokens*/
            
            //System.out.println(strin);
            strin = fin.readLine();
        }//end eof loop

    // ***** output *****

        // all formatted ouput is printed in this section

    // ***** closing message *****

        System.out.println(programInfo.getClosingMessage());

	}  // end main	
}  // end class