package AirConditioner;

public class AirConditioner{
    String brand;
    String location;
    int acID = 0;
    boolean isOn = false;
    String units = "Celsius";
    String mode = "Cool";
    double roomTemperature = 24.0;
    double desiredTemperature = 18.0;

    protected String getBrand(){
        return brand;
    }

    protected String getLocation(){
        return location;
    }

    protected int getACID(){
        return acID;
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

   public void setUnits(){
       if (units.equals("Celsius")){
            units = "Fahrenheit";
       } 
       else{
        units = "Celsius";
       }
   }
}
