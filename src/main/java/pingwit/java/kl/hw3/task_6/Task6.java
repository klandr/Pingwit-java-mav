package hw3.task_6;

import java.util.Arrays;

//+ Код не отформатирован
public class Task6 {
    public static void main(String[] args) {

        int summEven = 0;

        int[] array = {2,4,9,3,8,1,6,10};
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                summEven = summEven + 1;
            }
        }
        System.out.println("in given massive of "+array.length+" numbers");
        System.out.println("is " + summEven + " even");

        int a = 0; //используем более понятыне имена переменных, например, evenIndex
        int[] evenArray = new int[summEven];

        for (int q = 0; q < array.length; q++){ //можно использовать ту же i
            if (array[q] % 2 == 0) {
                evenArray[a] = array[q];
                a = a +1;
                }
        }
        System.out.println("new massive is " + Arrays.toString(evenArray));
    }
}
