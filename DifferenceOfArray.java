import java.util.*;
import java.io.*;
public class DifferenceOfArray {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int[] ar1 = new int[n1];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = s.nextInt();
        }
        int n2 = s.nextInt();
        int[] ar2 = new int[n2];
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = s.nextInt();
        }
        int[] diff = new int[n2];
        int carry = 0;
        int i = ar1.length - 1;
        int j = ar2.length - 1;
        int k = diff.length - 1;
        while (k >= 0) {
            int dig = 0;
            int ar1value = i >= 0 ? ar1[i] : 0;
            if (ar2[j] + carry >= ar1value) {
                dig = ar2[j] + carry - ar1value;
                carry = 0;
            } else {
                dig = ar2[j] + carry + 10 - ar1value;
                carry = -1;
            }
            diff[k] = dig;
            i--;
            j--;
            k--;
        }
        int index = 0;
        while (index < diff.length) {
            if (diff[index] == 0) {
                index++;
            } else {
                break;
            }
        }
        while (index < diff.length) {
            System.out.println(diff[index]);
            index++;
        }
    }

}

