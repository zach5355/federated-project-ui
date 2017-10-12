import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;

public class PerformancePanel extends JPanel {
	private JTextField txtEmpid;

	/**
	 * Create the panel.
	 */
	public PerformancePanel() {
		setLayout(new MigLayout("", "[][][]", "[][][][][][]"));
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		add(lblEmployeeId, "cell 0 0,alignx trailing");
		
		txtEmpid = new JTextField();
		txtEmpid.setText("EMPID");
		add(txtEmpid, "cell 1 0,growx");
		txtEmpid.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		add(btnEnter, "cell 2 0");
		
		JLabel lblSalary = new JLabel("Salary");
		add(lblSalary, "cell 0 1");
		
		JLabel lblPerformanceReviewDate = new JLabel("Performance Review Date");
		add(lblPerformanceReviewDate, "cell 0 2");
		
		JLabel lblMerit = new JLabel("Merit");
		add(lblMerit, "cell 0 3");
		
		JLabel lblNextPerformanceReview = new JLabel("Next Performance Review Date");
		add(lblNextPerformanceReview, "cell 0 4");
		
		JLabel lblNextPerformanceReivew = new JLabel("Next Performance Reivew Rating");
		add(lblNextPerformanceReivew, "cell 0 5");

	}

}
