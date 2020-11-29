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

        for (int i = 0; i < j; i++) {

            numbersOddAndZeroCut[i] = numbersOddCut[i];
        }

        return numbersOddAndZeroCut;
    }

    public int[] removeEven() {
        // TODO: Remove all even numbers from the array with for-each loop
        throw new UnsupportedOperationException();
    }

    public int[] removeEvenOrOdd(boolean odd) {
        // TODO: Remove all odd or even numbers (based on the second argument) from the array with for-each loop
        throw new UnsupportedOperationException();
    }

    public int[] removeDivisibleByThree() {
        // TODO: Remove all numbers which are divisible by three from the array with while or do-while loop
        throw new UnsupportedOperationException();
    }

    public int[] removeDivisible(int divisor) {
        // TODO: Remove all numbers which are divisible by the second argument
        throw new UnsupportedOperationException();
    }
}
