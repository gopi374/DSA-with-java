// #include<iostream>
// using namespace std;

// int main(){
//     int n;
//     cin>>n;
//     int mid =n/2;
//     for(int row=0;row<mid;row++){
//         for(int col=0;col<mid-row;col++){
//             cout<<" * ";
//         }
//         for(int col=0;col<2*row+1;col++){
//             cout<<"   ";
//         }
//         for(int col=0;col<mid-row;col++){
//             cout<<" * ";
//         }
//         cout<<endl; 
//     }
//     cout<<endl;
//     for(int row=mid-1;row>=0;row--){
//         for(int col=0;col<mid-row;col++){
//             cout<<" * ";
//         }
//         for(int col=0;col<2*row+1;col++){
//             cout<<"   ";
//         }
//         for(int col=0;col<mid-row;col++){
//             cout<<" * ";
//         }
//         cout<<endl; 
//     }
//     return 0;
// // }
// #include <iostream>
// #include <string>
// using namespace std;

// int main() {
//     int n;
//     cin >> n;

//     // Upper half (including middle line)
//     for(int i = 0; i < n; i++) {
//         // Left stars
//         for(int j = 0; j < n - i; j++) {
//             cout << "*";
//         }

//         // Middle spaces
//         for(int j = 0; j < 2 * i - 1; j++) {
//             cout << " ";
//         }

//         // Right stars
//         if(i == 0) {
//             // First row → one less star on right to avoid double center
//             for(int j = 0; j < n - i - 1; j++) {
//                 cout << "*";
//             }
//         } else {
//             for(int j = 0; j < n - i; j++) {
//                 cout << "*";
//             }
//         }

//         cout << endl;
//     }

//     // Lower half (mirror, excluding the already printed middle row)
//     for(int i = n-2; i >= 0; i--) {
//         // Left stars
//         for(int j = 0; j < n - i; j++) {
//             cout << "*";
//         }

//         // Middle spaces
//         for(int j = 0; j < 2 * i - 1; j++) {
//             cout << " ";
//         }

//         // Right stars
//         if(i == 0) {
//             for(int j = 0; j < n - i - 1; j++) {
//                 cout << "*";
//             }
//         } else {
//             for(int j = 0; j < n - i; j++) {
//                 cout << "*";
//             }
//         }

//         cout << endl;
//     }

//     return 0;
// // }
// #include <iostream>
// using namespace std;

// int main() {
//     int n;
//     cin >> n;

//     for(int row = 1; row <= n; row++) {
//         // Left numbers
//         for(int col = 1; col <= row; col++) {
//             cout << col << " ";
//         }

//         // Spaces
//         for(int col = 1; col <= 2 * (n - row); col++) {
//             cout << "  ";
//         }

//         // Right numbers
//         for(int col = row-1; col >= 1; col--) {
//             cout << col << " ";
//         }

//         cout << endl;
//     }
//     return 0;
// }


// #include <iostream>
// using namespace std;

// int main() {
//     int N;
//     cin >> N;

//     for(int row = 1; row <= N; row++) {
//         // Left numbers
//         for(int col = 1; col <= row; col++) {
//             cout << col << " ";
//         }

//         // Spaces
//         for(int col = 1; col <= 2 * (N - row); col++) {
//             cout << "  ";
//         }

//         // Right numbers
//         for(int col = row-1; col >= 1; col--) {
//             cout << col << " ";
//         }

//         cout << endl;
//     }

//     return 0;
// }
// #include <iostream>
// using namespace std;

// int main() {
//     int N;
//     cin >> N;

//     // Top half including middle row
//     for (int row = 1; row <= N; row++) {
//         // Leading tabs
//         for (int t = 1; t <= N - row; t++) {
//             cout << "\t";
//         }

//         // Increasing numbers
//         int num = row;
//         for (int col = 1; col <= row; col++) {
//             cout << num << "\t";
//             num++;
//         }

//         // Decreasing numbers
//         num -= 2; // Start decreasing from last-1
//         for (int col = 1; col < row; col++) {
//             cout << num << "\t";
//             num--;
//         }

//         cout << endl;
//     }

//     // Bottom half
//     for (int row = N - 1; row >= 1; row--) {
//         // Leading tabs
//         for (int t = 1; t <= N - row; t++) {
//             cout << "\t";
//         }

//         // Increasing numbers
//         int num = row;
//         for (int col = 1; col <= row; col++) {
//             cout << num << "\t";
//             num++;
//         }

//         // Decreasing numbers
//         num -= 2;
//         for (int col = 1; col < row; col++) {
//             cout << num << "\t";
//             num--;
//         }

//         cout << endl;
//     }

//     return 0;
// // }
// #include <iostream>
// using namespace std;

// int main() {
//     int N;
//     cin >> N;

//     for(int row = 1; row <= N; row++) {
//         // Print leading spaces
//         for(int space = 1; space <= N - row; space++) {
//             cout << " ";
//         }

//         // Print stars and hollow spaces
//         for(int col = 1; col <= N; col++) {
//             if(row == 1 || row == N) {
//                 // First and last row: all stars
//                 cout << "*";
//             } else {
//                 // Middle rows: star at first and last column
//                 if(col == 1 || col == N)
//                     cout << "*";
//                 else
//                     cout << " ";
//             }
//         }

//         cout << endl;
//     }

//     return 0;
// }
#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;

    for(int row = 1; row <= N; row++) {
        // Left numbers
        for(int col = 1; col <= row; col++) {
            cout << col;
            if(col != row) cout << " ";
        }

        // Middle spaces
        for(int space = 1; space <= (N - row) * 4; space++) {
            cout << " ";
        }

        // Right numbers
        for(int col = row; col >= 1; col--) {
            cout << col;
            if(col != 1) cout << " ";

        }

        cout << endl;
    }

    return 0;
}
