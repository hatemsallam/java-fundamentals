import java.util.*;
public class Main {
    public static void main(String[] args) {
//        int[] array = roll(6);
//        for(int i=0; i<array.length;i++) {
//            System.out.print(array[i]);
//        };
//        int[] array2 = {1,2,3,4};
//        boolean var = containsDuplicates(array2);
//        System.out.print(var);
//
//        int[] array3 = {1,2,3,4,5};
//        double var2 = average(array3);
//        System.out.print(var2);

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
//        int[] array4 =   lowAvg(weeklyMonthTemperatures);
//        System.out.print(Arrays.toString(array4));

        String result = maps(weeklyMonthTemperatures);
        System.out.println(result);


        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");

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
    public static String maps(int [][]arr){

        int high=0 ;
        int min=0;
        Set <Integer> set=new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                set.add(arr[i][j]);
            }
        }
        for (Integer i : set) {
            if (high==0 && min==0){
                high=i;
                min=i;
            }else if(i>high){
                high=i;
            }else if (i<min){
                min =i;
            }
        }
        System.out.println("high: " + high);
        System.out.println("min: "+ min);
        for (int i = min+1; i < high; i++) {
            if (!set.contains(i)){
                System.out.println("Never saw temperature: " +i);
            }
        }
        return "high:"+String.valueOf(high) + " min: "+ String.valueOf(min);
    }

    public static String tally(List<String> arr){
        int count=1;
        String highVoteName="";
        Map<String,Integer> vot=new HashMap<String,Integer>();
        for (String name : arr) {
            if (!vot.keySet().contains(name)){
                vot.put(name,1);
            }else {

                count =  (int)vot.get(name);
                count++;
                vot.put(name,count);

            }
        }
        count=0;

        for (String s:vot.keySet())
        {
            if (vot.get(s) > count){
                count=vot.get(s);
                highVoteName=s;
            }

        }

        return highVoteName;
    }

}



