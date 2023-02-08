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
        System.out.print("3-Find the average of the array\n");
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

public int findMax(int[] toFindMax ){
    int max = Integer.MIN_VALUE;
    
    for(int i=0; i<toFindMax.length;i++){
        if(toFindMax[i]>=max){
            max = toFindMax[i];
        }
    }
    return max;
}

public int findMin(int[] toFindMin){
    int min = Integer.MAX_VALUE;
    
    for (int i =0; i< toFindMin.length;i++){
        if(toFindMin[i]<=min){
            min=toFindMin[i];
        }
    }
    
    return min;
    
}

}