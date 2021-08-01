public class CleanCodeAssignment{
    static class MaximaMinima{
        int minima;
        int maxima;
    }

    static MaximaMinima findMaximaMinima(int numberList[], int size){
        MaximaMinima toBeReturned = new MaximaMinima();

        if (size == 1) {
            toBeReturned.maxima = numberList[0];
            toBeReturned.minima = numberList[0];
            return toBeReturned;
        }

        if (numberList[0] > numberList[1]) {
            toBeReturned.maxima = numberList[0];
            toBeReturned.minima = numberList[1];
        } else {
            toBeReturned.maxima = numberList[1];
            toBeReturned.minima = numberList[0];
        }

        for (int iterator = 2; iterator < size; iterator++) {
            if (numberList[iterator] > toBeReturned.maxima) {
                toBeReturned.maxima = numberList[iterator];
            } else if (numberList[iterator] < toBeReturned.minima) {
                toBeReturned.minima = numberList[iterator];
            }
        }
        return toBeReturned;
    }


    public static void main(String args[]){
        int numberList[] = {
            1000,
            11,
            445,
            1,
            330,
            3000
        };
        int size = numberList.length;
        MaximaMinima result = findMaximaMinima(numberList, size);
        System.out.printf("\nMinimum Element is : %d", result.minima);
        System.out.printf("\nMaximum Element is : %d", result.maxima);
    }
}
