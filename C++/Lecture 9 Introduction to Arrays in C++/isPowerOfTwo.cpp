#include <iostream>
#include <climits>
using namespace std;

bool IsPower(int num) {
    if (num <= 0) {
        return false;
    }

    
    return (num & (num - 1)) == 0;
}

int main() {
    int size;
    cin >> size;

    int array[100];
    for (int i = 0; i < size; i++) {
        cin >> array[i];
    }

    for (int i = 0; i < size; i++)
    {
       if (IsPower(array[i])) {
            cout << array[i] << " is a power of 2" << endl;
        } else {
            cout << array[i] << " is not a power of 2" << endl;
        }
    }
    

    return 0;
}
