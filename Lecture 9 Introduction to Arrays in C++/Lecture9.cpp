#include <iostream>
using namespace std;

void printArray(int arr[],int size){
cout << "printing the array"<< endl;
for (int i = 0; i <size; i++)
{
    cout << arr[i] << " ";
}

}
int main(){

    // int arr[3] = {13,54,33};
    
    // printArray(arr,3);

    int secondArr[40] = {1,2,3,4,5,4,3,2,1};
    printArray(secondArr,40);

    
    
   
}