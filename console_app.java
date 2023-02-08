package CS_102_PROJECT;

import java.util.*;

public class console_app {
    public static void main(String[] args) {

    }

    public static int[] array_maker(int array_size) {

        int[] rand_int_array = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            rand_int_array[i] = 0 + (int)(Math.random() * ((100 - 0) + 1));
        }

        return rand_int_array;
    }

    public void displayMenu(){
        System.out.print("------------------------------- \n");
        System.out.print("1-Find the minimum value in the array\n");
        System.out.print("2-Find the maximum value in the array\n");
        System.out.print("3-Find the differences from the average\n");
        System.out.print("4-Find the sum of odd indexes in the array\n");
        System.out.print("5-Find the sum of the even indexes in the array\n");
        System.out.print("6-Exit");
        System.out.print("-------------------------------");
    }

    public int getUserAnswer(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your choice;");
        int returnValue = in.nextInt();

        return returnValue;
    }

    public int sumEvens(int[] inputArray){
        int totalSum = 0;
        for(int i = 0; i < inputArray.length; i++){
            if(i%2 == 0){
                totalSum += inputArray[i];
            }
        }
        return totalSum;
    }

    public int sumOdds(int[] inputArray){
        int totalSum = 0;
        for(int i = 0; i < inputArray.length; i++){
            if(i%2 != 0){
                totalSum += inputArray[i];
            }
        }
        return totalSum;
    }

    public void findDifferencesFromAverage(int [] array)
    {
        int array_size= array.length;
        int sum = 0;
        int average=0;

        for(int i = 0; i < array_size ; i++)
        {
            sum = sum + array[i];
           
        }

        average = sum / array_size;

        int[] diferences_from_average = new int [array_size];

        for (int i = 0 ; i < array_size ; i++)
        {
            diferences_from_average[i] =array[i] - average;
        }

        System.out.println(diferences_from_average);
    }


    public int findMax(int [] array){

        int max = Integer.MIN_VALUE;

        for(int i =0; i<array.length;i++){
            if(array[i]>=max){
                max= array[i];
            }
        }
        return max;
    }

    public int findMin(int [] array){

        int min = Integer.MAX_VALUE;

        for(int i =0; i<array.length;i++){
            if(array[i]>=min){
                min= array[i];
            }
        }
        return min;
    }


}