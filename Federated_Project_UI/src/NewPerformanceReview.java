import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class NewPerformanceReview extends JPanel {
	private JTextField txtXxxxxxx;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public NewPerformanceReview() {
		setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("left:max(59dlu;default)"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		add(lblEmployeeId, "2, 2, left, default");
		
		txtXxxxxxx = new JTextField();
		txtXxxxxxx.setText("xxxxxxx");
		add(txtXxxxxxx, "4, 2, left, default");
		txtXxxxxxx.setColumns(10);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		add(lblEmployeeName, "2, 4");
		
		JLabel lblFirstName = new JLabel("First Name");
		add(lblFirstName, "4, 4");
		
		JLabel lblLastName = new JLabel("Last Name");
		add(lblLastName, "6, 4");
		
		JLabel lblMi = new JLabel("MI");
		add(lblMi, "8, 4");
		
		JLabel lblPreviousMerit = new JLabel("Previous Merit");
		add(lblPreviousMerit, "2, 6");
		
		JLabel lblXx = new JLabel("XX");
		add(lblXx, "4, 6");
		
		JLabel lblNewMerit = new JLabel("New Merit");
		add(lblNewMerit, "2, 8, left, default");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"XX", "XX", "XX", "XX"}));
		add(comboBox, "4, 8, left, default");
		
		JLabel lblSalaryIncrease = new JLabel("Salary Increase");
		add(lblSalaryIncrease, "2, 10, right, default");
		
		textField = new JTextField();
		textField.setText("2.5%");
		add(textField, "4, 10, left, default");
		textField.setColumns(10);

	}

}
