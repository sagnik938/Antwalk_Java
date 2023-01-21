public class EnhancedFor {
    
    static int arraySum(int[] arr,int n){
        int sum = 0;
        for( int elem: arr){
            sum += elem;
        }
        return(sum);
    }
    
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,56,67,78,89,90};
        System.out.println("Sum is: " + arraySum(arr,arr.length));   
    }
}
