package Com.Review2nd;

public class ReverseArr {
    public static void main(String[] args) {
        int number [] = {5,6,8,2,9,1,4,8,3};
        System.out.print("the array is : ");
        for (int i=0; i< number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
        System.out.print("the reverse array is : ");
        for (int x= number.length-1; x>=0; x--){
            System.out.print(number[x] + " ");
        }
    }
}
