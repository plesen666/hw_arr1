import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" Упражнение 1");

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] doubleArr = {1.57, 7.654, 9.986};


        int[] arr2 = new int[3];
        arr2[0] = 5;
        arr2[1] = 6;
        arr2[2] = 7;


        double[] doubleArr2 = new double[4];
        doubleArr2[0] = 1.1;
        doubleArr2[1] = 2.2;
        doubleArr2[2] = 3.3;
        doubleArr2[3] = 4.4;


        System.out.println(" Упражнение 2");

        System.out.print(arr[0] + ", ");
        System.out.print(arr[1]+ ", ");
        System.out.println(arr[2]);
        System.out.print(doubleArr[0]+ ", ");
        System.out.print(doubleArr[1]+ ", ");
        System.out.println(doubleArr[2]);

        System.out.print(arr2[0] + ", ");
        System.out.print(arr2[1] + ", ");
        System.out.println(arr2[2]);
        System.out.print(doubleArr2[0] + ", ");
        System.out.print(doubleArr2[1]+ ", ");
        System.out.print(doubleArr2[2] + ", ");
        System.out.println(doubleArr2[3]);

        System.out.println(" Упражнение 3");


        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i > 0) {
                System.out.print(", ");

            }


        }
        System.out.println();
        for (int a = doubleArr.length - 1; a >= 0; a--) {
            System.out.print(doubleArr[a]);
            if (a > 0) {
                System.out.print(", ");

            }

        }
        System.out.println();
        System.out.println(" Упражнение 4");
        for( int b =arr.length-1;b>0;b--)
        { if(arr[b]%2!=0) {
            arr[b] += 1;
        }

            System.out.print(arr[b] + " , ");
        }

    }
}