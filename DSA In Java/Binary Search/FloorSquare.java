/*Question 3:Given an integer n, find its floor square root using binary search.
Example:
 n = 17
 Output: 4 (since 4² = 16 ≤ 17 < 25)
Explanation:Apply binary search between 1 and n.
If mid * mid == n, answer found.
If mid * mid < n, move right, but store mid as possible answer.
If mid * mid > n, move left.

 */
public class FloorSquare 
{
    public static int square(int n)
    {
        int left = 1, right = n;
        int idx = -1;
        while (left <= right) 
        {
            int mid = (left + right) / 2;
            if((mid * mid) == n) 
            {
                return mid;
            }
            else if((mid * mid) < n) 
            {
                idx = mid;
                left = mid + 1;
            }
            else 
            {
                right = mid -1;
            }
        }
        return idx;
    }
    public static void main(String[] args) 
    {
        int n = 20;
        System.out.println(square(n));
    }
}
