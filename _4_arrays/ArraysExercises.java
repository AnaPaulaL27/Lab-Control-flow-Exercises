package org.example.day4._4_arrays;

public class ArraysExercises {

    /*
        firstLast0([0, 1, 2])   -> true
        firstLast0([0, 0, 0, 0] -> true
        firstLast0([5, 66, 0]   -> true
        firstLast0([7, 8])      -> false
        firstLast0([])          -> false
     */
    boolean firstLast0(int[] array) {
        int length = array.length;
        if(length==0){
            return false;
        }
        //index
        if(array[0]==0 ||array[length-1] == 0){
            return true;

        }
        return false;

    }
    /*  Arrays with 3 args only!

        middleInts([5, 26, 19], [1, 34, 22])        -> [26, 34]
        middleInts([11, 99, 5], [100, 20, 14]       -> [99, 20]
        middleInts([7, 7, 7], [44, 17, 56]          -> [7, 17]
     */
    int[] middleInts(int[] a, int[] b) {
        //index
        return new int[] {a[1], b[1]};
    }


    /*
       Write a program that reverses an array of Strings
       reverse({"you", "are", "how", "hello"})  ->  {"hello", "how", "are", "you"}
       reverse({"", null, "me"})                ->  {"me", null, ""}
     */

    String[] reverse(String[] baseArray) {

        String[] reversedArray = new String[baseArray.length];

        for (int i = 0; i < baseArray.length; i++) {

            reversedArray[i] = baseArray[baseArray.length - i - 1];
        }
        return reversedArray;
    }

    /*
        sum([3, 4, 8])    -> 15
        sum([12, 80])     -> 92
        sum([3, 3, 5, 5]) -> 16
        sum([4])          -> 4
        sum([])           -> 0
     */
    int sum(int[] nums) {
        //start at 0
        int sum = 0;

        for( int i =0; i<nums.length; i++){
            sum= sum + nums[i];
        }
        return sum;
    }


    /*

        Given a non-empty array, return true if there is a place to split the array so that
        the sum of the numbers on one side is equal to the sum of the numbers on the other side

        isBalanced([1, 3, 2, 2])     -> true
        isBalanced([5, 5])           -> true
        isBalanced([8, 0, 2, -2, 8]  -> true
        isBalanced([30])             -> false
        isBalanced([2, 3, 4, 1, 2]]) -> false
     */
    boolean isBalanced(int[] array) {
        int sumLeft = 0;
        int sumRight = 0;


        for (int j : array) {
            sumRight += j;
        }

        for (int j : array) {
            sumLeft += j;
            sumRight -= j;

            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }

    /*
        Return difference between max value and min value

        diff([10, 5, 8, 1, 4]) -> 9
        diff([5, 4, 6, 7])     -> 3
        diff([6, 6])           -> 0
        diff([-5, 3, 9])       ->14
     */
    int diff(int[] myArray) {

 //initialise to some starting value,suppose first value in array
 // so in the first case, starting value- index 0=10
 //it's just a starting value, we have not actually done the searching yet

        int min = myArray[0];
        int max = myArray[0];

//for loop to begin the searching:
//for each integer i in the array called myArray
//Math.min() returns lowest -valued number passed into it

        for (int j: myArray) {
            min = Math.min(min, j);
            max = Math.max(max, j);
        }
        return max-min;

    /* or.. 
    int diff(int[] myArray) {
    
    int len = array.length;
    int topVal= myArray[0];
    int lowVal= myArray[0];

    for(int j = 1; j < len; j++){
        if(myArray[j] > topVal){
            topVal = myArray[j];}

     else if(myArray[j] <lowVal){
        lowVal = myArray[j]; }
     }

    return topVal - lowVal;

    */
    }

    /*

        A group is at least two adjacent elements of the same value. Count the number of groups.

        countGroups([1, 2, 2, 3, 4, 4]) -> 2
        countGroups([3, 3, 6, 3, 3])    -> 2
        countGroups([5, 5, 5, 5, 5])    -> 1
        countGroups([])                 -> 0
        countGroups([5, 3, 6, 2, 4])    -> 0
     */
    int countGroups(int[] array) {
        if(array == null) {
            throw new IllegalArgumentException();
        }
        boolean match = false;
        int counter = 0;
        
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i+1] && !match) {
                match = true;
                counter++;
            } else if (array[i] != array[i+1]) {
                match = false;
            }
        }
        return counter;
    }

    /*
        innerInside([5, 6, 7, 4, 3, 3], [6, 4]) -> true
        innerInside([3, 3, 5, 5, 6, 6], [5, 3]) -> true
        innerInside([-1, 2, 3, 2], [3])         -> true
        innerInside([2, 5], [2, 5])             -> true
        innerInside([5, 4, 6, 32, 5], [4, 8])   -> false
        innerInside([], [5])                    -> false
     */
    boolean innerInside(int[] outer, int[] inner) {
        boolean same;
        
        for (int k : inner) {
            same = false;
            
            for (int i : outer) {
                if (k == i) {
                    same = true;
                    break;
                }
            }
            if (same) {
                continue;
            }
            return false;
        }
        return true;
    }
}
