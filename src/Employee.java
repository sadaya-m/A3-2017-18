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
    
        private int ID;         //Id
        private int wage;
        private int hours;

    // ********** constructors ***************
        
        /************************************
        * Purpose: default constructor
        * Interface:
        *   in: none
        *   out: none
        ************************************/
        public Employee(){
            ID = nextID++;  //increment id
            wage = 0;       //default wage
            hours = 0;      //default hours
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
        
        /************************************
        * Purpose: get rate/hourly wage
        * Interface:
        *   in: none
        *   out: int rate/hourly wage
        ************************************/
        public int getRate(){
            return wage;
        }//end getRate
        
        /************************************
        * Purpose: get hours
        * Interface:
        *   in: none
        *   out: int hours
        ************************************/
        public int getHours(){
            return hours;
        }//end getRate

    // ********** mutators *******************
        
        /************************************
        * Purpose: set wage and number of hours info
        * Interface:
        *   in: none
        *   out: int wage
        ************************************/
        public void setEmployeeInfo(int r, int h){
            wage = r;
            hours = h;
        }//end setEmployeeInfo
 
 }  // end class