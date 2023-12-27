#include <iostream>
using namespace std;

void printReverseArray(int arr[],int size){

for (int i = size-1; i >=0; i--)
{
    cout << arr[i] << " ";
}

}
void printArray(int arr[],int size){

for (int i = 0; i <size; i++)
{
    cout << arr[i] << " ";
}

}
int main(){

   int size;
   cin >> size;
   int array[10];
   for (int i=0 ; i<size ; i++ )
   {
    cin >> array[i];
   }
   // Print original array
   cout << "Original Array:" << endl;
   printArray(array,size);

cout << "reverse array : "<< endl;
    
    printReverseArray(array,size);

    
    
   
}