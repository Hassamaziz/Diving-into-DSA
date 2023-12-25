#include <iostream>
using namespace std;
int main(){
                                   // AND OR NOT XOR 
    // int a =4;
    // int b = 6;

    //  cout<<" a&b "<< (a&b) << endl;
    //  cout<<" a|b "<< (a|b) << endl;
    //  cout<<" ~a "<< (~a) << endl;
    //  cout<<" a^b "<< (a^b) << endl;

                                    // left shift right shift
    // cout << (16>>1) << endl;
    //  cout << (16>>2) << endl;
    //   cout << (17<<1) << endl;
    //    cout << (17<<2) << endl;
                                    // For Loop 
    // int n ;
    // cout << "enter value: " << endl;
    // cin >> n;
    // cout << "Printing count from 1 to " << n <<endl;
    // for (int i = 1; i <=n; i++)
    
    // {
    // cout << i <<" " ;
    // }

    //      // Loop Sum
    //       int n ;
    //       int sum =0;
    // cout << "enter value: " << endl;
    // cin >> n;
    // cout << "Printing sum from 1 to " << n <<endl;
    // for (int i = 1; i <=n; i++)
    
    // {
    // sum = sum+i;
    // } 
    // cout << sum ;

    //      // Fibonacci series 

    //      int n; 
    //     int a = 0;
    //     int b= 1;
    // cout << "enter value for fibonacci: " << endl;
    // cin >> n;

    // cout << "Printing fibonacci from 0 to " << n <<endl;
    //  cout << a << " " << b << " ";
    // for (int i = 1; i <=n; i++)
    // { 
    //     int fib = a+b;
    //     cout << fib << " ";
    //     a=b;
    //     b=fib;
    // } 

    // Prime number
    int n ;
    cout <<"Enter a number to check ";
    cin >> n;
    bool isPrime = 1;
    for ( int i = 2; i<n; i++)
    {
        if(n % i == 0 ){
        isPrime = 0;
            break;
        }
        else{
            isPrime = 1;
        }
    }
    if (isPrime==1){
        cout<< n << " is a prime number";
    }
    else{
        cout << n << " is not a prime number";
        }

    
    
   
    
    
          

    

}