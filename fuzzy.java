
import net.sourceforge.jFuzzyLogic.FIS;


/**
 * Tipper FCL : Input / output variables are plotted for several input values
 * 
 * @author Celimuge Wu
 *
 */
public class fuzzy {


	public static void main(String args[]) throws Exception {
		// Create FCL system
		// Load from 'FCL' file
		String fileName = "/home/celimuge/fuzzylogic/fuzzy.fcl";
		System.out.println(fileName);
		FIS fis = FIS.load(fileName, true);

	    
		fis.getVariable("probability").setValue(0.5);
		fis.getVariable("connectivity").setValue(0.99);
		fis.getVariable("mobility").setValue(0.99);
		fis.evaluate();
		double result = fis.getVariable("Fitness").getValue();
		
		

		System.out.println(String.format("Fitness: %2.3f ", result));

		//System.out.println("End: Zzz");
	}
}
