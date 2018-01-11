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
            System.out.println(strin);
            strin = fin.readLine();
        }//end eof loop

    // ***** output *****

        // all formatted ouput is printed in this section

    // ***** closing message *****

        System.out.println(programInfo.getClosingMessage());

	}  // end main	
}  // end class