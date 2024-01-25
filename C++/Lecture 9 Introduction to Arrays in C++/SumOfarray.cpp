#include <iostream>
using namespace std;

int sumArr(int arr[],int n){
    int s=0;
    for (int i = 0; i <n ;i++) {
        s+=arr[i];

    }
    return s;

}
int main() {

int size;
cin >> size;
int array[1000];
for (int i = 0; i < size; ++i)
{
    cin >> array[i];
    }
    cout << "Sum of the array is: "<<sumArr(array,size);

}