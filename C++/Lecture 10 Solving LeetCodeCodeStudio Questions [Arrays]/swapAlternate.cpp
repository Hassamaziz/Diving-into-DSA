#include <iostream>
using namespace std;


void printArray(int arr[],int size){
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    
}
void swapAlternate(int arr[],int size){

for (int i = 0; i < size; i+=2){
    if (i+1<size){
        swap(arr[i],arr[i+1]);
    }
    
}
}
int main(){
    int even[6] = {2,4,6,8,10,12};
    
     int odd[5]= {1,3,5,7,9};

swapAlternate(even,6);
cout<<"Even number array after swapping alternate elements : \n";
printArray(even,6);

swapAlternate(odd,5);
cout<<"Odd number array after swapping alternate elements : \n";
printArray(odd,5);




}