package WatermelonFarmer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;


public class Window extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JPanel 	p1,p2,p3,p4;
	JButton credits,
			close,
			seeds,
			plant,
			water,
			growth,
			harvest,
			income,
			health;
	JLabel 	top, 
			center,
			lb_seeds,
			lb_watermelonBenefits;
	JTextArea tb, textField1, jt;
	ImageIcon im_seeds;
	
public Window() {
    super("Watermelon Farmer App");

    setSize(800,600);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    String tx_seeds = "<html><h2 align='center'>Seeds<br><br><img width='400' height='266' src='https://goo.gl/GcYH1f'/></h2></html>";
    String tx_plant = "<html><h2 align='center'>Plant<br><br><img width='400' height='268' src='https://goo.gl/HXBHdm'/></h2></html>";
    String tx_water = "<html><h2 align='center'>Water<br><br><img width='400' height='249' src='https://goo.gl/FYImoc'/></h2></html>";
    String tx_growth = "<html><h2 align='center'>Growth<br><br><img width='400' height='300' src='https://goo.gl/rTMzym'/></h2></html>";
    String tx_harvest = "<html><h2 align='center'>Harvest<br><br><img width='400' height='300' src='https://goo.gl/XGMN8y'/></h2></html>";
    String tx_health = "<html><br><h1 align='center'>Watermelons!</h1><br>Watermelons are mostly water — about 92 percent — but this <br>" 
		+ "refreshing fruit is soaked with nutrients. Each juicy bite has significant <br>"
		+ "levels of vitamins A, B6 and C, lots of lycopene, antioxidants and amino acids. <br>"
		+ "There's even a modest amount of potassium. Plus, this quintessential summer snack <br>"
		+ "is fat-free, very low in sodium and has only 40 calories per cup. Scientists have <br>"
		+	"taken notice of watermelon's high lycopene levels — about 15 to 20 milligrams per <br>"
		+ "2-cup serving, according to the National Watermelon Promotion Board — some of the <br>"
		+ "highest levels of any type of fresh produce. Lycopene is a phytonutrient, which is <br>"
		+ "a naturally occurring compound in fruits and vegetables that reacts with the human <br>"
		+ "body to trigger healthy reactions. It is also the red pigment that gives watermelons,<br>" 
		+ "tomatoes, red grapefruits and guavas their color. Lycopene has been linked with heart <br>"
		+ "health, bone health and prostate cancer prevention. It's also a powerful antioxidant <br>"
		+ "thought to have anti-inflammatory properties, according to Victoria Jarzabkowski, a <br>" 
		+ "nutritionist with the Fitness Institute of Texas at The University of Texas at Austin. <br>"; 
	
	String tx_income = "<html><br><br><table width='100%'><tbody><tr><td>Estimated Cost</td><td>$700 to $1500 per acre</td></tr>    <tr> <td>Market Potential</td><td> <p>Demand for seedless types increasing.</p></td></tr><tr>      <td>Yield Potential</td><td>10,000 - 70,000 lbs/ac</td> </tr> <tr> <td>Profit Potential</td> <td>$0 to $2,000 per acre</td></tr><tr><td>Adapted Areas</td><td>New Mexico state wide</td></tr></tbody></table></html>";
    String tx_credits = "<html><br><br><br><br><h2 align='center'>Zac Smith<br>NMSU ICT362<br>Fall 2016</h2></html>";
    
    // JPanels
    p1 = new JPanel();
    p2 = new JPanel(new GridBagLayout());
    p3 = new JPanel();
    p4 = new JPanel();
    p1.setBackground(new Color(140,11,66));
    p2.setBackground(new Color(140,11,66));
    p3.setBackground(Color.WHITE);
    p4.setBackground(new Color(109,110,113));

    // JButtons
    credits = new JButton("APP CREDITS");
    close = new JButton("Close");
    close.addActionListener(this);
    seeds = new JButton(" Get Seeds ");
    plant = new JButton("Plant Seeds");
    water = new JButton("     Water     ");
    growth = new JButton("    Growth    ");
    harvest = new JButton("    Harvest    ");
    income = new JButton("     Income    ");
    health = new JButton("     Health    ");

    // set up gridbag
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(15,15,15,15);

    // add buttons to proper panel
    gbc.gridx = 0;
    gbc.gridy = 0;
    p2.add(seeds, gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    p2.add(plant, gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    p2.add(water, gbc);
    gbc.gridx = 0;
    gbc.gridy = 3;
    p2.add(growth, gbc);
    gbc.gridx = 0;
    gbc.gridy = 4;
    p2.add(harvest, gbc);
    gbc.gridx = 0;
    gbc.gridy = 5;
    p2.add(income, gbc);
    gbc.gridx = 0;
    gbc.gridy = 6;
    p2.add(health, gbc);

    
    p4.add(credits);
    p4.add(close);

    // JLabel
    top = new JLabel("Watermelon Farmer App");
    top.setFont(new Font("Courier", Font.BOLD, 38));
    top.setForeground(Color.WHITE);
    p1.add(top);

   

    center = new JLabel("<html><br><br><br><h2 align='center'>Thank you for choosing the <br>NMSU Aggie Watermelon Farmer App</h2></html>");
    center.setFont(new Font("Serif", Font.ITALIC, 16));
    p3.add(center);
    
    //JTextArea JTextField
       
    tb = new JTextArea();
    p3.add(tb);
    

    // Button functions
    
    /* Action for Seeds Button */    
    seeds.addActionListener(new ActionListener () {
    	public void actionPerformed(ActionEvent e) {
    		center.setText(tx_seeds);
    	}
    });
    
    /* Action for Plant Button */  
    plant.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		center.setText(tx_plant);
    	}
    });    
    
    /* Action for Water Button */  
    water.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		center.setText(tx_water);
    	}
    });
    
    /* Action for Growth Button */  
    growth.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		center.setText(tx_growth);
    	}
    });
        
    /* Action for Harvest Button */  
    harvest.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		center.setText(tx_harvest);
    	}
    });
    
    /* Action for Income Button */    
    income.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		center.setText(tx_income);
    	}
    });
    
    /* Action for Health Button to display textArea */
    health.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		center.setText(tx_health);
    	}
    });
    
    /* Action for Credits Button */
    credits.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		center.setText(tx_credits);
    	}
    });
    
    // Add panels to JFrame
    add(p1, BorderLayout.NORTH);
    add(p2, BorderLayout.WEST);
    add(p3, BorderLayout.CENTER);
    add(p4, BorderLayout.SOUTH);

  }

@Override
public void actionPerformed(ActionEvent e) {
	String s = e.getActionCommand();
	if (s.equals("Close")) { System.exit(0); }
	
}




//public static void main(String[] args) {
//	 Window w = new Window();
//	 w.setVisible(true);
//}

}
