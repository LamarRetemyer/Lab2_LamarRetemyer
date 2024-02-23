package AirConditioner;

public class AirConditioner{
    private String brand;
    private String location;
    private int acID = 0;
    private boolean isOn = false;
    private String units = "Celsius";
    private String mode = "Cool";
    private double roomTemperature = 24.0;
    private double desiredTemperature = 18.0;


    //Getters and their corresponding setters to gain and change information about the subject
    protected String getBrand(){
        return brand;
    }

    protected void setBrand(String bran){
        brand = bran;
    }


    protected String getLocation(){
        return location;
    }

    protected void setLocation(String loc){
        location = loc;
    } 

    protected int getACID(){
        return acID;
    }

    protected int setACID(int id){
        acID = id;
    }

    protected boolean getIsOn(){
        return isOn;
    }

    protected String getUnits(){
        return units;
    }

    protected String getMode(){
        return mode;
    }

    protected double getRoomTemperature(){
        return roomTemperature;
    }

    protected double getDesiredTemperature(){
        return desiredTemperature;
    }

    //Setters to set the Units to Fahrenheit or Celsius
   protected String setUnits(String unit){
        //Simple if statement to terminate the code and preview an error message if the user types an inapproprate message
        if(!unit.equals("Celsius") && !unit.equals("Fahrenheit")){
            return "Invalid Response. Enter Celsius or Fahrenheit. System reset to default Celsius";
          
        }
        
        //Code to change the input based on user input
        if (units.equals("Celsius")){
            units = "Fahrenheit";
        } 
        else{
        units = "Celsius";
        }
        return "Success!";        
   }

   //code to set the mode of the AC unit
   protected String setMode(int num){
    //Simple code for if user does not type an appropritate number 
        while (num < 0 && num > 4 ){
            return "Please enter a valid mode (1-3)";
           
        }
        //Switch method to set the mode based on user input
        switch (num){
            case 1:
                mode = "Fan";
            case 2:
                mode = "Dry";
            case 3:
                mode = "Cool";
        }
        //Success message
        return "Mode changed!";
   }
   //Code to turn off the AC
   protected boolean turnOff(){
        if (isOn){
            isOn = false;
            return false;
        }
        else{
            return isOn;
        }
    }

    //Code to turn on the AC
   protected boolean turnOn(){
        if (isOn){
            return false;
        }
        else{
            isOn = true;
            return isOn;
        }
   }
   //String message which prints the state of the object
   public String toString(){
        return "brand: " + brand + "\n" + "location: " + location + "\n" + "acID: " + acID + "\n" + "isOn: " + isOn + "\n" + "units: " + units + "\n" + "mode: " + mode + "\n" + "roomTemperature: " + roomTemperature + "\n" + "desiredTemperature: " + desiredTemperature;
   }
}
