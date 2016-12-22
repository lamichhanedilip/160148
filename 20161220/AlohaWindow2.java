import java.awt.*;
import javax.swing.*;
public class AlohaWindow2{
	public static void main(String[] args){
		JFrame frame = new JFrame();

		frame.setSize(500,600);

		frame.setTitle("ディリプ!");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new FlowLayout());
      
		JLabel label = new JLabel("HELLO");
		Container ctnr = frame.getContentPane();
		ctnr.add(label);

		JButton button = new JButton("Click Me!");
		ctnr.add(button);


		frame.setVisible(true);
	}

	}