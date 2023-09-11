import sort.Sorter;
import sort.BubbleSort;
import sort.InsertionSort;
import sort.SelectionSort;
import misc.ArrayMaker;
import misc.FileNames;

public class Executable {
    private Sorter sort;
    private final ArrayMaker array = new ArrayMaker();

    public static void main(String[] args) {
        Executable program = new Executable();
        program.run();
    } // end of main method

    public void run() {
        int sortType;
        int dataSetCategory;

        for (dataSetCategory = 1; dataSetCategory < 6; dataSetCategory++) {
            for (sortType = 1; sortType < 4; sortType++) {
                switch (sortType) {
                    case 1 -> sort = new BubbleSort();
                    case 2 -> sort = new InsertionSort();
                    case 3 -> sort = new SelectionSort();
                }
                FileNames file = new FileNames(dataSetCategory);
                results(file.getBestFile(), file.getAveFile(), file.getWorstFile(), array, sort, file.getDataLength());
            }
        }

        System.out.println("\nexiting...");
        System.exit(0);
    } // end of run method

    public void results(String bestFile, String aveFile, String worstFile, ArrayMaker array, Sorter execute,
                        String dataLength) {
        // array instantiation
        System.out.println("creating arrays...");
        int n = array.countElements(aveFile);
        String[] bestArray = new String[n];
        String[] aveArray = new String[n];
        String[] worstArray = new String[n];

        // array population
        System.out.println("populating arrays...");
        array.createArrays(bestArray, bestFile, aveArray, aveFile, worstArray, worstFile);

        // sort and count
        System.out.println("sorting and determining the number of executions...");
        execute.count(bestArray, aveArray, worstArray);

        // display results
        System.out.println("process complete");
        displayResult(execute.getBestCount(), execute.getAveCount(), execute.getWorstCount(), dataLength, execute.getSortType());
    } // end of results

    public void displayResult(long best, long ave, long worst, String dataLength, String sortType) {
        System.out.println("\n//-----------------------------------");
        System.out.println("  " + sortType + " SORT RESULT (" + dataLength + " Data)");
        System.out.println("  best case: " + best);
        System.out.println("  average case: " + ave);
        System.out.println("  worst case: " + worst);
        System.out.println("//-----------------------------------\n");
    } // end of displayResult method
} // end of Main class
