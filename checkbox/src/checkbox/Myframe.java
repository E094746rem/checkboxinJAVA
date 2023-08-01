package checkbox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Myframe extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6231392976973561715L;

	JButton button;
	JCheckBox checkbox;
	ImageIcon onIcon;
	ImageIcon offIcon;

	Myframe() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
//Adding an image to the check box
		onIcon = new ImageIcon("..//checkbox/on1.jpg");
		offIcon = new ImageIcon("..//checkbox/off1.jpg");

		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);

		checkbox = new JCheckBox();
		checkbox.setText("I'm not robot");
		checkbox.setFocusable(false);
		checkbox.setFont(new Font("Consolas", Font.BOLD, 30));
		checkbox.setIcon(offIcon);
		checkbox.setSelectedIcon(onIcon);

		this.add(button);
		this.add(checkbox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == button) {
			var want = checkbox.isSelected();
			System.out.println(want);
			if (want == true) {
				System.out.println("YOu'r not a Robot");
			} else {
				System.out.println("YOu'r a Robot");
			}
		}

	}

}
