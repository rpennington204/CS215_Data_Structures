package creditcard;
import java.io.File;
import java.util.Scanner;

public class CCFileLoader {
	public static void main (String [] args) throws Exception {
		Ar_UListCC testList = new Ar_UListCC();
		Scanner rowScanner = new Scanner(new File("creditcard_balanced.csv"));
		Scanner colScanner;
		rowScanner.nextLine();
		while (rowScanner.hasNextLine()) {
			String rowString = rowScanner.nextLine();
			colScanner = new Scanner(rowString);
			colScanner.useDelimiter(",");
			int newtime = Integer.parseInt(colScanner.next());
			double newamount = Double.parseDouble(colScanner.next());
			int newclass = Integer.parseInt(colScanner.next());
			CCFraudRecord newRec = new CCFraudRecord(newtime, newamount, newclass);
			testList.putItem(newRec);
		}
		rowScanner.close();
		testList.printList();
	}
}
