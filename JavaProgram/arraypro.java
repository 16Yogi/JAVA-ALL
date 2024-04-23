import java.util.*;
public class arraypro {
    public static void main(String[] args){
        // int[] a = {1,2,3,4,5,6};
        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }

        // String[] a = {"fdasd","gsd","werw"};
        // for(int i=0;i<=a.length;i++){
        //     System.out.println(a[i]);
        // }

        int[][] a = {{1,2,3,4,5},{11,22,33,44,55}};
        for(int i = 0;i<=a.length;i++){
            for(int j=0; j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }

    }
}
