import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DrugzLLCView {
	public DrugzLLCView() {
		JFrame jFrame = createJFrame();

		int i = 20;
		for (Table table : Table.values()) {
			jFrame.add(createButton(table.name(), i));
			i += 110;
		}
		jFrame.repaint();
	}

	private JFrame createJFrame() {
		JFrame jFrame = new JFrame("Drugz LLC");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(700, 700);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
		jFrame.setResizable(false);
		return jFrame;
	}

	private JButton createButton(String title, int x) {
		JButton button = new JButton(title);
		Font font = new Font(null, Font.BOLD, 12);
		button.setBounds(x, 10, 110, 40);
		button.setFont(font);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		return button;
	}

	private enum Table {
		PATIENTS, PRESCRIPTIONS, DOCTORS, SEE, PRESCRIBE, HAVE;
	}

}
