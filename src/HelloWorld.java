/* Assignment 1
 * Purpose to download, run and make sure it works, then commit the result.
 * Steps to complete this assignment:
 * 1.  Change line 17 so that bannerNumber is set to your banner number
 * 2.  Change line 18 so that csid is set to your banner number
 * 3.  Change line 19 so that lastName is set to your banner number
 * 4.  Change line 20 so that firstName is set to your banner number
 * 5.  Compile and run the program
 * 6.  Commit and push the changes back to the repository
 * 7.  You're done!
 */

import java.io.File;
import java.io.FileWriter;

public class HelloWorld {
    private static final String bannerNumber = "B00"; // set your full Banner Number here
    private static final String csid = "????";        // replace ???? with your csid (e.g., abrodsky)
    private static final String lastName = "????";    // replace ???? with your last name (e.g., Brodsky)
    private static final String firstName = "????";   // replace ???? with your last name (e.g., Alex)

    public static void main(String [] args) {
        try {
            File f = new File("data.txt");
            FileWriter fw = new FileWriter(f);
            fw.write(bannerNumber + "," + csid + ",\"" + lastName + "\",\"" + firstName + "\",");
            fw.close();
        } catch (Exception e) {
            System.out.println("Oops, something went wrong.");
            System.out.println(e);
        }
        System.out.println("Hello " + firstName + "!");
    }
}