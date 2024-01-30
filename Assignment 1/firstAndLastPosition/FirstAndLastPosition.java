public class FirstAndLastPosition {
        public int[] firstAndLastPosition(int[] nums, int target) {
            int[] result = new int[2];
            result[0] = findFirstIndex(nums, target);
            result[1] = findLastIndex(nums, target);
            return result;
        }
        public int findFirstIndex(int[] nums, int target) {
            int index = -1;

            int startingIndex = 0;
            int endingIndex = nums.length - 1;

            while (startingIndex <= endingIndex) {
                int mid = startingIndex + (endingIndex - startingIndex) / 2;
                if( nums[mid] >= target ) {
                    endingIndex = mid - 1;
                } else {
                    startingIndex = mid + 1;
                }

                if(nums[mid] == target) {
                    index = mid;
                }
            }
            System.out.println(index);
            return index;
        }

        public int findLastIndex(int[] nums, int target) {
            int index = -1;
            int startingIndex = 0;
            int endingIndex = nums.length - 1;

            while (startingIndex <= endingIndex) {
                int mid = startingIndex + ( endingIndex - startingIndex ) / 2;

                if (nums[mid] <= target ) {
                    startingIndex = mid + 1;
                } else {
                    endingIndex = mid - 1;
                }
                if (nums[mid] == target) {
                    index = mid;
                }
            }
            System.out.println(index);
            return index;
        }
    
}
