/*****************************************************************************
******************************************************************************
******************************************************************************
***                                               			                  ***    
***                            ID INFORMATION                              ***    
***                                                     	   	            ***    
***           Programmer                :		   Vy Truong                  ***  
***           Assignment #		 	       :       TA #1.1Q                   ***
***           Assignment Name		       :	      Quirky Programming         ***
***           Course # and Title	       :	      CISC 190 - Java            ***
***           Class Meeting Time	       :	      MW 9:35 – 12:45	         ***
***           Instructor			       :	      Professor Forman           ***
***           Hours			             :		   16.5		                  ***
***           Difficulty			       :	      4		                     ***
***           Completion Date		       :	      08/30/2016  	            ***
***           Program Name			       :  	   VysQuirks	               ***
***                                                                        ***
******************************************************************************
******************************************************************************
***                                                                        ***
***                          PROGRAM DESCRIPTION                           ***
***                                                                        ***
***      Vy's Quirky Program will show user my logo with my initials 	   ***
***      VT in calligraphy style, and show six quirks, including two       ***
***      of mine, and two for each of my colleges.                         ***
***                                                         			      ***
******************************************************************************
******************************************************************************
***                                                         		         ***
***                        		  CREDITS	                              ***
***                                                         			      ***
***   	Thanks for assistance and inspiration from:           		      ***
***                                                         			      ***
***                     Nick, Michuel, Kalib, and Professor Forman	      ***
***                                                         					***
***   	Thanks for the opportunity to assist and inspire:     			   ***
***                                                         					***
***                                                         					***
******************************************************************************
******************************************************************************
*****************************************************************************/

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class VysQuirks
{
   public static void main (String[] args) throws Exception 
   {
      /////////////////////////////////////////////////////////////////////////////////////////////

		//   LOCAL CONSTANT DECLARATIONS AND DEFINITIONS

		////////////////////////////////////////////////////////////////////////////////////////////
		
      final String      MY_NAME     ="VY";

		////////////////////////////////////////////////////////////////////////////////////////////

            
      // welcome message
      System.out.println("                            \u2554\u2550\u2550\u2550\u2550\u2550"+" Welcome to "
                  + "\u2550\u2550\u2550\u2550\u2550\u2550\u2557\n" //line 1
                  + "                            \u2551                       \u2551\n" //line 2
                  + "                            \u2551  " + MY_NAME + "'S QUIRKY PROGRAM  \u2551\n"    //line 3
                  + "                            \u2551                       \u2551\n" //line 4
                  + "                            \u255A\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                  + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u255D\n" //line 5
                     );

      
      // hit ENTER
      System.out.print("\n                           \u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500"
                  + "\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500"
                  + "\u2550\u2510\n"    //line 1
                  + "                           \u2502  hit ENTER to continue  \u2502\n"    //line 2
                  + "                           \u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500"
                  + "\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500"
                  + "\u2500\u2518\n");    //line 3
                     
      System.in.read(); System.in.read();

      // display logo
      System.out.print("\n\nHere come my logo");
      for(int i=0; i<6; i++) // just for fun
      {
         System.out.print(".");
         TimeUnit.MILLISECONDS.sleep(100);
      }
      
      System.out.println("\n             \u2588");    //1
      System.out.println("              \u2588\u2588  \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588"
                        +"          \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");   //2
      System.out.println("                \u2588\u2588      \u2588\u2588\u2588\u2592         \u2588\u2592"
                        +"     \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588               \u2588\u2588");     //3
      System.out.println("               \u2588 \u2588\u2592     \u2588\u2588\u2588\u2592        \u2588\u2592"
                        +"    \u2588\u2588   \u2588\u2588\u2592  \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588"
                        +"\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");     //4
      System.out.println("              \u2588  \u2588\u2588\u2592   \u2588\u2588\u2588\u2592\u2592       "
                        +"\u2588\u2592    \u2588      \u2588\u2588\u2592         \u2588\u2588\u2588\u2592\u2592");      //5
      System.out.println("             \u2588   \u2588\u2588\u2592   \u2588\u2588\u2588\u2592        \u2588    "
                        +"\u2588\u2588      \u2588\u2588\u2592        \u2588\u2588\u2588\u2592\u2592");       //6
      System.out.println("              \u2588  \u2588\u2588\u2592   \u2588\u2588\u2588\u2592\u2592       \u2588"
                        +"    \u2588       \u2588\u2588\u2592       \u2588\u2588\u2588\u2592\u2592");      //7
      System.out.println("              \u2588\u2588\u2588\u2592     \u2588\u2588\u2588\u2592       "
                        +"\u2588\u2592    \u2588       \u2588\u2588\u2592     \u2588\u2588\u2588\u2588\u2592"); //8
      System.out.println("                      \u2588\u2588\u2588\u2588\u2592       \u2588     \u2588       "
                        +"\u2588\u2588\u2592     \u2588\u2588\u2588\u2588\u2592");   //9
      System.out.println("                      \u2588\u2588\u2588\u2592\u2592      \u2588\u2592      "
                        +"\u2588     \u2588\u2588\u2592      \u2588\u2588\u2588\u2592\u2592");     //10
      System.out.println("                      \u2588\u2588\u2588\u2592       \u2588        \u2588"
                        +"\u2588\u2588\u2588\u2592         \u2588\u2588\u2588\u2588");   //11
      System.out.println("                     \u2588\u2588\u2588\u2588\u2592      \u2588\u2592         "
                        +"\u2588\u2588\u2588\u2592         \u2588\u2588\u2588\u2588\u2592");     //12
      System.out.println("                    \u2588\u2588\u2588\u2588\u2592      \u2588                "
                        +"\u2588\u2588\u2588\u2592    \u2588\u2588\u2588\u2588\u2592");     //13
      System.out.println("                    \u2588\u2588\u2588\u2592\u2592     \u2588\u2592               "
                        +"\u2588  \u2588\u2588\u2592   \u2588\u2588\u2588\u2592\u2592");    //14
      System.out.println("                    \u2588\u2588\u2588\u2592      \u2588               \u2588   "
                        +"\u2588\u2588\u2592  \u2588\u2588\u2588\u2588\u2592");     //115
      System.out.println("                   \u2588\u2588\u2588\u2588\u2592     \u2588\u2592               "
                        +"\u2588   \u2588\u2588\u2592  \u2588\u2588\u2588\u2592\u2592");     //16
      System.out.println("                   \u2588\u2588\u2588\u2592     \u2588\u2592                \u2588"
                        +"   \u2588\u2588\u2592 \u2588\u2588\u2588\u2588\u2592\u2592");       //17
      System.out.println("                   \u2588\u2588\u2588\u2592    \u2588\u2592                 \u2588"
                        +"  \u2588\u2588\u2592 \u2588\u2588\u2588\u2588\u2592\u2592");       //18
      System.out.println("                  \u2588\u2588\u2588\u2592   \u2588\u2588\u2592                   "
                        +"\u2588\u2588\u2588\u2592 \u2588\u2588\u2588\u2588\u2592");      //19
      System.out.println("                 \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2592"
                        +"                      \u2588\u2588\u2588\u2588\u2588\u2588\u2592");     //20
      System.out.println("                                              \u2588");       //21     
      
      // display date and time
      Date today = new Date();
      System.out.println("\t\t\t\t\t\t" + today.toString()+ "\n");
      
      // hit ENTER (27 spaces + ...)
      System.out.print("                           <<  hit ENTER to continue  >>\n");    //line 3
                     
      System.in.read(); System.in.read();
      
      // quirky fact about me
      System.out.print("\n\n            ____________________ " + MY_NAME +"'s QUIRK #1 ____________________\n\n\n");
      System.out.print("        Cutting  carrot is my way of enhancing concentration. I always need\n" 
                     + "    more time than any body else  to do a task because it is very difficult\n" 
                     + "    for me to start focusing on something. However, I find myself fall in\n" 
                     + "    “concentrate mood” a lot easier when dicing carrot into extremely small\n" 
                     + "    cubes. I have to focus on every slice so that I will not cut myself; I \n" 
                     + "    also have to make sure that every piece will look alike, and the time I\n"
                     + "    spent is the shortest. It requires a lot of concentration and helps to\n" 
                     + "    release me from ton of thoughts in my mind. The method is so effective\n"
                     + "    that I thought of publishing a book named 'The art of cutting carrot'\1 \n\n\n\n ");
         
      // hit ENTER
      System.out.print("                          \u2554\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2557\n"    //line 1
                     + "                           \u2551  hit ENTER to continue  \u2551\n"    //line 2
                     + "                           \u255A\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u255D\n\n\n");    //line 3
                     
      System.in.read(); System.in.read();
      
      // let user choose to read another quirk of mine or continue with Kalib's quirk
      boolean valid = false;    
      do
      {
         Scanner scan = new Scanner(System.in);
         System.out.print(" >> Type 'v' to see my second quirk, "
                          + "or type 'k' to see Kalib's quirk   ");                  
         char input = scan.next().charAt(0); 
          
         if (input == 'v')
         {
            System.out.print("\n\n\n            ____________________ " + MY_NAME +"'s QUIRK #2 ____________________\n\n");
            System.out.print("\n          I love beautiful handwriting. Once, I intentionally “borrow” one\n"
                           + "    page of my friend’s notebook because he had such beautiful handwriting,\n"
                           + "    (and I bet he still hasn't known who did it yet). I also spend lots of\n"
                           + "    time practicing to write beautifully. In elementary school, I obtained\n"
                           + "    calligraphy training every semester. Although I do not practice anymore,\n"
                           + "    I still maintain a fairly good handwriting now.\n\n\n\n");      
            
            valid = true;
            
            // hit ENTER
            System.out.print("                           \u2554\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2557\n"    //line 1
                     + "                           \u2551  hit ENTER to continue  \u2551\n"    //line 2
                     + "                           \u255A\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u255D\n\n\n\n");    //line 3
                     
            System.in.read(); System.in.read();

         }
         else if (input == 'k')
         {
            valid = true;
         }
      } while(!valid);
      
      // Kalib's Quirk #1
      System.out.print("\n\n\n           ____________________ KALIB's QUIRK #1____________________\n\n\n");
      System.out.println("         Kalib has recently noticed is that he constantly moves his legs \n"
                       + "    while he sits. Whenever he is sitting his legs are never still and he \n"
                       + "    even does not notice it. Sometimes when he hears noises and starts \n"
                       + "    looking around to see who is doing, he realizes it is him. Kalib tries\n"
                       + "    to stop it but it is his second nature now.\n\n\n");
                     
      
      //System.out.print("\n\n\n\n\n");
      
      // hit ENTER
      System.out.print("                           \u2554\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2557\n"    //line 1
                     + "                           \u2551  hit ENTER to continue  \u2551\n"    //line 2
                     + "                           \u255A\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u255D\n\n\n\n");    //line 3
                     
      System.in.read(); System.in.read();
      
      // Kalib's Quirk #2
      System.out.print("\n\n\n           ____________________ KALIB's QUIRK #2____________________\n\n\n");
      
      System.out.print("       Kalib said he cusses a lot. Although he does not talk much, when he\n"
                     +"    does speak you can expect a swear word is coming out of his mouth. He\n"
                     +"    does try to keep it to a minimum while he is in class or around family,\n"
                     +"    but when he is around friends, he has no filter.\n\n\n\n");
                     

      // hit ENTER
      System.out.println("                           \u2554\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2557\n"    //line 1
                     + "                           \u2551  hit ENTER to continue  \u2551\n"    //line 2
                     + "                           \u255A\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u255D\n\n\n");    //line 3
                     
      System.in.read(); System.in.read();

                  
      // Miguel's Quirk #1
      System.out.print("\n\n\n            ____________________ MIGUEL's QUIRK #1____________________\n\n\n");
      System.out.print("         People notice Miguel makes strange facial expressions constantly.\n"
                     + "     He never really notices , but he has been told several times that he\n"
                     + "     either makes some weird faces when you talk tohim, or just stares \n" 
                     + "     blankly with no expression at all. He makes up for it by trying to be\n" 
                     + "     interesting so that people will ignore his weird expresions.\n\n\n\n");
      
      //System.out.print("\n\n\n\n\n");
      
      // hit ENTER
      System.out.println("                           \u2554\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2557\n"    //line 1
                     + "                           \u2551  hit ENTER to continue  \u2551\n"    //line 2
                     + "                           \u255A\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u255D\n\n\n");    //line 3
                     
      System.in.read(); System.in.read();
      
      // Miguel's Quirk #2
      System.out.print("\n\n\n            ____________________ MIGUEL's QUIRK #2____________________\n\n\n");
      System.out.print("           When he was 8 year old, Miguel was bullied to eat an onion. Since \n"
                     + "    then, he cannot eat onions on anything, however, he can eat onion-\n"
                     + "    flavored and onion-seasoned things. He loves onion-flavored potato chips\n"
                     + "    and soups with a bit of onion in them, but he will spit out any burger\n" 
                     + "    or sandwich that has a real slice of onion inside of it.\n\n\n\n");
      
      // hit ENTER
      System.out.println("                           \u2554\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2557\n"    //line 1
                     + "                           \u2551  hit ENTER to continue  \u2551\n"    //line 2
                     + "                           \u255A\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u255D\n\n\n");    //line 3
                     
      System.in.read(); System.in.read();
      
      // Display logo again
      System.out.println("\n             \u2588");    //1
      System.out.println("              \u2588\u2588  \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588"
                        +"          \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");   //2
      System.out.println("                \u2588\u2588      \u2588\u2588\u2588\u2592         \u2588\u2592"
                        +"     \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588               \u2588\u2588");     //3
      System.out.println("               \u2588 \u2588\u2592     \u2588\u2588\u2588\u2592        \u2588\u2592"
                        +"    \u2588\u2588   \u2588\u2588\u2592  \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588"
                        +"\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588");     //4
      System.out.println("              \u2588  \u2588\u2588\u2592   \u2588\u2588\u2588\u2592\u2592       "
                        +"\u2588\u2592    \u2588      \u2588\u2588\u2592         \u2588\u2588\u2588\u2592\u2592");      //5
      System.out.println("             \u2588   \u2588\u2588\u2592   \u2588\u2588\u2588\u2592        \u2588    "
                        +"\u2588\u2588      \u2588\u2588\u2592        \u2588\u2588\u2588\u2592\u2592");       //6
      System.out.println("              \u2588  \u2588\u2588\u2592   \u2588\u2588\u2588\u2592\u2592       \u2588"
                        +"    \u2588       \u2588\u2588\u2592       \u2588\u2588\u2588\u2592\u2592");      //7
      System.out.println("              \u2588\u2588\u2588\u2592     \u2588\u2588\u2588\u2592       "
                        +"\u2588\u2592    \u2588       \u2588\u2588\u2592     \u2588\u2588\u2588\u2588\u2592"); //8
      System.out.println("                      \u2588\u2588\u2588\u2588\u2592       \u2588     \u2588       "
                        +"\u2588\u2588\u2592     \u2588\u2588\u2588\u2588\u2592");   //9
      System.out.println("                      \u2588\u2588\u2588\u2592\u2592      \u2588\u2592      "
                        +"\u2588     \u2588\u2588\u2592      \u2588\u2588\u2588\u2592\u2592");     //10
      System.out.println("                      \u2588\u2588\u2588\u2592       \u2588        \u2588"
                        +"\u2588\u2588\u2588\u2592         \u2588\u2588\u2588\u2588");   //11
      System.out.println("                     \u2588\u2588\u2588\u2588\u2592      \u2588\u2592         "
                        +"\u2588\u2588\u2588\u2592         \u2588\u2588\u2588\u2588\u2592");     //12
      System.out.println("                    \u2588\u2588\u2588\u2588\u2592      \u2588                "
                        +"\u2588\u2588\u2588\u2592    \u2588\u2588\u2588\u2588\u2592");     //13
      System.out.println("                    \u2588\u2588\u2588\u2592\u2592     \u2588\u2592               "
                        +"\u2588  \u2588\u2588\u2592   \u2588\u2588\u2588\u2592\u2592");    //14
      System.out.println("                    \u2588\u2588\u2588\u2592      \u2588               \u2588   "
                        +"\u2588\u2588\u2592  \u2588\u2588\u2588\u2588\u2592");     //115
      System.out.println("                   \u2588\u2588\u2588\u2588\u2592     \u2588\u2592               "
                        +"\u2588   \u2588\u2588\u2592  \u2588\u2588\u2588\u2592\u2592");     //16
      System.out.println("                   \u2588\u2588\u2588\u2592     \u2588\u2592                \u2588"
                        +"   \u2588\u2588\u2592 \u2588\u2588\u2588\u2588\u2592\u2592");       //17
      System.out.println("                   \u2588\u2588\u2588\u2592    \u2588\u2592                 \u2588"
                        +"  \u2588\u2588\u2592 \u2588\u2588\u2588\u2588\u2592\u2592");       //18
      System.out.println("                  \u2588\u2588\u2588\u2592   \u2588\u2588\u2592                   "
                        +"\u2588\u2588\u2588\u2592 \u2588\u2588\u2588\u2588\u2592");      //19
      System.out.println("                 \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2592"
                        +"                      \u2588\u2588\u2588\u2588\u2588\u2588\u2592");     //20
      System.out.println("                                              \u2588\n");       //21  
      
      // hit ENTER
      System.out.print("                           \u2554\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2557\n"    //line 1
                     + "                           \u2551  hit ENTER to continue  \u2551\n"    //line 2
                     + "                           \u255A\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u255D");    //line 3
                     
      System.in.read(); System.in.read();      
      
      // Farewell message
      System.out.print("\n\n\t\t  THANK YOU FOR VISITING " + MY_NAME +"'s QUIRKY PROGRAM\n");
      System.out.print("\t\t\t\tHope you enjoyed it\n\n\n\n");
      
      // hit ENTER
      System.out.println("                           \u2554\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2557\n"    //line 1
                     + "                           \u2551  hit ENTER to continue  \u2551\n"    //line 2
                     + "                           \u255A\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550"
                     + "\u2550\u255D\n\n\n");
      System.in.read(); System.in.read();
            
      System.out.print("Departing " + MY_NAME + "'s QUIRKY PROGRAM");
      
      for(int i=0; i<6; i++) // just for fun
      {
         System.out.print(".");
         TimeUnit.MILLISECONDS.sleep(400);
      }
   }
}