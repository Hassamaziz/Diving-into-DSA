#include<iostream>
using namespace std;

bool search(int arr[], int size, int key) {

    for( int i = 0; i<size; i++ ) {

        if( arr[i] == key) {
            return 1;
        }

    }
    return 0;
}


int main() {

    int arr[10] = { 8, -3, 15, 0, 7, -5, 12, 3, 9, -1 };


    cout <<" Enter the element to search for " << endl; 
    int key;
    cin >> key;

    bool isPresent = search(arr, 10, key);

    if( isPresent ) {
        cout <<" Key is present "<< endl;
    }
    else{
        cout <<" Key is absent " << endl;
    }


    return 0;
}