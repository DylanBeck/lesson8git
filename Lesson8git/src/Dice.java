import java.net.URL;
import javax.swing.ImageIcon;

public class Dice {
    private int value;
    private ImageIcon pic;
    
    public Dice()
    {
        value = 1;
        URL file = getClass().getResource("d1.JPG");
        pic = new ImageIcon(file);
       
    }
    public int getValue()
    {
        return value;
    }
    
    public void roll()
    {
        value =(int)(Math.random()*6)+1;
        URL file = getClass().getResource("d"+value + ".JPG");
        pic = new ImageIcon(file);
    }
    public ImageIcon getPic()
    {
        return pic;
    }
}