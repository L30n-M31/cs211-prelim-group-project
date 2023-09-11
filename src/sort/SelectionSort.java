/**
 * @author Leonhard Leung
 * Date: 09/11/2023
 */

package sort;

public class SelectionSort implements Sorter {
    private long bestCount;
    private long aveCount;
    private long worstCount;

    @Override
    public long sort(String[] array) {
        long initializeCounter = 0, incrementCounter = 0, conditionCounter = 0, blockCounter = 0, returnCounter = 1;

        for (int i = 0; i < array.length - 1; i++, incrementCounter++, conditionCounter++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++, incrementCounter++, conditionCounter++) {
                if (array[minIndex].compareToIgnoreCase(array[j]) > 0) {
                    minIndex = j;
                    blockCounter++;
                }
                conditionCounter++;
            }
            String temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

            initializeCounter++;
            conditionCounter++;
            blockCounter += 4;
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
        return "SELECTION";
    }
} // end of SelectionSort class
