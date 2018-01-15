/* **********************************************************
 * Programmer:	Ma Pauline Sadaya
 * Class:	CS30S
 * 
 * Assignment:  Assignment 3 Employee Payroll
 *
 * Description: Class that will do calculations required for assignment
 * *************************************************************/
 
 // import files here as needed
 
 
 public class Employee
 {  // begin class
 	
    // *********** class constants ***********
       
        private static int nextID = 1000;
        private final int MAXHOURS = 40;        //hours 
     
    // ********** instance variable **********
    
        private int ID;

    // ********** constructors ***************
        
        /************************************
        * Purpose: default constructor
        * Interface:
        *   in: none
        *   out: none
        ************************************/
        public Employee(){
            ID = nextID++;  //increment id
            
        }//end default constructor
        

    // ********** accessors ******************
        
        /************************************
        * Purpose: get unique ID
        * Interface:
        *   in: none
        *   out: int ID
        ************************************/
        public int getID(){
            return ID;            
        }//end default constructor

    // ********** mutators *******************
 
 }  // end class