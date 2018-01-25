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
        private final int MAXHOURS = 40;        //max hours before overtime
     
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
        public Employee(int r, int h){
            ID = nextID++;  //increment id
            wage = r;       //default wage
            hours = h;      //default hours
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
        }//end getHours
        
        /************************************
        * Purpose: calculate regular pay
        * Interface:
        *   in: none
        *   out: int regular pay
        ************************************/
        public int calculateRegPay(){
            int pay;
            if(hours <= 40){
                pay = getHours() * getRate();
            }//end if
            else{
                pay = MAXHOURS * getRate();
            }//end else
            return pay;
        }//end calculate regular pay

        /************************************
        * Purpose: calculate overtime pay
        * Interface:
        *   in: none
        *   out: int overtime pay
        ************************************/
        public int calculateOTPay(){
            int overtime;
            int OTHours;
            if(hours <= 40){
                overtime = 0;
            }//end if
            else{
                OTHours = getHours() - MAXHOURS;
                overtime = OTHours * getRate();
            }//end else
            return overtime;
        }//end calculate overtime pay
        
         /************************************
        * Purpose: calculate overtime pay
        * Interface:
        *   in: none
        *   out: int overtime pay
        ************************************/
        public int calculateGrossPay(){
            return calculateRegPay() + calculateOTPay();
        }//end calculate overtime pay
        
        /************************************
        * Purpose: to string method
        * Interface:
        *   in: none
        *   out: string
        ************************************/
        public String toString(){
            String string;
            string = "ID:\t" + getID() + "\n";
            string += "Hours:\t" + getHours() + "\n";
            string += "Wage:\t" + getRate() + "\n";
            string += "Regular Pay:\t" + calculateRegPay() + "\n";
            string += "Overtime Pay:\t" + calculateOTPay() + "\n";
            string += "Gross Pay:\t" + calculateGrossPay() + "\n";
            return string;
        }//end tostringReg
        
    // ********** mutators *******************
        
 }  // end class
