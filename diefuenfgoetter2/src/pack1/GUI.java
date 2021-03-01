package pack1;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

	JFrame jf1 = new JFrame("Webshop");
	JPanel jp1 = new JPanel();
	static JButton[] barray = new JButton[24];

	public GUI() {
		buttonsplatzieren();
		jf1.setBackground(Color.DARK_GRAY);
		jf1.setBounds(10, 10, 1680, 1025);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf1.setResizable(true);
		jf1.add(jp1);
		jf1.setVisible(true);

	}
	

	
	public void barrayBefuellen() {
		for(int i=0;i<=23;i++) {
			barray[i]= new JButton();
		}
		
		barray[0].setText("<html>PS4 Controller Gehäuse<br>Henning Pink</html>");
		barray[1].setText("<html>PS4 Controller Gehäuse<br>Exhibitions Grün</html>");
		barray[2].setText("<html>PS5 Controller Gehäuse <br>Weiber Gold</html>");
		barray[3].setText("<html>PS5 Controller Gehöuse<br>Tropenwald Rückschlag</html>");
		barray[4].setText("<html>XBOX One S Controller Gehäuse<br>Zuhälter Gold</html>");
		barray[5].setText("<html>Bimtendo Snitch Controller Gehäuse<br>Eiter Gelb</html>");
		barray[6].setText("<html>Bimtendo Snitch Controller Gehäuse<br>Suizid Schwarz</html>");
		barray[7].setText("<html><br></html>");
		barray[8].setText("<html><br></html>");
		barray[9].setText("<html><br></html>");
		barray[10].setText("<html><br></html>");
		barray[11].setText("<html><br></html>");
		barray[12].setText("<html><br></html>");
		barray[13].setText("<html><br></html>");
		barray[14].setText("<html><br></html>");
		barray[15].setText("<html><br></html>");
		barray[16].setText("<html><br></html>");
		barray[17].setText("<html><br></html>");
		barray[18].setText("<html><br></html>");
		barray[19].setText("<html><br></html>");
		barray[20].setText("<html><br></html>");
		barray[21].setText("<html><br></html>");
		barray[22].setText("<html><br></html>");
		barray[23].setText("<html><br></html>");
		
		
		
	}
	
	public void buttonsplatzieren() {
		jp1.setBounds(10, 20, 600, 800);
		jp1.setBackground(Color.LIGHT_GRAY);
		jp1.setVisible(true);

		barrayBefuellen();
		int tx = 50;
		int stage = 1;
		for (int i = 0; i <= 23; i++) {

			if (stage == 1) {
				barray[i].setSize(5, 5);
				barray[i].setBounds(tx, 140, 220, 50);
				barray[i].setBackground(new Color(0, 191, 255));
				barray[i].setVisible(true);
				barray[i].addActionListener(new ButtonAction());
				jf1.add(barray[i]);
				tx = tx + 230;
				if (tx > 1200) {
					stage = 2;
					tx = 50;
				}
			} else if (stage == 2) {
				barray[i].setSize(5, 5);
				barray[i].setBounds(tx, 400, 220, 50);
				barray[i].setBackground(new Color(0, 191, 255));
				barray[i].setVisible(true);
				barray[i].addActionListener(new ButtonAction());
				jf1.add(barray[i]);
				tx = tx + 230;
				if (tx > 1200) {
					stage = 3;
					tx = 50;
				}
			} else if (stage == 3) {
				barray[i].setSize(5, 5);
				barray[i].setBounds(tx, 660, 220, 50);
				barray[i].setBackground(new Color(0, 191, 255));
				barray[i].setVisible(true);
				barray[i].addActionListener(new ButtonAction());
				jf1.add(barray[i]);
				tx = tx + 230;
				if (tx > 1200) {
					stage = 4;
					tx = 50;
				}
			}else if(stage==4) {
				barray[i].setSize(5, 5);
				barray[i].setBounds(tx, 920, 220, 50);
				barray[i].setBackground(new Color(0, 191, 255));
				barray[i].setVisible(true);
				barray[i].addActionListener(new ButtonAction());
				jf1.add(barray[i]);
				tx = tx + 230;
			}

		}

	}

}
