import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] capacity = {54,18,91,49,51,45,58,54,47,91,90,20,85,20,90,49,10,84,59,29,40,9,100,1,64,71,30,46,91};
        int[] rocks =    {14,13,16,44,8,20,51,15,46,76,51,20,77,13,14,35,6,34,34,13,3,8,1,1,61,5,2,15,18};
        int[] variance = new int[rocks.length];
        int additionalRocks = 77;
        int increase = 0;
        int count =0;
        int width = 0;
        int minValue =rocks[0];
        int minIndex= 0;
        for(int i =0; i<capacity.length; i++){
            for(int j =0; j<rocks.length; j++){
                if(capacity[i]!=rocks[j] && i==j && capacity[i]>rocks[j]){
                    width = capacity[i] - rocks[j];
                    variance[increase++] = width;
                }
            }
        }
        for(int n=0; n<rocks.length; n++){
            for(int k=0; k<variance.length; k++){
                if(variance[k]!=0 && variance[k]<=minValue){
                    minValue = variance[k];
                    minIndex = k;
                }
            }
            if(additionalRocks>0 && additionalRocks>=minValue){
                additionalRocks = additionalRocks-minValue;
                count++;
            }
            minValue = 100;
            variance[minIndex] = 100;
        }
        for(int m =0; m<variance.length; m++){
            if(variance[m]==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
