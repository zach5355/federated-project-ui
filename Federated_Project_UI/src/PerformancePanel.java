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
		setLayout(new MigLayout("", "[][][]", "[]"));
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		add(lblEmployeeId, "cell 0 0,alignx trailing");
		
		txtEmpid = new JTextField();
		txtEmpid.setText("EMPID");
		add(txtEmpid, "cell 1 0,growx");
		txtEmpid.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		add(btnEnter, "cell 2 0");

	}

}
