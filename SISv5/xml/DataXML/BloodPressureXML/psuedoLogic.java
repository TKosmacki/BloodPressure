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

  /*private static void componentTask(syst,dias,age,sex){
        if (sex.equals("Male")){
            if (age >= 15 && age <= 18){
            }
            if (age >= 19 && age <= 24){
            }
            if (age >= 25 && age <= 29){
            }
            if (age >= 30 && age <= 35){
            }
            if (age >= 36 && age <= 39){
            }
            if (age >= 40 && age <= 45){
            }
            if (age >= 46 && age <= 49){
            }
            if (age >= 50 && age <= 55){
            }
            if (age >= 56 && age <= 59){
            }
            if (age >= 60){
            }
        }
        else{
            if (age >= 15 && age <= 18){
            }
            if (age >= 19 && age <= 24){
            }
            if (age >= 25 && age <= 29){
            }
            if (age >= 30 && age <= 35){
            }
            if (age >= 36 && age <= 39){
            }
            if (age >= 40 && age <= 45){
            }
            if (age >= 46 && age <= 49){
            }
            if (age >= 50 && age <= 55){
            }
            if (age >= 56 && age <= 59){
            }
            if (age >= 60){
            }
        }
    }*/