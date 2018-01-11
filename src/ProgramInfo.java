/* **********************************************************
 * Programmer:	Ma. Pauline Sadaya
 * Class:	CS20S
 * 
 * Assignment:	program information class
 *
 * Description:	class to print banners and closing messages
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class ProgramInfo
 {  // begin class

    // *********** class constants **********

    // ********** instance variable **********

    // ********** constructors ***********
    
    public ProgramInfo(){ 
    } // end default constructor

    // ********** accessors **********
     
    public String getBanner(String a){
        String bannerOut = "";
         
    	bannerOut = "*******************************************\n";
    	bannerOut += "Name:		Ma. Sadaya\n";
    	bannerOut += "Class:		CS30S\n";
    	bannerOut += "Assignment:	" + a + "\n";
    	bannerOut += "*******************************************\n";         
         
         return bannerOut;
    } // end getBanner
     
    public String getClosingMessage(){
         String closing = "end of processing.\n";
         
         return closing;
    }

    // ********** mutators **********
 
 }  // end class