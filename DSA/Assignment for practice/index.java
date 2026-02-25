// // // #include <iostream>
// // // using namespace std;

// // // int inverseNumber(int n) {
// // //     int position = 1;
// // //     int inverse = 0;

// // //     while (n > 0) {
// // //         int digit = n % 10;   // Extract last digit

// // //         // Calculate 10^(digit - 1) manually
// // //         int multiplier = 1;
// // //         for (int i = 1; i < digit; i++) {
// // //             multiplier *= 10;
// // //         }

// // //         inverse += position * multiplier;

// // //         n /= 10;   // Remove last digit
// // //         position++;
// // //     }

// // //     return inverse;
// // // }

// // // int main() {
// // //     int n;
// // //     cin >> n;

// // //     cout << inverseNumber(n);

// // //     return 0;
// // // // }
// // // #include <iostream>
// // // using namespace std;

// // // int main() {
// // //     int T;
// // //     cin >> T;

// // //     while (T--) {
// // //         long long M, N;
// // //         cin >> M >> N;

// // //         long long turn = 1;

// // //         while (true) {
// // //             // Aayush's turn (odd turn)
// // //             if (turn % 2 == 1) {
// // //                 if (M >= turn) {
// // //                     M -= turn;
// // //                 } else {
// // //                     cout << "Harshit\n";
// // //                     break;
// // //                 }
// // //             }
// // //             // Harshit's turn (even turn)
// // //             else {
// // //                 if (N >= turn) {
// // //                     N -= turn;
// // //                 } else {
// // //                     cout << "Aayush\n";
// // //                     break;
// // //                 }
// // //             }

// // //             turn++;
// // //         }
// // //     }

// // //     return 0;
// // // }
// // // #include <iostream>
// // // #include <cmath>
// // // using namespace std;

// // // // Function to calculate sum of digits
// // // int digitSum(long long n) {
// // //     int sum = 0;
// // //     while (n > 0) {
// // //         sum += n % 10;
// // //         n /= 10;
// // //     }
// // //     return sum;
// // // }

// // // int main() {
// // //     long long N;
// // //     cin >> N;

// // //     long long temp = N;
// // //     int sumDigits = digitSum(N);
// // //     int sumPrimeDigits = 0;
// // //     bool isComposite = false;

// // //     // Prime factorization
// // //     for (long long i = 2; i * i <= temp; i++) {
// // //         while (temp % i == 0) {
// // //             isComposite = true;
// // //             sumPrimeDigits += digitSum(i);
// // //             temp /= i;
// // //         }
// // //     }

// // //     // If remaining number > 1, it is prime
// // //     if (temp > 1) {
// // //         if (temp == N) {   // number itself is prime
// // //             cout << 0;
// // //             return 0;
// // //         }
// // //         sumPrimeDigits += digitSum(temp);
// // //         isComposite = true;
// // //     }

// // //     if (isComposite && sumDigits == sumPrimeDigits)
// // //         cout << 1;
// // //     else
// // //         cout << 0;

// // //     return 0;
// // // }
// // #include <iostream>
// // using namespace std;

// // // Convert from source base to decimal
// // long long toDecimal(long long sn, int sb) {
// //     long long power = 1;
// //     long long decimal = 0;

// //     while (sn > 0) {
// //         int digit = sn % 10;
// //         decimal += digit * power;
// //         power *= sb;
// //         sn /= 10;
// //     }

// //     return decimal;
// // }

// // // Convert from decimal to destination base
// // long long fromDecimal(long long decimal, int db) {
// //     long long power = 1;
// //     long long result = 0;

// //     while (decimal > 0) {
// //         int remainder = decimal % db;
// //         result += remainder * power;
// //         power *= 10;
// //         decimal /= db;
// //     }

// //     return result;
// // }

// // int main() {
// //     int sb, db;
// //     long long sn;

// //     cin >> sb;
// //     cin >> db;
// //     cin >> sn;

// //     long long decimal = toDecimal(sn, sb);
// //     long long answer = fromDecimal(decimal, db);

// //     cout << answer;

// //     return 0;
// // }
// #include <iostream>
// using namespace std;

// // Function to calculate power manually
// int power(int base, int exp) {
//     int result = 1;
//     for (int i = 0; i < exp; i++) {
//         result *= base;
//     }
//     return result;
// }

// // Function to check Armstrong number
// bool isArmstrong(int num) {
//     int temp = num;
//     int digits = 0;

//     // Count digits
//     while (temp > 0) {
//         digits++;
//         temp /= 10;
//     }

//     temp = num;
//     int sum = 0;

//     // Calculate sum of digits^digits
//     while (temp > 0) {
//         int digit = temp % 10;
//         sum += power(digit, digits);
//         temp /= 10;
//     }

//     return sum == num;
// }

// int main() {
//     int N1, N2;
//     cin >> N1 >> N2;

//     for (int i = N1; i <= N2; i++) {
//         if (isArmstrong(i)) {
//             cout << i << endl;
//         }
//     }

//     return 0;
// }
// #include <iostream>
// using namespace std;

// int main() {
//     long long n;
//     cin >> n;

//     long long rev = 0;

//     while (n > 0) {
//         int digit = n % 10;
//         rev = rev * 10 + digit;
//         n /= 10;
//     }

//     cout << rev;
//     return 0;
// }
class index{
    public static void main(String[] args) {
        int[] nums={0,4};
        int k = 5;
        int idx=nums[k];
        int sum=1;
        for(int i=0;i<nums.length;i++){
            sum=sum*nums[i];
            if(i==k){
                nums[i]=nums[i]+1;
            }
        }
    }
}