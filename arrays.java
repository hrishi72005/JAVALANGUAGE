import java.util.*;
public class arrays{
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
            for(int i=0;i<numbers.length;i++){
                if(largest<numbers[i]){
                    largest=numbers[i];
                }
            }

            return largest;
        }

    
    
    public static void main(String args[]){
        int numbers[]={1,2,4,10,12,18};
        int largest=getlargest(numbers);
        System.out.println("largest value is:"+largest);
    }
}
    
