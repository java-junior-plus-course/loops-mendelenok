package edu.junior;

/**
 * Author: eukovko
 * Date: 11/23/2020
 */
public class DivisibilityExclusion {

    private int[] numbers;

    public DivisibilityExclusion() {
    }

    public DivisibilityExclusion(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] removeOdd() {
        // TODO: Remove all odd numbers from the array with for loop
        int[] numbers = getNumbers();
        int length = numbers.length;
        int[] numbersOddCut = new int[length];
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (numbers[i] % 2 == 0) {
                numbersOddCut[j++] = numbers[i];
            }
        }
        int[] numbersOddAndZeroCut = new int[j];
        System.arraycopy(numbersOddCut,0, numbersOddAndZeroCut,0,j);
        return numbersOddAndZeroCut;
    }

    public int[] removeEven() {
        // TODO: Remove all even numbers from the array with for-each loop
        int[] numbers = getNumbers();
        int length = numbers.length;
        int[] numbersEvenCut = new int[length];
        int j = 0;
        for (int i : numbers) {
            if (i % 2 != 0) {
                numbersEvenCut[j++] = i;
            }
        }
        int[] numbersEvenAndZeroCut = new int[j];
        System.arraycopy(numbersEvenCut,0, numbersEvenAndZeroCut,0,j);
        return numbersEvenAndZeroCut;
    }

    public int[] removeEvenOrOdd(boolean odd) {
        // TODO: Remove all odd or even numbers (based on the second argument) from the array with for-each loop
        if (odd) {
            //deleting odd numbers
          return removeOdd();
        } else {
            //deleting even numbers
           return removeEven();
        }
    }

    public int[] removeDivisibleByThree() {
        // TODO: Remove all numbers which are divisible by three from the array with while or do-while loop
        int[] numbers = getNumbers();
        int length = numbers.length;
        int[] numbersDivisibleByTreeCut = new int[length];
        int j = 0;
        int i = 0;
        while (i < length) {
            if (numbers[i] % 3 != 0) {
                numbersDivisibleByTreeCut[j++] = numbers[i];
            }
            ++i;
        }
        int[] numbersDivisibleByTreeAndZeroCut = new int[j];
        System.arraycopy(numbersDivisibleByTreeCut,0, numbersDivisibleByTreeAndZeroCut,0,j);
        return numbersDivisibleByTreeAndZeroCut;
    }

    public int[] removeDivisible(int divisor) {
        // TODO: Remove all numbers which are divisible by the second argument
        int[] numbers = getNumbers();
        int length = numbers.length;
        int[] numbersDivisibleByDivisorCut = new int[length];
        int j = 0;
        int i = 0;
        while (i < length) {
            if (numbers[i] % divisor != 0) {
                numbersDivisibleByDivisorCut[j++] = numbers[i];
            }
            ++i;
        }
        int[] numbersDivisibleByDivisorAndZeroCut = new int[j];
        System.arraycopy(numbersDivisibleByDivisorCut,0, numbersDivisibleByDivisorAndZeroCut,0,j);
        return numbersDivisibleByDivisorAndZeroCut;
    }
}
