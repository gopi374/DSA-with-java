#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;

    for(int row = 1; row <= N; row++) {
        // Left numbers
        for(int col = 1; col <= row; col++) {
            cout << col;
            if(col != row) cout << "\t";
        }

        // Middle spaces
        for(int space = 1; space <= 2 * (N - row) - 1; space++) {
            cout << "\t";
        }

        // Right numbers (start from row-1 to avoid repeating center)
        for(int col = row - 1; col >= 1; col--) {
            cout << "\t" << col;
        }

        cout << endl;
    }

    return 0;
}
