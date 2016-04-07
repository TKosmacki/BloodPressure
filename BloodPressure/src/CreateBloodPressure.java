import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.*;
import java.io.*;
import java.net.*;
/*import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;*/

public class CreateBloodPressure {
	
	// socket for connection to SISServer
	private static Socket universal;
	private static int port = 53217;
	// message writer
	private static MsgEncoder encoder;
	// message reader
	private static MsgDecoder decoder;
	
	// scope of this component
	private static final String SCOPE = "SIS.Scope1";
	// name of this component
	private static final String NAME = "BloodPressure";
	// messages types that can be handled by this component
	private static final List<String> TYPES = new ArrayList<String>(
			Arrays.asList(new String[] { "Setting", "Alert", "Confirm" }));

	// summary for all incoming / outgoing messages
	private static final String incomingMessages = "IN\tConfirm|Setting:Kill|!incomingMessages!";
	private static final String outgoingMessages = "OUT\t Connect|Emergency|Alert";
	
	private static int refreshRate = 500, max = 40, min = 15;
    private static Date startDate = new Date(), endDate = new Date();

    private static Timer timer = new Timer();

	// shared by all kinds of emergencies and alerts that can be generated by this component
	private static KeyValueList emergency = new KeyValueList();
	private static KeyValueList alert = new KeyValueList();
	
	//initialCode
	static String alert_msg = "Patient has abnormal bloodPressure ";
	static String doctorEmail = "sisfortest@outlook.com"; // default email
	//static ArrayList<Double> tempRecord = new ArrayList<Double>();

	/*
	 * Main program
	 */
	public static void main(String[] args) {
		while (true) {
			try {
				// try to establish a connection to SISServer
				universal = connect();

				// bind the message reader to inputstream of the socket
				decoder = new MsgDecoder(universal.getInputStream());
				// bind the message writer to outputstream of the socket
				encoder = new MsgEncoder(universal.getOutputStream());

				/*
				 * construct a Connect message to establish the connection
				 */
				KeyValueList conn = new KeyValueList();
				conn.putPair("Scope", SCOPE);
				conn.putPair("MessageType", "Connect");
				conn.putPair("IncomingMessages", incomingMessages);
                conn.putPair("OutgoingMessages", outgoingMessages);
				conn.putPair("Role", "Controller");
				conn.putPair("Name", NAME);
				encoder.sendMsg(conn);

				initRecord();

				// KeyValueList for inward messages, see KeyValueList for
				// details
				KeyValueList kvList;

				while (true) {
					// attempt to read and decode a message, see MsgDecoder for
					// details
					kvList = decoder.getMsg();

					// process that message
					ProcessMsg(kvList);
				}

			} catch (Exception e) {
				// if anything goes wrong, try to re-establish the connection
				try {
					// wait for 1 second to retry
					Thread.sleep(1000);
				} catch (InterruptedException e2) {
				}
				System.out.println("Try to reconnect");
				try {
					universal = connect();
				} catch (IOException e1) {
				}
			}
		}
	}

	/*
	 * used for connect(reconnect) to SISServer
	 */
	static Socket connect() throws IOException {
		Socket socket = new Socket("127.0.0.1", port);
		return socket;
	}
	
	private static void initRecord() {
		emergency.putPair("Scope", SCOPE);
		emergency.putPair("MessageType", "Emergency");
		emergency.putPair("Sender", NAME);
		//Checking our uploader, this purpose will never be used, but it doesn't hurt to add it
		//emergency.putPair("Purpose", "BloodPressureAlert");

		// Receiver may be different for each message, so it doesn't make sense
		// to set here  Will not need a receiver for emergency since our SIS.scope 
		// handles this message type by sending it to the upLoader
		//emergency.putPair("Receiver", "BloodPressure");

		alert.putPair("Scope", SCOPE);
		alert.putPair("MessageType", "Alert");
		alert.putPair("Sender", NAME);
		//Checking our uploader, this purpose will never be used FOR OUR APPLICATION, but it doesn't hurt to add it
		alert.putPair("Purpose", "BloodPressureAlert");
	}
    
     private static void componentTask(int syst,int dias,int age,String sex){
       boolean emer;
       String alertMsgAboutBP = "";

       emer = false;
       

       
        // Constructed using elseif statements to follow the rule
        // that, "Once an else if succeeds, none of the remaining else if's or else's
        // will be tested" 
        

        if (sex.equals("Male")){
            if (age >= 15 && age <= 18){

               // 130/95 97/75 this is for demo purposes
               if(syst > 130 || dias > 95)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 110 || dias < 75)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 19 && age <= 24){
              
          
               if(syst > 130 || dias > 89)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 110 || dias < 69)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 25 && age <= 29){


               if(syst > 131 || dias > 90)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 111 || dias < 70)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 30 && age <= 35){

              if(syst > 133 || dias > 92)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 113 || dias < 72)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 36 && age <= 39){

              if(syst > 134 || dias > 93)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 114 || dias < 73)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 40 && age <= 45){

              if(syst > 135 || dias > 93)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 115 || dias < 73)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 46 && age <= 49){

              if(syst > 137 || dias > 94)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 117 || dias < 74)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 50 && age <= 55){

              if(syst > 138 || dias > 95)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 118 || dias < 75)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 56 && age <= 59){
              //131/87
              if(syst > 141 || dias > 97)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 121 || dias < 70)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 60){
              //135/88
              if(syst > 145 || dias > 98)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 125 || dias < 78)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
        }
        else{
            if (age >= 15 && age <= 18){
              //117/77
              if(syst > 127 || dias > 87)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 107 || dias < 67)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 19 && age <= 24){
              //120/79
              if(syst > 130 || dias > 89)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 110 || dias < 69)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 25 && age <= 29){
              //120/80
              if(syst > 130 || dias > 90)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 110 || dias < 70)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 30 && age <= 35){
              //122/81
              if(syst > 132 || dias > 91)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 122 || dias < 71)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 36 && age <= 39){
              //123/82
              if(syst > 133 || dias > 92)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 113 || dias < 72)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 40 && age <= 45){
              //124/83
              if(syst > 134 || dias > 93)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 114 || dias < 73)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 46 && age <= 49){
              //126/84
              if(syst > 136 || dias > 94)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 116 || dias < 74)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 50 && age <= 55){
              //129/85
              if(syst > 139 || dias > 95)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 119 || dias < 75)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 56 && age <= 59){
              //130/86
              if(syst > 140 || dias > 96)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 120 || dias < 76)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
            else if (age >= 60){
              //134/84
              if(syst > 144 || dias > 94)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too high!!!";
                   emer = true;
               }
               else if(syst < 124 || dias < 74)
               {
                   alertMsgAboutBP = "The Patient's Blood Pressure is too low!!!";
                   emer = true;
               }

            }
        }
          if(emer == true){
             
                //I believe that we should send an alert message to the doctor whenever there is an
                //emergency. The SIS server handles the messages differently in CreateUploader.java
                //If we only send an emergency, the readings are not passed through the message function, 
                //and if we only send alert, then the note/emergency message is not passed to the "database"
            
            System.out.println("========= Sending  out Emergency message =========");
            //We can be pretty and print out the emergency message in our terminal
            emergency.putPair("MainComponent", "BloodPressure");
            emergency.putPair("Note", alertMsgAboutBP);
            emergency.putPair("Date", System.currentTimeMillis() + "");
            
            try{
                encoder.sendMsg(emergency);
             }catch(IOException ioe){
              System.out.println("Error Sending Emergency Message.");
              }

            System.out.println("========= Sending Reading To Your Doctor =========");
            //We can be pretty and print out the alert message in our terminal
            alert.putPair("Systolic", Integer.toString(syst));
            alert.putPair("Diastolic", Integer.toString(dias));
            alert.putPair("Pulse", "90");
            alert.putPair("Date", System.currentTimeMillis() + "");


            try{
                encoder.sendMsg(alert);
             }catch(IOException ioe){
              System.out.println("Error Sending Alert Message.");
              }

           }

        if(emer != true){
            
            Scanner scan = new Scanner(System.in);
            System.out.println("=== Your Blood Pressure is Fine. Would you like to send to doctor?(Y/N) ");
            String s = scan.next();
            s = s.toLowerCase();

            if(s.equals("y")){
             
            System.out.println("========= Sending Reading To Your Doctor =========");
            //We can be pretty and print out the alert message in our terminal
            alert.putPair("Systolic", Integer.toString(syst));
            alert.putPair("Diastolic", Integer.toString(dias));
            alert.putPair("Pulse", "90");
            alert.putPair("Date", System.currentTimeMillis() + "");
            try{
                encoder.sendMsg(alert);
             }catch(IOException ioe){
              System.out.println("Error Sending Alert Message.");
              }
             System.out.println("========= Thank You For Checking Your BloodPressure =========");
            }
            else{
                System.out.println("========= Thank You For Checking Your BloodPressure =========");
                System.out.println("========= Please Keep Track of Your BloodPressure for Future Reference =========");
            }

        }
    } 


	/*
	 * process a certain message, execute corresponding actions
	 */
	static void ProcessMsg(KeyValueList kvList) throws IOException {

		String scope = kvList.getValue("Scope");
		
		String broadcast = kvList.getValue("Broadcast");
		String direction = kvList.getValue("Direction");
		
		if(broadcast!=null&&broadcast.equals("True")){
			
			if(direction!=null&&direction.equals("Up")){
				if(!scope.startsWith(SCOPE)){
					return;
				}
			}else if(direction!=null&&direction.equals("Down")){
				if(!SCOPE.startsWith(scope)){
					return;
				}
			}
		}else{
			if(!SCOPE.equals(scope)){
				return;
			}
		}
		
		String messageType = kvList.getValue("MessageType");
		if(!TYPES.contains(messageType)){
			return;
		}
		
		String sender = kvList.getValue("Sender");
		
		String receiver = kvList.getValue("Receiver");
		
		String purpose = kvList.getValue("Purpose");
		
		switch (messageType) {
		case "Reading":
           System.out.println("BloodPressure received, start processing...");
           String systString = kvList.getValue("Systolic");
           String diasString = kvList.getValue("Diastolic");
           String ageString = kvList.getValue("Age");
           String sex = kvList.getValue("SEX");
          
           /*
           		Incase we decide to include weight into out XML
				String weightString = kvList.getValue("Weight");
           	*/


           int syst = 0, dias = 0, age = 0;
            
           if (systString != null && !systString.equals(""))
           {
               try
               {
                   syst = Integer.parseInt(systString);
               }
               catch(Exception e)
               {
                   syst = 0;
               }
           }
           
           if (diasString != null && !diasString.equals(""))
           {
               try
               {
                   dias = Integer.parseInt(diasString);
               }
               catch(Exception e)
               {
                   dias = 0;
               }
           }
           if (ageString != null && !ageString.equals(""))
           {
               try
               {
                   age = Integer.parseInt(ageString);
               }
               catch(Exception e)
               {
                   age = 0;
               }
           }

           /* Function to be commented out if we include weight
           if (weightString != null && !weightString.equals(""))
           {
               try
               {
                   weight = Integer.parseInt(weightString);
               }
               catch(Exception e)
               {
                   weight = 0;
               }
           }
           */

           //contains the knowledge base which does the necessary calculations
           componentTask(syst,dias,age,sex);
		   break;
		case "Confirm":
			System.out.println("Connect to SISServer successful. Boss.");
			break;
		case "Setting":
			if (receiver.equals(NAME)) {
				System.out.println("Message from " + sender);
                System.out.println("Message type: " + messageType);
                System.out.println("Message Purpose: " + purpose);
				switch (purpose) {
					
					case "Activate":
                    String rRate = kvList.getValue("RefreshRate");
                    String sDate = kvList.getValue("StartDate");
                    String eDate = kvList.getValue("EndDate");
                    String maxx = kvList.getValue("Max");
                    String minn = kvList.getValue("Min");

                    if (rRate != null && !rRate.equals(""))
                    {

                        refreshRate = Integer.parseInt(rRate);

                    }

                    if (sDate != null && !sDate.equals("") && eDate != null
                            && !eDate.equals(""))
                    {
                        startDate.setTime(Long.parseLong(sDate));
                        endDate.setTime(Long.parseLong(eDate));
                    }

                    if (maxx != null && !maxx.equals("") && minn != null
                            && !minn.equals(""))
                    {
                        max = Integer.parseInt(maxx);
                        min = Integer.parseInt(minn);
                    }

                   /* try
                    {
                        timer.cancel();
                        timer = new Timer();
                    }
                    catch (Exception e)
                    {
                        // TODO: handle exception
                    }
                    timer.schedule(new TimerTask()
                    {

                        @Override
                        public void run()
                        {
                            // TODO Auto-generated method stub
                            if (System.currentTimeMillis() - endDate.getTime() > 0)
                            {
                                cancel();
                            }
                            else
                            {
                                //componentTask(); 
								System.out.println("Where Component Task is located");
                            }
                        }
                    }, startDate, refreshRate);*/
                    System.out.println("Algorithm Activated");
                    break;

                case "Kill":
                   /* try
                    {
                        timer.cancel();
                    }
                    catch (Exception e)
                    {
                        // TODO: handle exception
                    }*/
                    System.exit(0);
                    break;

                case "Deactivate":
                    try
                    {
                        timer.cancel();
                    }
                    catch (Exception e)
                    {
                        // TODO: handle exception
                    }
                    System.out.println("Algorithm Deactivated");
                    break;
				}
			}
			break;
		}
	}
	}
	

	//!helperCode!


//!helperClassCode!
