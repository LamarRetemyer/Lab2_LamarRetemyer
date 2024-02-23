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
                
        //Set lennox information
        array1[1].setBrand("Lennox");
        array1[1].setLocation("Lobby");
        array1[1].setACID(93);
       
        //Set trane information
        array1[2].setBrand("Trane");
        array1[2].setLocation("Kitchen");
        array1[2].setACID(67);
        array1[2].turnOn();

        //Loop to iterate through the array 
        int i = 0;
        while(i < 3){
            System.out.println(array1[i].toString() + "\n");
            i++;
        }
    }
    
}
