import TurtleGraphics.*; 
import java.awt.Color;

public class Day3 
{
    public static void main(String[] args) 
    {
        SketchPadWindow win = new SketchPadWindow(600, 400);
        Pen p = new RainbowPen(win);
        Pen e = new WigglePen(win);
        
        p.setWidth(10);
        
        int size = 100;
        
        p.move(size);
        p.turn(90);
        
        p.move(size);
        p.turn(90);
        
        p.move(size);
        p.turn(90);
        
        p.move(size);
        
        e.setColor(Color.MAGENTA);
        
        //move over and draw another square
        e.turn(-90);
        e.up();
        e.move(200);
        e.down();
        e.turn(-90);
        
        e.move(size);
        e.turn(-90);
        
        e.move(size);
        e.turn(-90);
        
        e.move(size);
        e.turn(-90);
        
        e.move(size);
    }
}
