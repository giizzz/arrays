import java.util.Scanner;
public class diziler1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array= new int[10];
        for(int i=0;i< array.length;i++){
            System.out.print("Dizinin "+(i+1)+". elemanini giriniz:");
            array[i]= input.nextInt();
        }
        topla(array);
    }

    public static void topla(int[] arr){
        int toplam=0;
        for(int i=0;i<arr.length;i++){
            toplam+=arr[i];
        }
        System.out.println(toplam);
    }
}
