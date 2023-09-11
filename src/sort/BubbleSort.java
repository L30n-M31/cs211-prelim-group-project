/**
 * @author Leonhard Leung
 * Date: 09/11/2023
 */

package sort;

public class BubbleSort implements Sorter {
    private long bestCount;
    private long aveCount;
    private long worstCount;

    @Override
    public long sort(String[] array) {
        long initializeCounter = 0, incrementCounter = 0, conditionCounter = 0, blockCounter = 0, returnCounter = 1;

        for (int i = 0; i < array.length - 1; i++, incrementCounter++, conditionCounter++) {
            for (int j = 0; j < array.length - i - 1; j++, incrementCounter++, conditionCounter++) {
                if (array[j].compareToIgnoreCase(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    blockCounter += 3;
                }
                conditionCounter++;
            }
            initializeCounter++;
            conditionCounter++;
        }
        initializeCounter++;
        conditionCounter++;

        return initializeCounter + incrementCounter + conditionCounter + blockCounter + returnCounter;
    } // end of sort method

    @Override
    public void count(String[] bestArray, String[] aveArray, String[] worstArray) {
        bestCount = sort(bestArray);
        aveCount = sort(aveArray);
        worstCount = sort(worstArray);
    } // end of count method

    @Override
    public long getBestCount() {
        return bestCount;
    }

    @Override
    public long getAveCount() {
        return aveCount;
    }

    @Override
    public long getWorstCount() {
        return worstCount;
    }

    @Override
    public String getSortType() {
        return "BUBBLE";
    }
} // end of BubbleSort class
