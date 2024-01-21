public class HouseRobber
 {
    public int rob(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) 
            {
                arr[i] = arr[0];
            }
            else if(i==1)
            {
                arr[i]=Math.max(arr[0], arr[1]);
            } 
            else 
            {
                arr[i] = Math.max(arr[i - 1], arr[i] + arr[i - 2]);
            }
        }
        return arr[arr.length - 1];
    }

    public static void main(String[] args)
     {
        HouseRobber houseRobber = new HouseRobber();

        // Example usage:-
        int[] houseValues = {1,2,3,1};
        int maxRobbedAmount = houseRobber.rob(houseValues);

        System.out.println("Maximum amount that can be robbed: " + maxRobbedAmount);
    }
}
