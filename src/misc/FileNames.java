package misc; /**
 * @author Leonhard Leung
 * Date: 09/10/2023
 */

public class FileNames {
    private String bestFile;
    private String aveFile;
    private String worstFile;
    private String dataLength;

    /**
     * The constructor creates an object of misc.FileNames upon a given number of 1 to 5. The String values of the best
     * file, average file, worst file, and data length will be assigned to an object.
     * @param number the data set to be used in an object
     */
    public FileNames(int number) {
        switch(number) {
            case 1 -> tenThousand();
            case 2 -> fiftyThousand();
            case 3 -> twoHundredThousand();
            case 4 -> fiveHundredThousand();
            case 5 -> oneMillion();
        }
    } // end of misc.FileNames constructor

    public void tenThousand() {
        bestFile = "Data Files/10k/10000_ascending.csv";
        aveFile = "Data Files/10k/10000.csv";
        worstFile = "Data Files/10k/10000_descending.csv";
        dataLength = "10K";
    }

    public void fiftyThousand() {
        bestFile = "Data Files/50k/50000_ascending.csv";
        aveFile = "Data Files/50k/50000.csv";
        worstFile = "Data Files/50k/50000_descending.csv";
        dataLength = "50K";
    }

    public void twoHundredThousand() {
        bestFile = "Data Files/200k/200000_ascending.csv";
        aveFile = "Data Files/200k/200000.csv";
        worstFile = "Data Files/200k/200000_descending.csv";
        dataLength = "200K";
    }

    public void fiveHundredThousand() {
        bestFile = "Data Files/500k/500000_ascending.csv";
        aveFile = "Data Files/500k/500000.csv";
        worstFile = "Data Files/500k/500000_descending.csv";
        dataLength = "500K";
    }

    public void oneMillion() {
        bestFile = "Data Files/1m/1000000_ascending.csv";
        aveFile = "Data Files/1m/1000000.csv";
        worstFile = "Data Files/1m/1000000_descending.csv";
        dataLength = "1M";
    }
    public String getBestFile() {
        return bestFile;
    }

    public String getAveFile() {
        return aveFile;
    }

    public String getWorstFile() {
        return worstFile;
    }

    public String getDataLength() {
        return dataLength;
    }
} // end of misc.FileNames class
