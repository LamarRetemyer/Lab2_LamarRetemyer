package AirConditioner;


public class CoolingSystem {
    
    public static void main(String[] args) {
        AirConditioner[] array1 = new AirConditioner[3]; 
        //create the objects
        array1[0] = new AirConditioner();
        array1[1] = new AirConditioner();
        array1[2] = new AirConditioner();
        
        //Set carrier information 
        array1[0].setBrand("Carrier");
        array1[0].setLocation("Atrium");
        array1[0].setACID(34);
        array1[0].turnOn();
        array1[0].setDesiredTemperature(19.5, "Celsius");
                
        //Set lennox information
        array1[1].setBrand("Lennox");
        array1[1].setLocation("Lobby");
        array1[1].setACID(93);
        array1[1].turnOn();
        array1[1].setUnits("Fahrenheit");
        array1[1].setMode(1);
        array1[1].setDesiredTemperature(16.3);

       
        //Set trane information
        array1[2].setBrand("Trane");
        array1[2].setLocation("Kitchen");
        array1[2].setACID(67);
        array1[2].turnOn();
        array1[2].turnOff();
        array1[2].setMode(2);
        array1[2].setDesiredTemperature(24.0);

        //Loop to iterate through the array 
        int i = 0;
        while(i < 3){
            System.out.println(array1[i].toString() + "\n");
            i++;
        }
    }
    
}
