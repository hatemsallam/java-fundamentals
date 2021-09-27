import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] array = roll(6);
        for(int i=0; i<array.length;i++) {
            System.out.print(array[i]);
        };
        int[] array2 = {1,2,3,4};
        boolean var = containsDuplicates(array2);
        System.out.print(var);

        int[] array3 = {1,2,3,4,5};
        double var2 = average(array3);
        System.out.print(var2);

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] array4 =   lowAvg(weeklyMonthTemperatures);
        System.out.print(Arrays.toString(array4));

    }
    public static int[] roll(int num) {
        Random randomNumber = new Random();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            int rand = randomNumber.nextInt(6 - 1 + 1) + 1;
            array[i] = rand;

        }
        return array;
    }

    public static boolean containsDuplicates(int[] arr) {
        for(int i = 0; i< arr.length; i++) {
            for(int j = i+ 1 ; j <arr.length;j++) {
                if(arr[i] == arr[j]) {
                    return true ;
                }

            }
        }
        return false;
    }

    public static double average(int[] array) {
        int arrayLength = array.length;
        int sum = 0;
        for (int num : array) {
            sum = sum + num;
        }
        return (double) sum / arrayLength;
    }

    public static int[] lowAvg(int [][]arr){
        int index=0;
        int sum;
        double minAvg=0.0;
        double avg;

        for(int i=0; i<arr.length;i++) {
            sum = 0;
            avg=0;
            for(int j = 0; j< arr[i].length; j++) {
                sum+=arr[i][j] ;
            }
            avg = (double) sum/arr[i].length;
            if(minAvg==0.0){
                minAvg=avg;
            } else if (avg<minAvg) {
                index = i;
                minAvg= avg;
                System.out.println("The Min Avarage="+minAvg);
            }
        }

        int[] newArr = new int[arr[index].length];
        for(int i=0 ; i <arr[index].length;i++) {
            newArr[i] = arr[index][i];
        }
        return newArr;



    }

}
