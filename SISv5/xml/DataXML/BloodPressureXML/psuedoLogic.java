if (alert boolean  = true){
	System.out.println("========= Sending Reading To Your Doctor =========");
	alert.putPair("Systolic", sex);
	alert.putPair("Diastolic", dias);
	alert.putPair("Pulse", 90);
	alert.putPair("Date", System.currentTimeMillis() + "");
	encoder.sendMsg(alert);


}

		if(emer == true){
               System.out.println("========= Send out Emergency message =========");
           
               emergency.putPair("MainComponent", "BloodPressure");
              // emergency.putPair("AuxComponents", "Temp");
               emergency.putPair("Note", alertMsgAboutBP);
               emergency.putPair("Date", System.currentTimeMillis() + "");
           
               encoder.sendMsg(emergency);
           }

     private static void componentTask(syst,dias,age,sex){
       boolean emer, alert;

       emer = false;
       alert= false;

       
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
            /*  
                I believe that we should send an alert message to the doctor whenever there is an
                emergency. The SIS server handles the messages differently in CreateUploader.java
                If we only send an emergency, the readings are not passed through the message function, 
                and if we only send alert, then the note/emergency message is not passed to the "database"
            */
            System.out.println("========= Sending  out Emergency message =========");
            //We can be pretty and print out the emergency message in our terminal
            emergency.putPair("MainComponent", "BloodPressure");
            emergency.putPair("Note", alertMsgAboutBP);
            emergency.putPair("Date", System.currentTimeMillis() + "");
            encoder.sendMsg(emergency);

            System.out.println("========= Sending Reading To Your Doctor =========");
            //We can be pretty and print out the alert message in our terminal
            alert.putPair("Systolic", sex);
            alert.putPair("Diastolic", dias);
            alert.putPair("Pulse", 90);
            alert.putPair("Date", System.currentTimeMillis() + "");
            encoder.sendMsg(alert);

           }

        if(emer != true){
            
            Scanner scan = new Scanner(System.in);
            System.out.println("=== Your Blood Pressure is Fine. Would you like to send to doctor?(Y/N) ");
            String s = scan.next();
            s = s.toLowerCase();

            if(s.equals("y")){
             
            System.out.println("========= Sending Reading To Your Doctor =========");
            //We can be pretty and print out the alert message in our terminal
            alert.putPair("Systolic", sex);
            alert.putPair("Diastolic", dias);
            alert.putPair("Pulse", 90);
            alert.putPair("Date", System.currentTimeMillis() + "");
            encoder.sendMsg(alert);
             System.out.println("========= Thank You For Checking Your BloodPressure =========");
            }
            else{
                System.out.println("========= Thank You For Checking Your BloodPressure =========");
                System.out.println("========= Please Keep Track of Your BloodPressure for Future Reference =========");
            }

        }

    } 