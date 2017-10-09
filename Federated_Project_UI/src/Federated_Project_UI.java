import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Federated_Project_UI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Federated_Project_UI frame = new Federated_Project_UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Federated_Project_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnPerformance = new JButton("Performance");
		GridBagConstraints gbc_btnPerformance = new GridBagConstraints();
		gbc_btnPerformance.insets = new Insets(0, 0, 5, 0);
		gbc_btnPerformance.gridx = 0;
		gbc_btnPerformance.gridy = 0;
		panel.add(btnPerformance, gbc_btnPerformance);
		
		JButton btnBudget = new JButton("Budget");
		GridBagConstraints gbc_btnBudget = new GridBagConstraints();
		gbc_btnBudget.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBudget.gridx = 0;
		gbc_btnBudget.gridy = 1;
		panel.add(btnBudget, gbc_btnBudget);
	}

}
