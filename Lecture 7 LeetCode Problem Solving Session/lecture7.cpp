#include <iostream>
#include <math.h>
using namespace std;

int main(){

                                            // 1st question 
// int x;
// cout << "Enter a number: ";
// cin >> x;


// int ans = 0;
// while (x!=0)
// {
//     int digit = x % 10;
   
//     ans = ans * 10 +digit;
//     x /= 10;
//     if ((ans>INT_MAX/10)||(ans<INT_MIN/10))
//     {
//         return 0;
//     }
 

    
// }
// cout << ans;


        //                                          // 2nd question
        // int n;
        // cin >> n;
        // int m = n;
        // int mask = 0;
        // if (n == 0)
        // {
        //     return 1;
        // }
        // while (m != 0)
        // {
        //     mask = (mask << 1) | 1;
        //     m = m >> 1;
        // }
        // int ans = (~n) & mask;

        // cout<<  ans;
        //                                         // 3rd question
        //    int n;
        //    cin >>n;
        //    for (int i = 0; i <=30; i++)
        //    {
        //     double ans = (pow(2,i));
          

        //     if (ans == n)
        //     {
        //         cout << "Number is a power of 2";
        //     } 
         
        //     }
            
        //     return 0;


          //                                         // 3rd question alternate way
           int n;
           cin >>n;
           int ans = 1;
           for (int i = 0; i <=30; i++)
           {
          
            if (ans == n)
            {
                cout << "Number is a power of 2";
            } 
            if (ans< (INT_MAX/2))
            {
                 ans = ans * 2;
            }
            
                 
            }
            
            return 0;
                                          
            



}