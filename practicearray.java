public class practicearray {
    public static void main(String[] args) {
        
    

    public static int maxSubArray(int numbers[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            ms=Math.max(cs,ms);
            if(cs<0){
            cs=0;
        }
        }
        if(cs<0){
            cs=0;
        }
        return ms;
        
    }
}
}

