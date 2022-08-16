//Ayush Verma
//4B
import java.util.*;
public class Bicycle
{
    private String color;
    private double location;
    private double speed;
    
    public Bicycle(String hue)
    {
        color = hue;
        location = 0.0;
        speed = 0.0;
    }
    
    public void setSpeed(double newSpeed)
    {
        if (newSpeed >= 0.0)
        {
            speed = newSpeed;
        }
    }
    
    public void increaseSpeed(double deltaSpeed)
    {
        if (speed < 0.0)
        {
            speed = 0.0;
        }
        speed += deltaSpeed;
    }
    
    public double travel(double hours)
    {
        double miles = hours * speed;
        location += miles;
        
        return miles;
    }

    public String getColor()
    {
        return color;
    }

    public double getLocation()
    {
        return location;
    }

    public double getSpeed()
    {
        return speed;
    }
}