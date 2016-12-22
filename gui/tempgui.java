import javax.swing.*;
import java.awt.*;

public class tempgui extends JFrame {
    
    private Container pane;
    private JButton f;
    private JButton c;
    private JTextField text;
    
    //CONSTRUCTOR SETS EVERYTHING UP
    public tempgui() {
	this.setTitle("My first GUI");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
     pane = this.getContentPane();
     pane.setLayout(new FlowLayout());  //NOTE!! THIS CAN BE CHANGED (see below)
     
     f = new JButton("Fahrenheit to Celsius");
     c = new JButton("Celsius to Fahrenheit");
     text = new JTextField(5);
     pane.add(f);
     pane.add(text);
     pane.add(c);
    }

    //MAIN JUST INSTANTIATES + MAKE VISIBLE
    public static void main(String[] args) {
	tempgui g = new tempgui();
	g.setVisible(true);

	if(f.getModel().isPressed())
	    {
		JLabel e = new JLabel("" + (temperature.FtoC(Double.parseDouble(text.getText()))));
		pane.add(e);
		e.setVisible(true);
	    }
    }
    
}

