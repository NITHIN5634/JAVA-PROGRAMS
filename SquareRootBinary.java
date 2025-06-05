package javaprograms;
public class SquareRootBinary {
    public static void main(String[] args) {
        int x = 25;
        int sq = squareroot(x);
        System.out.println("The square root of " + x + " is: " + sq);
    }

    public static int squareroot(int x) {
        int start = 0, end = x, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid) {
                ans = mid;       // mid is a possible answer
                start = mid + 1; // move right to find a closer value
            } else {
                end = mid - 1;   // mid*mid > x, move left
            }
        }
        return ans;
    }
}