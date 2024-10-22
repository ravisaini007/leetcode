class Solution {
    public boolean isHappy(int n) {
         if (n == 1 || n == 7)
        return true;

    // Calculate the sum of the squares of the digits
    int sum = squareDigits(n);
    // Loop until we find a known result: 1 (happy) or 4 (unhappy cycle)
    while (sum != 1 && sum != 4)
        sum = squareDigits(sum);

    // Return true if the result is 1 (happy), otherwise false
    return sum == 1;
}

// Helper function to break down the squares of the numbers
private int squareDigits(int n) {
    int sum = 0;
    while (n > 0) {
        int rem = n % 10;
        sum += rem * rem;
        n /= 10;
    }
    
    return sum;
    }
}