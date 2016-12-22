import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tempgui extends JFrame implements ActionListener{
    
    private Container pane;
    private JButton f, c;
    private JTextField text;
    private JLabel end;

    public void actionPerformed(ActionEvent e){

	if (e.getSource() == f){
	    double converted =
		(temperature.FtoC(Double.parseDouble(text.getText())));
	    end.setText("" + converted);
	}
	
	if (e.getSource() == c){
	    double converted =
		(temperature.CtoF(Double.parseDouble(text.getText())));
	    end.setText("" + converted);
	}
    }

    
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
     end = new JLabel();
     pane.add(f);
     pane.add(text);
     pane.add(c);
     pane.add(end);

     f.addActionListener(this);
     c.addActionListener(this);
     
     
    }

    //MAIN JUST INSTANTIATES + MAKE VISIBLE
    public static void main(String[] args) {
	tempgui g = new tempgui();
	g.setVisible(true);

    }
    
}

