package CS_102_PROJECT;

import java.util.*;

public class console_app {
    public static void main(String[] args) {

        boolean exit = false;

        int user_chose;

        int arr_size;
        
        Scanner in = new Scanner(System.in);

        System.out.print("Provide the size of the array : ");

        arr_size = in.nextInt();

        int[] user_array = array_maker(arr_size);
        

        do {
            
            displayMenu();

            user_chose = getUserAnswer();

            if (user_chose == 1) {
                System.out.println(findMin(user_array));
            }
            else if(user_chose == 2){
                System.out.println(findMax(user_array));
            }
            else if(user_chose == 3){
                findDifferencesFromAverage(user_array);   
            }
            else if(user_chose == 4){
                System.out.println(sumOdds(user_array));
            }
            else if(user_chose == 5){
                System.out.println(sumEvens(user_array));
            }
            else if(user_chose == 6){
                exit = true;
            }

        } while( !exit );
         
    }
    

    public static int[] array_maker(int array_size) {

        int[] rand_int_array = new int[array_size];

        for (int i = 0; i < array_size; i++) {
            rand_int_array[i] = 0 + (int)(Math.random() * ((100 - 0) + 1));
        }

        return rand_int_array;
    }

    public static void displayMenu(){
        System.out.print("------------------------------- \n");
        System.out.println("------------MENU-------------");
        System.out.print("------------------------------- \n");
        System.out.print("1-Find the minimum value in the array\n");
        System.out.print("2-Find the maximum value in the array\n");
        System.out.print("3-Find the average distance of the array\n");
        System.out.print("4-Find the sum of odd indexes in the array\n");
        System.out.print("5-Find the sum of the even indexes in the array\n");
        System.out.print("6-Exit");
        System.out.print("-------------------------------\n");
    }

    public static int getUserAnswer(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your choice : ");
        int returnValue = in.nextInt();

        return returnValue;
    }

    public static int sumEvens(int[] inputArray){
        int totalSum = 0;
        for(int i = 0; i < inputArray.length; i++){
            if(i%2 == 0){
                totalSum += inputArray[i];
            }
        }
        return totalSum;
    }

    public static int sumOdds(int[] inputArray){
        int totalSum = 0;
        for(int i = 0; i < inputArray.length; i++){
            if(i%2 != 0){
                totalSum += inputArray[i];
            }
        }
        return totalSum;
    }

    public static void findDifferencesFromAverage(int [] array)
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

        System.out.print("{");
        
        for (int i = 0 ; i < array_size ; i++)
        {
            System.out.print(diferences_from_average[i]);
            System.out.print(", ");
        }

        System.out.println("}");


    }


    public static int findMax(int [] array){

        int max = Integer.MIN_VALUE;

        for(int i =0; i<array.length;i++){
            if(array[i]>=max){
                max= array[i];
            }
        }
        return max;
    }

    public static int findMin(int [] array){

        int min = Integer.MAX_VALUE;

        for(int i =0; i<array.length;i++){
            if(array[i]<=min){
                min= array[i];
            }
        }
        return min;
    }


}