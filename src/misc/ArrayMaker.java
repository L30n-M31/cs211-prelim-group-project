package misc; /**
 * @author Leonhard Leung
 * Date: 09/10/2023
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ArrayMaker {
    /**
     * Counts the number of elements in the data
     * @param filename the path of the file to be read
     * @return the total number of elements
     */
    public int countElements(String filename) {
        int n;
        try {
            Scanner cursor =  new Scanner(new FileReader(filename));
            for (n = 0; cursor.hasNextLine(); n++)
                cursor.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return n;
    } // end of countElements method

    /**
     * Populates an array given the filename and the empty array of type String
     * @param array the empty array to be populated
     * @param filename the file to be read
     */
    public void populateArray(String[] array, String filename) {
        try {
            Scanner cursor = new Scanner(new FileReader(filename));
            for (int index = 0; cursor.hasNextLine(); index++)
                array[index] = cursor.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    } // end of populateArray method

    /**
     * Creates arrays by populating them with data from corresponding files simultaneously.
     * @param bestArray the array to be populated in best case scenario
     * @param bestFile the filename containing the data for the best case scenario
     * @param aveArray the array to be populated in average case scenario
     * @param aveFile the filename containing the data for the average case scenario
     * @param worstArray the array to be populated in worst case scenario
     * @param worstFile the filename containing the data for the worst case scenario
     */
    public void createArrays(String[] bestArray, String bestFile, String[] aveArray, String aveFile,
                             String[] worstArray, String worstFile) {
        ArrayMaker arrayMaker = new ArrayMaker();

        arrayMaker.populateArray(bestArray, bestFile);
        arrayMaker.populateArray(aveArray, aveFile);
        arrayMaker.populateArray(worstArray, worstFile);
    } // end of populate method
} // end of misc.ArrayMaker class
