/**
 * @author Leonhard Leung
 * Date: 09/11/2023
 */

package sort;

public class InsertionSort implements Sorter{
    public long bestCount;
    public long aveCount;
    public long worstCount;

    @Override
    public long sort(String[] array) {
        long initializeCounter = 0, incrementCounter = 0, conditionCounter = 0, blockCounter = 0, returnCounter = 1;

        for (int i = 1; i < array.length; i++, incrementCounter++, conditionCounter++) {
            String key = array[i];
            int j = i - 1;

            conditionCounter++;
            while (j >= 0 && array[j].compareToIgnoreCase(key) > 0) {
                array[j + 1] = array[j];
                j -= 1;
                blockCounter += 2;
                conditionCounter++;
            }
            array[j + 1] = key;

            blockCounter += 3;
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
        return "INSERTION";
    }
} // end of InsertionSort class
