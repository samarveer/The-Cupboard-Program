/* Culminating4 Version 1
 * January 19, 2018
 * Samarveer Singh Sandhu
 * This program allows you to choose between 3 of Mercedes Benz's vehicles and configure them, just as you would in real life. */

import java.awt.*; //Importing Required Material
import javax.swing.*;
import java.util.Scanner; //Scanner is Very Important

public class Culminating4 extends JFrame{ //class 
  
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private ImageIcon image1; //Declaring Image Required Variable
  private JLabel label;
  private JLabel label1;
  
  public Culminating4(){
    setLayout(new FlowLayout()); //Layout of Window
    label = new JLabel("*Vehicle may not be exactly as shown. Some vehicles may be shown with optional equipment or equipment not available in Canada.*"); //text on window
    add(label);
    image1 = new ImageIcon("CARS.jpg"); //Adding the Picture
    label1 = new JLabel(image1);
    add(label1); 
  }
  
  //Main Method
  public static void main(String[] args){ 
    
    Scanner in = new Scanner(System.in); //Very Important
    
    boolean main = true; //Looping my Main Method
    
    while (main){
      System.out.println("\t\t\t\t\t\t\t-{ Welcome to the Official AMG Configurator }-"); //Introduction
      System.out.println("\n\nOur fine vehicles include the coupe version of the C-Class, E-Class, & S-Class.\nPress 1 to Preview Vehicles");
      int preview = in.nextInt();
      if (preview == 1){ //Shows Image of Vehicles
        /*ImageTutorial gui = new ImageTutorial();
        gui.pack();
        gui.setVisible(true);
        gui.setTitle("Our Vehicles");*/
      }
      System.out.println("\nPlease choose your vehicle:\n(1)C63 S\n(2)E400\n(3)S65"); //The Start of Sending Parameters
      int choice = in.nextInt();
      //Forwarding to Different Methods
      if (choice == 1) {
        cclass(choice); //1st Method
      }
      else if (choice == 2) {
        eclass(choice); //2nd Method
      }
      else if (choice == 3) {
        sclass(choice); //3rd Method
      }    
      
      System.out.println("Done Configurating?\n(1)Yes\n(2)No"); //End of Program
      int done = in.nextInt();
      if (done == 1){
        System.out.println("\n\t\t\t\t\t\t\t     Thanks for Using Our Configurator!\n\nFor more information on other models & pricing please feel free to contact us:"); //Some Important Information that is usually given after configurating a vehicle
        System.out.println("\nBy Email:\nmbc_national_fleet@mercedes-benz.ca");
        System.out.println("\nBy Mail:\nMercedes-Benz Head Office:\t\t\tMercedes-Benz Financial Services:\nMercedes-Benz Canada Inc.\t\t\t2680 Matheson Blvd. East\n98 Vanderhoof Ave\t\t\t\tSuite 500\nToronto, ON\t\t\t\tMississauga, ON\nM4G 4C9\t\t\t\t\tL4W 0A5");
        System.out.println("\nBy Phone:\nMercedes-Benz Canada Customer Relations (9 - 5 p.m.):\n1-800-387-0100");
        main = false;
      }
      else if (done == 2){
        main = true; //Restarting the Program 
      }
    }
    in.close();
  }
  
  //C63 S Car Method
  public static void cclass(int choice){
    
    Scanner in = new Scanner(System.in); //Very Important
    
    boolean configurator = true; //Looping this Method As Well
    
    System.out.println("\nOverview:");
    System.out.println("Mercedes AMG C63 S     (503 hp)     12.2l/100km     AMG SPEEDSHIFT MCT     $86,300.00"); //Some Info on the Vehicle
    System.out.println("Coupe                 8 Cylinder                   (Multi-Clutch Tech.)");
    
    while (configurator) {
      
      double price = 86300.00;
      System.out.println("\n\nChoose Packages: "); //Choosing Packages
      System.out.println("\n(1)PREMIUM PACKAGE     $4,900\t\t\t\t\t(2)INTELLIGENT DRIVE PACKAGE     $2,700\t\t\t\t\t(3)AMG NIGHT PACKAGE     $1,000\n-Easy-Pack Power Trunk Closer\t\t\t\t\t-Pre-Safe Plus\t\t\t\t\t\t\t-Black Accents\n-Foot Activated Trunk Release\t\t\t\t\t-Active Steering Assist\n-COMAND Online Navigation w/ MB Apps\t\t\t\t-Active Distance Assist DISTRONIC\n-Active Parking Assist\t\t\t\t\t-Active Brake Assist with Cross-Traffic Function\t\t\t\t(4)NOT NEEDED\n-360° Camera\t\t\t\t\t\t-Active Blind Spot Assist\n-Burmester® Surround Sound System\t\t\t\t-Active Lane Keeping Assist\n-Keyless-Go\n-DVD Drive");
      int packages = in.nextInt(); //Input & Calculations
      if (packages == 1){
        price = price + 4900;
      }
      else if (packages == 2){
        price = price + 2700;
      }
      else if (packages == 3){
        price = price + 1000;
      }
      else if (packages == 4){
        price = price + 0;
      }
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price); //Subtotal Printed on Bottom Left 
      
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Press 1 to continue, 2 to exit."); 
      int abc = in.nextInt();
      if (abc == 1){
        System.out.println("\nSelect Colour & Wheels:"); //Selecting Colours & Wheels
        System.out.println("\nOur Colours Include:\t\t\t\t\t\t\tOur Wheels Include:\n(1)Polar White, without additional charge\t\t\t\t\t(1)19-Inch AMG Twin 5-Spoke Wheels, without additional charge\n(2)Iridium Silver Metallic\t\t$890.00\t\t\t\t(2)19/20-Inch Mixed AMG Cross-Spoke Forged Wheels\t\t\t  $1,500.00\n(3)Selenite Grey Metallic\t\t$890.00\t\t\t\t(3)19/20-Inch Mixed AMG Cross-Spoke Forged Wheels in Matte Black\t  $2,000.00\n(4)Brilliant Blue Metallic\t\t$890.00\n(5)Obsidian Black Metallic\t\t$890.00\n(6)designo Diamond White Metallic\t$1,600.00\n(7)designo Selenite Grey MAGNO\t\t$2,500.00");
        System.out.println("\nColour Choice:");
        int colour = in.nextInt(); //Input & Calculations
        if (colour == 1){
          price = price + 0;
        }
        else if (colour == 2 || colour == 3 || colour == 4 || colour == 5){
          price = price + 890;
        }
        else if (colour == 6){
          price = price + 1600;
        }
        else if (colour == 7){
          price = price + 2500;
        }
        System.out.println("Wheel Choice:");
        int wheels = in.nextInt(); //More Input & Calculations
        if (wheels == 1){
          price = price + 0;
        }
        else if (wheels == 2){
          price = price + 1500;
        }
        else if (wheels == 3){
          price = price + 2000;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price); //Subtotal Printed on Bottom Left 
      }
      else if (abc == 2){
        break; //Exiting Method
      }
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Press 1 to continue, 2 to exit.");
      int def = in.nextInt();
      if (def == 1){
        System.out.println("\nSelect Upholstery & Trim:"); //Selecting Upholstery & Trim
        System.out.println("\nOur Upholsteries (no additional charge) Include:\t\t\t\t\t\tOur Trims Include:\n(1)Black-Single Tone, with grey stripes, AMG Nappa Leather\t\t\t\t\t(1)Aluminum Trim, without additional charge\n(2)Platnium/Black-Two Tone AMG Nappa Leather\t\t\t\t\t\t(2)AMG Carbon Fibre Trim\t\t\t  $1,500.00\n(3)Red Pepper/Black-Two Tone AMG Nappa Leather\t\t\t\t\t\t(3)AMG Matte Silver Glass Fibre Trim\t\t  $1,500.00\n\t\t\t\t\t\t\t\t\t\t(4)Dark Ash Wood Trim\t\t\t  $250.00");
        System.out.println("\nUpholstery Choice: ");
        int upholstery = in.nextInt();//Input & Calculations
        if (upholstery == 1 || upholstery == 2 || upholstery == 3){
          price = price + 0;
        }
        System.out.println("Trim Choice:");
        int trim = in.nextInt(); //More Input & Calculations
        if (trim == 1){
          price = price + 0;
        }
        else if (trim == 2 || trim == 3){
          price = price + 1500;
        }
        else if (trim == 4){
          price = price + 250;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price); //Subtotal Printed on Bottom Left 
      }
      else if(def == 2){
        break;  //Exiting Method
      }
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Press 1 to continue, 2 to exit.");
      int ghi = in.nextInt();
      if (ghi == 1){
        System.out.println("\nSelect Optional Equipment: "); //Selecting Optional Equipment
        System.out.println("\nDesign:\n(1)Carbon Fibre Exterior Mirrors\t\t$2,500\n(2)Standard Mirrors\t\t\t\t$0");
        int design = in.nextInt(); //Input & Calculations
        if (design == 1){
          price = price + 2500;
        }
        else if (design == 2){
          price = price + 0;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price);  //Subtotal Printed on Bottom Left 
        System.out.println("\nEntertainment:\n(1)Head-Up Display\t\t\t\t$1,500\n(2)Not Needed");
        int entertainment = in.nextInt(); //More Input & Calculations
        if (entertainment == 1){
          price = price + 1500;
        }
        else if (entertainment == 2){
          price = price + 0;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    Subtotal: $"+price);  //Subtotal Printed on Bottom Left 
        System.out.println("\nInterior:\n(1)Climate Comfort Front Seats\t\t\t$1,200\n(2)AMG Performance Seat\t\t\t$2,300\n(3)Not Needed");
        int interior = in.nextInt(); //More Input & Calculations
        if (interior == 1){
          price = price + 1200;
        }
        else if (interior == 2){
          price = price + 2300;
        }
        else if (interior == 3){
          price = price + 0;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    Subtotal: $"+price);  //Subtotal Printed on Bottom Left 
        System.out.println("\nSafety:\n(1)AMG Carbon Ceramic Brake System\t\t$6,900\n(2)Basic Red Brake Calipers\t\t\t$0");
        int safety = in.nextInt(); //More Input & Calculations
        if (safety == 1){
          price = price + 6900;
        }
        if (safety == 2){
          price = price + 0;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    Subtotal: $"+price);  //Subtotal Printed on Bottom Left 
      }
      else if (ghi == 2){
        break; //Exiting Method
      }
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Press 1 to complete, 2 to exit.");
      int jkl = in.nextInt();
      if (jkl == 1){
        double newPrice = price - 86300;
        System.out.println("\nSummary-Your Mercedes Benz:"); //Summary of Your Vehicle
        System.out.println("\n\nTechnical Data:\n\t\t\t\t\t\t\t\t\tPricing Information\nFuel Type\t\t\tPremium\t\t\t\t\t\tBase Price:\t\t   $86,300.00\nCylinders\t\t\t8\t\t\t\t\t\tConfigured Options:\t\t   $"+newPrice+"\nTotal Displacement\t\t3982cc\t\t\t\t\t\tTotal:\t\t\t   $"+price+"\nNet Power\t\t\t(503 hp)\nTransmission\t\tAMG SPEEDSHIFT MCT\t\t\t\t\tContact Dealer for Test Drive - (416)947-9000\n\t\t\t(Multi-Clutch Technology)\t\t\t\tAddress - 761 Dundas St E, Toronto, ON M5A 4N5\n\t\t\t7-Speed Sports Transmission");
      }
      else if (jkl == 2){
        break; //Exiting Method
      }
      
      System.out.println("\nAny Changes?\nYes(1)\nNo(2)"); //Asking User to restart method
      int con = in.nextInt();
      if (con == 1){
        configurator = true;
      }
      else if (con == 2){
        configurator = false;        
      }
    }
    in.close(); //closing the scanner
  }
  
  //E400 Car Method
  public static void eclass(int choice){
    
    Scanner in = new Scanner(System.in); //Very Important
    
    boolean configurator = true;  //Looping this Method As Well
    
    while (configurator){
      double price = 72700.00;
      
      System.out.println("\nOverview:");  //Some Info on the Vehicle
      System.out.println("E 400 4MATIC Coupe     (329 hp)     10.5l/100km     9G-TRONIC Automatic     $72,700.00");
      System.out.println("                      6 Cylinder                    Transmission");
      
      System.out.println("\n\nChoose Packages: "); //Choosing Packages
      System.out.println("\n(1)PREMIUM PACKAGE     $4,000\t\t\t\t\t(2)INTELLIGENT DRIVE PACKAGE     $2,700\t\t\t\t   (3)LIGHTING SYSTEM     $1,000\n-Heated Armrests - Front\t\t\t\t\t-Advanced Driving Assistance Package\t\t\t\t   -Adaptive Highbeam Assist(AHA)\n-Easy-Pack Power Trunk Closer\t\t\t\t\t-Distronic Plus with Steering Assist\t\t\t\t   -Active MULTIBEAM LED Lighting System\n-Warmth Comfort Package\t\t\t\t\t-Drive Pilot\n-Hands-Free Access\t\t\t\t\t\t-Traffic Sign Assist\t\t\t\t\t\t   (4)NOT NEEDED");
      System.out.println("-12.3 Inch Instrument Cluster Display\t\t\t\t-Active Lane Changing Assist\n-Burmester® Surround Sound System\n-Illuminated Door Sill Panels\n-KEYLESS-GO\n-Enhanced Heated Front Seats");
      System.out.println();
      int packages = in.nextInt();  //Input & Calculations
      if (packages == 1){
        price = price + 4000;
      }
      else if (packages == 2){
        price = price + 2700;
      }
      else if (packages == 3){
        price = price + 1000;
      }
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price);//Subtotal Printed on Bottom Left
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Press 1 to continue, 2 to exit.");
      int abc = in.nextInt();
      if (abc == 1){
        System.out.println("\nSelect Colour & Wheels:"); //Selecting Colours & Wheels
        System.out.println("\nOur Colours Include:\t\t\t\t\t\t\t\tOur Wheels Include:\n(1)Black\t\t\t    without additional charge\t\t\t\t(1)AMG 18-Inch 5-Spoke Wheels, without additional charge\n(2)Polar White\t\t    without additional charge\t\t\t\t(2)19-Inch AMG Twin-5 Spoke Wheels\t\t\t  $500.00\n(3)Diamond Silver Metallic         without additional charge\n(4)Obsidian Black Metallic         without additional charge\n(5)Cavansite Blue Metallic         without additional charge\n(6)Iridium Silver Metallic         without additional charge\n(7)Aragonite Silver Metallic       without additional charge\n(8)Emerald Green Metallic          without additional charge\n(9)Selenite Grey Metallic          without additional charge\n(10)designo Hyacinth Red Metallic \t\t$1,400.00\n(11)designo Diamond White Metallic \t\t$1,600.00");
        System.out.println("\nColour Choice:");
        int colour = in.nextInt(); //Input & Calculations
        
        if (colour == 1 || colour == 2 || colour == 3 || colour == 4 || colour == 5 || colour == 6 || colour == 7 || colour == 8 || colour == 9){
          price = price + 0;
        }
        else if (colour == 10){
          price = price + 1400;
        }
        else if (colour == 11){
          price = price + 1600;
        }
        System.out.println("\nWheel Choice:");
        int wheels = in.nextInt();  //More Input & Calculations
        if (wheels == 1){
          price = price + 0;
        }
        else if (wheels == 2){
          price = price + 500;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price);//Subtotal Printed on Bottom 
      }
      else if (abc == 2){
        break; //Exiting Method
      }
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Press 1 to continue, 2 to exit.");
      int def = in.nextInt();
      if (def == 1){
        System.out.println("\nSelect Upholstery & Trim");  //Selecting Upholstery & Trim
        System.out.println("\nOur Upholsteries:");
        System.out.println("\n No Charge\t\t\t\t\t\t\tAdditional Charge: $1,500\t\t\t\tAdditional Charge: $3,300\n(1)Black w/Vertical Stitching Leather\t\t\t\t(7)Black Nappa Leather w/Vertical Stitching\t\t(13)designo Black/Titanium Grey Pearl Nappa Leather\n(2)Macchiato Beige/Espresso Brown Leather\t\t\t\t(8)Black Nappa Leather w/Horizontal Stitching\t\t(14)designo Macchiato Beige/Titian Red Nappa Leather\n(3)Saddle Brown/Black Leather\t\t\t\t\t(9)Deep White/Black Nappa Leather\n(4)Black w/Horizontal Stitching Leather\t\t\t\t(10)Classic Red/Black Nappa Leather\n(5)Classic Red/Black Leather\t\t\t\t\t(11)Macchiato Beige/Yacht Blue Nappa Leather\n(6)Macchiato Beige/Yacht Blue Leather\t\t\t\t(12)Macchiato Beige/Espresso Brown Nappa Leather");
        
        System.out.println("\nUpholstery Choice:");
        int up = in.nextInt(); //Input & Calculations
        if (up == 1 || up == 2 || up == 3 || up == 4 || up == 5 || up == 6){
          price = price + 0;
        }
        else if (up == 7 || up == 8 || up == 9 || up == 10 || up == 11 || up == 12){
          price = price + 1500;
        }
        else if (up == 13 || up == 14){
          price = price + 3300;
        }
        System.out.println("\nOur Trims:");
        System.out.println("\n No Charge\t\t\t\t\t\t\tAdditional Charge: $1,000\t\t\t\tAdditional Charge: $2,500\n(1)Aluminium Trim\t\t\t\t\t\t(6)designo Magnolia Brown Flowing Lines Wood\t\t(8)Metal Weave Trim\n(2)Brown Ash Wood Trim\t\t\t\t\t(7)designo Piano Black Lacquer Flowing Lines\n(3)Brown Wood Trim (Open-Pore)\n(4)Dark Ash Wood Trim (Open-Pore)\n(5)Light Brown Wood Trim");
        
        System.out.println("\nTrim Choice:");
        int trim = in.nextInt();  //More Input & Calculations
        if (trim == 1 || trim == 2 || trim == 3 || trim == 4 || trim == 5){
          price = price + 0;
        }
        else if (trim == 6 || trim == 7){
          price = price + 1000;
        }
        else if (trim == 8){
          price = price + 2500;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price); //Subtotal Printed on Bottom Left 
      }
      else if (def == 2){
        break; //Exiting Method
      }
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Press 1 to continue, 2 to exit.");
      int ghi = in.nextInt();
      if (ghi == 1){
        System.out.println("\nSelect Optional Equipment:"); //Selecting Optional Equipment
        System.out.println("\nEntertainment:\n(1)Head-Up Display\t\t\t\t$1,500\n(2)Burmester® 3D High-End Surround Sound System\t$6,900\n(3)Both\t\t\t\t\t$8,400\n(4)Not Needed");
        int enter = in.nextInt();  //Input & Calculations
        if (enter == 1){
          price = price + 1500;
        }
        else if (enter == 2){
          price = price + 6900;
        }
        else if (enter == 3){
          price = price + 8400;
        }
        else if (enter == 4){
          price = price + 0;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price);  //Subtotal Printed on Bottom Left
        System.out.println("\nInterior:\n(1)Climate Comfort Seats\t\t\t$1,200\n(2)Multicontour Front Seats with Massage\t\t$1,800\n(3)Not Needed");
        int inter = in.nextInt(); //More Input & Calculations
        if (inter == 1){
          price = price + 1200;
        }
        else if (inter == 2){
          price = price + 1800;
        }
        else if (inter == 3){
          price = price + 0;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price);  //Subtotal Printed on Bottom Left
        System.out.println("\nSafety:\n(1)360-Degree Surround View Camera\t\t$590\n(2)Wireless Phone Charging\t\t\t$150\n(3)Both\t\t\t\t\t$740\n(4)Not Needed");
        int safety = in.nextInt(); //More Input & Calculations
        if (safety == 1){
          price = price + 590;
        }
        else if (safety == 2){
          price = price + 150;
        }
        else if (safety == 3){
          price = price + 740;
        }   
        else if (safety == 4){
          price = price + 0;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price);  //Subtotal Printed on Bottom Left
        System.out.println("\nSteering/Transmission:\n(1)Heated Steering Wheel\t\t\t$250\n(2)Not Needed");
        int steer = in.nextInt();  //More Input & Calculations
        if (steer == 1){
          price = price + 250;
        }
        else if (steer == 2){
          price = price + 0;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price);   //Subtotal Printed on Bottom Left
      }
      else if (ghi == 2){
        break; //Exiting Method
      }
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Press 1 to complete, 2 to exit.");
      int jkl = in.nextInt();
      if (jkl == 1){
        double newPrice = price - 72700;
        System.out.println("\nSummary-Your Mercedes Benz:");  //Summary of Your Vehicle
        System.out.println("\n\nTechnical Data:\n\t\t\t\t\t\t\t\t\tPricing Information\nFuel Type\t\t\tPremium\t\t\t\t\t\tBase Price:\t\t   $72,700.00\nCylinders\t\t\t6\t\t\t\t\t\tConfigured Options:\t\t   $"+newPrice+"\nTotal Displacement\t\t2996cc\t\t\t\t\t\tTotal:\t\t\t   $"+price+"\nNet Power\t\t\t(329 hp)\nTransmission\t\t9G-TRONIC Automatic\t\t\t\t\tContact Dealer for Test Drive - (416)947-9000\n\t\t\tTransmission\t\t\t\t\tAddress - 761 Dundas St E, Toronto, ON M5A 4N5");
      }
      else if (jkl == 2){
        break;
      }
      System.out.println("\nAny Changes?\nYes(1)\nNo(2)"); //Asking User to restart method
      int con = in.nextInt();
      if (con == 1){
        configurator = true;
      }
      else if (con == 2){
        configurator = false;        
      }
    }
    in.close(); //closing the scanner
  }
  
  //S65 Car Method
  public static void sclass(int choice){
    
    Scanner in = new Scanner(System.in); //Very Important
    
    boolean configurator = true; //Looping this Method As Well
    
    while (configurator){
      double price = 263700.00;
      
      System.out.println("\nOverview:");
      System.out.println("Mercedes-AMG S65     (621 hp)     15.5l/100km     AMG SPEEDSHIFT     $263,700.00"); //Some Info on the Vehicle
      System.out.println("Coupe               12 Cylinder                   PLUS 7G-TRONIC");
      
      System.out.println("\n\nChoose Packages: ");  //Choosing Packages
      System.out.println("\n(1)AMG NIGHT PACKAGE     $850\t\t\t\t\t(2)SWAROVSKI® CRYSTAL LIGHTING PACKAGE     $6,900\t\t\t(3)NO PACKAGE NEEDED\n-A-Wing Trim Strip and Front Splitter in High-Gloss Black(HGB)\t-Night View Assist Plus\n-AMG Side Sill Panel Inserts in HGB\t\t\t\t-Swarovski® Crystal LED Headlamps\n-Exterior Mirror Housings in HGB\n-Trim Strip in AMG Rear Apron in HGB\n-AMG Sports Exhaust System Finished in Black Chrome");
      int packages = in.nextInt(); //Input & Calculations
      if (packages == 1){
        price = price + 850;
      }
      else if (packages == 2){
        price = price + 6900;
      }
      else if (packages == 3){
        price = price + 0;
      }
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price); //Subtotal Printed on Bottom Left 
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Press 1 to continue, 2 to exit.");
      int abc = in.nextInt();
      if (abc == 1){   
        System.out.println("\nSelect Colour & Wheels:");  //Selecting Colours & Wheels
        System.out.println("\nOur Colours Include:\t\t\t\t\t\t\t\tOur Wheels Include:\n(1)Black\t\t\t    without additional charge\t\t\t\t(1)20-Inch AMG Forged 5-twin-spoke wheels, without additional charge\n(2)Diamond Silver Metallic\t    without additional charge\t\t\t\t(2)20-Inch AMG Multispoke Forged Wheels,   without additional charge\n(3)Magnetite Black Metallic        without additional charge\n(4)Selenite Grey Metallic          without additional charge\n(5)Cavansite Blue Metallic         without additional charge\n(6)Iridium Silver Metallic         without additional charge\n(7)Ruby Black Metallic             without additional charge\n(8)Anthracite Blue Metallic        without additional charge\n(9)Emerald Green Metallic          without additional charge\n(10)Obsidian Black Metallic        without additional charge\n(11)designo Diamond White Metallic \t\t$890.00\n(12)designo Mocha Black Metallic \t\t$4,500.00\n(13)designo Alanite Grey MAGNO \t\t$5,200.00\n(14)designo Cashmere White MAGNO \t\t$5,200.00");
        System.out.println("\nColour Choice: ");
        int colour = in.nextInt(); //Input & Calculations
        if (colour == 1 || colour == 2 || colour == 3 || colour == 4 || colour == 5 || colour == 6 || colour == 7 || colour == 8 || colour == 9 || colour == 10){
          price = price + 0;
        }
        else if (colour == 11){
          price = price + 890;
        }
        else if (colour == 12){
          price = price + 4500;
        }
        else if (colour == 13 || colour == 14){
          price = price + 5200;
        }
        System.out.println("\nWheel Choice: ");
        int wheels = in.nextInt();  //More Input & Calculations
        if (wheels == 1 || wheels == 2){
          price = price + 0;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price); //Subtotal Printed on Bottom Left 
      }
      else if (abc == 2){
        break;
      }
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Press 1 to continue, 2 to exit.");
      int def = in.nextInt();
      if (def == 1){
        System.out.println("\nSelect Upholstery & Trim:"); //Selecting Upholstery & Trim
        System.out.println("\nOur Upholsteries (no additional charge) Include:\t\t\t\t\t\tOur Trims Include:\n(1)Bengal Red/Black designo Exclusive Nappa Leather\t\t\t\t\t\t(1)Anthracite Poplar Wood, without additional charge\n(2)Crystal Grey/Black designo Exclusive Nappa Leather\t\t\t\t\t(2)Burl Walnut Wood Trim, without additional charge\n(3)Saddle Brown/Black designo Exclusive Nappa Leather\t\t\t\t\t(3)designo Piano Black Lacquer\t\t\t$1,000.00\n(4)Black designo Exclusive Nappa Leather\t\t\t\t\t\t\t(4)designo Piano Black Lacquer Flowing Lines\t$1,500.00\n(5)Porcelain/Espresso Brown designo Exclusive Nappa Leather\t\t\t\t\t(5)AMG Carbon Fibre/Piano Black Lacquer\t\t$6,000.00");
        System.out.println("\nUpholstery Choice:");
        int up = in.nextInt(); //Input & Calculations
        if (up == 1 || up == 2 || up == 3 || up == 4 || up == 5){
          price = price + 0;
        }
        System.out.println("\nTrim Choice: ");
        int trim = in.nextInt(); //More Input & Calculations
        if (trim == 1 || trim == 2){
          price = price + 0;
        }
        else if (trim == 3){
          price = price + 1000;
        }
        else if (trim == 4){
          price = price + 1500;
        }
        else if (trim == 5){
          price = price + 6000;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price); //Subtotal Printed on Bottom Left 
      }
      else if (def == 2){
        break; //Exiting Method
      }
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Press 1 to continue, 2 to exit.");
      int ghi = in.nextInt();
      if (ghi == 1){
        System.out.println("\nSelect Optional Equipment: "); //Selecting Optional Equipment
        System.out.println("\nDesign:\n(1)AMG Exterior Carbon Trim\t\t$7,000.00\n(2)Not Needed");
        int design = in.nextInt(); //Input & Calculations
        if (design == 1){
          price = price + 7000;
        }
        else if (design == 2){
          price = price + 0;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price);     //Subtotal Printed on Bottom Left 
        System.out.println("\nEntertainment:\n(1)12.3-Inch Splitview Screen\t\t$900.00\n(2)Not Needed");
        int enter = in.nextInt(); //More Input & Calculations
        if (enter == 1){
          price = price + 900;
        }
        else if (enter == 2){
          price = price + 0;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price);   //Subtotal Printed on Bottom Left 
        System.out.println("\nInterior:\n(1)AirScarf Heating\t\t\t$600.00\n(2)Refrigerated Rear Compartment\t$1,850.00\n(3)Both\t\t\t\t$2,450.00\n(4)Not Needed");
        int inter = in.nextInt(); //More Input & Calculations
        if (inter == 1){
          price = price + 600;
        }
        else if (inter == 2){
          price = price + 1850;
        }
        else if (inter == 3){
          price = price + 2450;
        }
        else if (inter == 4){
          price = price + 0;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price);    //Subtotal Printed on Bottom Left 
        System.out.println("\nSafety\n(1)AMG Carbon Ceramic Brake System\t$13,750.00\n(2)Basic Silver Brake Calipers\t\t$0");
        int safety = in.nextInt(); //More Input & Calculations
        if (safety == 1){
          price = price + 13750;
        }
        else if (safety == 2){
          price = price + 0;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price);  //Subtotal Printed on Bottom Left  
        System.out.println("\nSteering/Transmission:\n(1)Basic Leather Covered Steering Wheel\t$0\n(2)AMG Performance Steering Wheel\t$250.00\n(3)Sport Wood/Leather Steering Wheel\t$650.00");
        int trans = in.nextInt(); //More Input & Calculations
        if (trans == 1){
          price = price + 0;
        }
        else if (trans == 2){
          price = price + 250;
        }
        else if (trans == 3){
          price = price + 650;
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Subtotal: $"+price);   //Subtotal Printed on Bottom Left 
      }
      else if (ghi == 2){
        break; //Exiting Method
      }
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Press 1 to complete, 2 to exit.");
      int jkl = in.nextInt();
      if (jkl == 1){
        double newPrice = price - 263700;
        System.out.println("\nSummary-Your Mercedes Benz:");//Summary of Your Vehicle
        System.out.println("\n\nTechnical Data:\n\t\t\t\t\t\t\t\t\tPricing Information\nFuel Type\t\t\tPremium\t\t\t\t\t\tBase Price:\t\t   $263,700.00\nCylinders\t\t\t12\t\t\t\t\t\tConfigured Options:\t\t   $"+newPrice+"\nTotal Displacement\t\t5980cc\t\t\t\t\t\tTotal:\t\t\t   $"+price+"\nNet Power\t\t\t(621 hp)\nTransmission\t\tAMG SPEEDSHIFT PLUS 7G\t\t\t\tContact Dealer for Test Drive - (416)947-9000\n\t\t\tTRONIC Transmission\t\t\t\t\tAddress - 761 Dundas St E, Toronto, ON M5A 4N5");
      }
      else if (jkl == 2){
        break; //Exiting Method
      }
      System.out.println("\nAny Changes?\nYes(1)\nNo(2)");  //Asking User to restart method
      int con = in.nextInt();
      if (con == 1){
        configurator = true;
      }
      else if (con == 2){
        configurator = false;        
      }
    }
    in.close(); //closing the scanner
  }
}

