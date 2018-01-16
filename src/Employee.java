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
        }//end getHours
        
        /************************************
        * Purpose: calculate regular pay (rate*hours)
        * Interface:
        *   in: none
        *   out: int regular pay
        ************************************/
        public int calculateRegPay(){
            return getRate() * getHours();
        }//end calculate regular pay

        /************************************
        * Purpose: calculate overtime pay (rate*(hours - maxhour))
        * Interface:
        *   in: none
        *   out: int overtime pay
        ************************************/
        public int calculateOTPay(){
            //reg = 0;
            int OTHours = getHours() - MAXHOURS;      //subtract number of hours from max hours
            return getRate() * OTHours;
        }//end calculate overtime pay
        
        /************************************
        * Purpose: calculate regular pay when there is overtime pay
        * Interface:
        *   in: none
        *   out: int overtime regular pay
        ************************************/
        public int calculateOTRegPay(){
            return getRate()* MAXHOURS;
        }//end calculate regular pay in overtime pay
        
        /************************************
        * Purpose: to string for regular pay
        * Interface:
        *   in: none
        *   out: string
        ************************************/
        public String toStringReg(){
            String string;
            string = "ID:\t" + getID() + "\n";
            string += "Hours:\t" + getHours() + "\n";
            string += "Wage:\t" + getRate() + "\n";
            string += "Regular Pay:\t" + calculateRegPay() + "\n";
            string += "Overtime Pay:\t" + "0" + "\n";
            string += "Gross Pay:\t" + calculateRegPay() + "\n";
            return string;
        }//end tostringReg
        
        /************************************
        * Purpose: to string for overtime pay
        * Interface:
        *   in: none
        *   out: string
        ************************************/
        public String toStringOT(){
            String string;
            string = "ID:\t" + getID() + "\n";
            string += "Hours:\t" + getHours() + "\n";
            string += "Wage:\t" + getRate() + "\n";
            string += "Regular Pay:\t" + calculateOTRegPay() + "\n";
            string += "Overtime Pay:\t" + calculateOTPay() + "\n";
            string += "Gross Pay:\t" + (calculateOTRegPay() + calculateOTPay()) + "\n";
            return string;
        }//to stringOT
        
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