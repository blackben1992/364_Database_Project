import java.sql.Connection;

public class DrugzLLC {

	public static void main(String[] args) {
	//	new DrugzLLCView();
		// Connect to the database
		Connection connect = DrugzLLCJDBCToolbox.connect("jdbc:sqlite:Pharmacy.db");


		Patient pat = new Patient("234566123", "tom", "john", "tom", "11/18/2016", "Blue Cross", "La Crosse");
		
		
		
		DrugzLLCJDBCToolbox.insertIntoPatient(connect, pat);
	
		
		
		// disconnect from the database
		DrugzLLCJDBCToolbox.disconnect(connect);
	}
}
