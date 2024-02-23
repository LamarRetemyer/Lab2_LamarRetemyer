package AirConditioner;


public class CoolingSystem {

    public static void main(String[] args) {
        
        //create the objects
        AirConditioner carrierAirConditioner = new AirConditioner();
        AirConditioner lennoxAirConditioner = new AirConditioner();
        AirConditioner traneAirConditioner = new AirConditioner();
        
        //Set carrier information 
        carrierAirConditioner.setBrand("Carrier");
        carrierAirConditioner.setLocation("Atrium");
        carrierAirConditioner.setACID(34);
                
        //Set lennox information
        lennoxAirConditioner.setBrand("Lennox");
        lennoxAirConditioner.setLocation("Lobby");
        lennoxAirConditioner.setACID(93);
       
        //Set trane information
        traneAirConditioner.setBrand("Trane");
        traneAirConditioner.setLocation("Kitchen");
        traneAirConditioner.setACID(67);
        traneAirConditioner.turnOn();
    }
    
}
