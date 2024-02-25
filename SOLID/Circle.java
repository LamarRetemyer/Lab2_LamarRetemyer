package SOLID;
//PLEASE NOTE THAT IN THIS EXAMPLE THE AIM IS TO DEMONSTRATE THE SOLID PRINCIPLES WITHIN THE SAME FILE TO PAINT A CLEARER PICTURE FOR THE READER. 
//THIS IS NOT A REPRESENTATION OF HOW THE CODE WILL OPERATE OR FUNCTION.

//Single Responsibility Principle states that a class should only have one job and only one reason to change. Having multiple jobs makes maintenance difficult.
//Open Closed Principle states that at code should be open to modification and extenstion (interoperablity).
//Liskov Substitution Principle states that objects of a superclass must be replaceable with their subclass counterparts without altering the functionality of the code.
//Interface Segregation Principle states that methods should be specific to the user's needs 
// Dependecy Inversion Principle states that high level modules should not depends on low level modules, and that both should depend on abstractions.

//Below is a simple example where we have a class that defines the properties of a circle and another that would draw the circle. Below all the concepts will be shown in some capacity


//ISP is shown in each class giving methods that are relevant to the needs the user
public class Circle {
    double radius;
    double diameter;

    public void setRadius(double rad){
        radius = rad;
    }
    public void setDiameter(double dia){
        diameter = dia;
    }

}

public class Rectangle{ 
    double perimeter;
    double length;
    double width;

    public void setPerimeter(double per){
        perimeter = per;
    }

    public void setLength(double len){
        length = len;
    }

    public void setWidth(double wid){
        width = wid;
    }
}

class Trapezoid extends Rectangle{//LSP given the trapezoid operates very similarly to the rectangle, hence the two a replaceable in function and operate the same way in the context of this code. 
    //Code to establish the trapezoid 
}

public class Drawer{ //SRP to distinguish the classes to prevent confusion by implementing the class into each iteration of objects we wish to draw. 
    //OCP imagine that the code was written with the intent of only drawing circles initially. Generalizing the class allows for the user to add Rectangles or any other shapes
    public void drawCircle (Circle circle){
        //Create code to create circle.
    }
    public void drawRectangle (Circle circle){
        //Create code to create circle.
    }
}

///DIP EXAMPLE TAKEN FROM CHAT GPT.
//This is message sender code implemets DIP by adding an interface between MessageSender and EmailService given they both do the same thing, a higher
//module like MessageSender should not have to depend on the send method from a lower module to send the messages.
// High-level module
class MessageSender {
    private MessageService messageService;

    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String message) {
        messageService.send(message);
    }
}
// Dependency Inversion
interface MessageService {
    void send(String message);
}

class EmailService implements MessageService {
    public void send(String message) {
        // Logic to send an email
        System.out.println("Email sent: " + message);
    }
}