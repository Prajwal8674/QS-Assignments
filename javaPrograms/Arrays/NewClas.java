package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class setData{

    public int[] arr = new int[10];

    public void setD(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        giveD();
    }
    public void giveD(){
        getData gt = new getData();
        System.out.println(Arrays.toString(arr));
    }
}
class getData extends setData{

    public void sum(){
        setD();
        //System.out.println(Arrays.toString(arr));
    }
}
public class NewClas{

    public static void main(String[] args) {
//        setData st = new setData();
//        st.setD();
        getData gt = new getData();
        gt.sum();
    }
}
