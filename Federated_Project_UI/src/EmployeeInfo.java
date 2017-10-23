import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;

public class EmployeeInfo extends JPanel {

	/**
	 * Create the panel.
	 */
	public EmployeeInfo() {
		setLayout(new FormLayout(new ColumnSpec[] {
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
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		add(lblEmployeeId, "2, 2");
		
		JLabel lblXxxx = new JLabel("XXXX");
		add(lblXxxx, "4, 2");
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		add(lblEmployeeName, "2, 4");
		
		JLabel lblJohnDoe = new JLabel("John Doe");
		add(lblJohnDoe, "4, 4");
		
		JLabel lblSalary = new JLabel("Salary");
		add(lblSalary, "2, 6");
		
		JLabel lblXxxxx = new JLabel("$xx,xxx");
		add(lblXxxxx, "4, 6");
		
		JLabel lblDepartment = new JLabel("Department:");
		add(lblDepartment, "2, 8");
		
		JLabel lblIt = new JLabel("IT");
		add(lblIt, "4, 8");
		
		JLabel lblJob = new JLabel("Job");
		add(lblJob, "2, 10");
		
		JLabel lblSoftwareDevelopment = new JLabel("Software Development");
		add(lblSoftwareDevelopment, "4, 10");
		
		JLabel lblPreviousMerit = new JLabel("Previous Merit");
		add(lblPreviousMerit, "2, 12");
		
		JLabel lblXx = new JLabel("xx");
		add(lblXx, "4, 12");
		
		JLabel lblExpectedMerit = new JLabel("Expected Merit:");
		add(lblExpectedMerit, "2, 14");
		
		JLabel lblXx_1 = new JLabel("XX");
		add(lblXx_1, "4, 14");

	}

}
