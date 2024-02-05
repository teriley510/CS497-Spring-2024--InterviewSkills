public class Main {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = { 8, 9, 10, 11, 12, 13};

        int median = findMedian(arr1, arr2);
        System.out.println(median);
    }
    
    public static int findMedian(int[] arr1, int[] arr2) {
        int[] smallerArr;
        int[] largerArr;

        if(arr1.length <= arr2.length) {
            smallerArr = arr1;
            largerArr = arr2;
        } else {
            smallerArr = arr2;
            largerArr = arr1;
        }
        int total = arr1.length + arr2.length;
        boolean loopBreak = true;
        int smlHalf = (smallerArr.length + 1) / 2;
        int lrgHalf = ((total + 1) / 2) - smlHalf;
        
        do {
            
            System.out.println(smlHalf);
            System.out.println(lrgHalf);

            boolean smlHalfPartitionGood = false;
            boolean lrgHalfPartitionGood = false;
            
            if (smallerArr[smlHalf - 1] <= largerArr[lrgHalf]) {
                smlHalfPartitionGood = true;
            } 

            if (largerArr[lrgHalf - 1] <= smallerArr[smlHalf]) {
                lrgHalfPartitionGood = true;
            }

            if ((smlHalfPartitionGood && lrgHalfPartitionGood)) { 
                if( total % 2 == 1) {
                    int median = Math.max(smallerArr[smlHalf - 1], largerArr[lrgHalf-1]);
                    return median;
                } else {
                    int maxSml = Math.max(smallerArr[smlHalf - 1], largerArr[lrgHalf-1]);
                    int minLrg = Math.min(smallerArr[smlHalf], largerArr[lrgHalf]);
                    return (maxSml + minLrg) / 2;
                }

            }
            if (smlHalfPartitionGood == false) {
                smlHalf -= 1;
                lrgHalf += 1;
            } 
            if (lrgHalfPartitionGood == false) {
                smlHalf += 1;
                lrgHalf -= 1;
            }
           // edge cases!!!!!!!!!
            if(smlHalf == smallerArr.length) {
                int medianIndex = (((total + 1) / 2) - smallerArr.length) - 1;
                System.out.println(medianIndex);
                if (total%2 == 1) {
                    return largerArr[medianIndex];
                } else {
                    return (largerArr[medianIndex] + largerArr[medianIndex+1]) / 2;
                }
            }
            
        } while(loopBreak);
        return -1;
    }
}
            

            
            

            






            
            
        

            

    

            
            
