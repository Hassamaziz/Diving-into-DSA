#include <iostream>
using namespace std;

int main(){
//                                             // Pattern 3               
//         int n ; 
//     cin >> n ;
//     int i = 1;

//     while(i<=n){
// int j= 1;
// while (j<=n)
// {
//    cout << j;
//    j++;

// }
// cout << endl;
// i++;

//     }
//                                             // Pattern 4               
//         int n ; 
//     cin >> n ;
//     int i = 1;

//     while(i<=n){
// int j= 1;
// while (j<=n)
// {
//    cout << n-j+1;
//    j++;

// }
// cout << endl;
// i++;

//     }

//                                       // An Alternative Method For Pattern 4 
//         int n ; 
//     cin >> n ;
//     int i = 1;

//     while(i<=n){
// int j= n;
// while (j<=n && j!=0)
// {
//    cout << j;
//    j--;

// }
// cout << endl;
// i++;

//     }

//                                             // Pattern 5              
//         int n ; 
//     cin >> n ;
//     int i = 1;
//     int count = 1;

//     while(i<=n){
// int j= 1;
// while (j<=n)
// {
//    cout << count << "" ;
//    count++;
//    j++;

// }
// cout << endl;
// i++;

//     }

//                                       // Pattern 6               
//         int n ; 
//     cin >> n ;
//     int i = 1;

//     while(i<=n){
// int j= 1;
// while (j<=i)
// {
//    cout << "*";
//    j++;

// }
// cout << endl;
// i++;

//     }

//                                       // Pattern 7               
//         int n ; 
//     cin >> n ;
//     int i = 1;

//     while(i<=n){
// int j= 1;
// while (j<=i)
// {
//    cout << i;
//    j++;

// }
// cout << endl;
// i++;

//     }


//                                       // Pattern 8               
//         int n ; 
//     cin >> n ;
//     int i = 1;
//     int count = 1;

//     while(i<=n){
// int j= 1;
// while (j<=i)
// {
//    cout << count << " ";
//    count++;
//    j++;

// }
// cout << endl;
// i++;

//     }

//                                       // Pattern 9               
//         int n ; 
//     cin >> n ;
//     int row = 1;
   

//     while(row<=n){
// int col = 1;
// int value = row;
// while (col<=row)
// {
//    cout << value << " ";
//   value++;
//    col++;

// }
// cout << endl;
// row++;

//     }

//                                       // Pattern 9 Alternate Way             
//         int n ; 
//     cin >> n ;
//     int row = 1;
   

//     while(row<=n){
// int col = row;

// while (col< row * 2 )
// {
//    cout << col << " ";
  
//    col++;

// }
// cout << endl;
// row++;

//     }

//                                       // Pattern 10            
//         int n ; 
//     cin >> n ;
//     int i = 1;
   

//     while(i<=n){
// int j = 1;

// while (j<=i)
// {
//    cout << i-j+1 << " ";
  
//    j++;

// }
// cout << endl;
// i++;
//     }

//                                     // pattern 11

           
//         int n ; 
//     cin >> n ;
//     int row = 1;
   

//     while(row<=n){
// int col = 1;
// char ch = 'A' + row - 1;

// while (col<= n )
// {
//    cout << ch << " " ;
  
//    col++;

// }
// cout << endl;
// row++;

//     } 

 //                                       // Pattern 12           

//         int n ; 
//     cin >> n ;
//     int row = 1;
   

//     while(row<=n){
// int col = 1;
// char ch = 'A' + col - 1;

// while (col<= n )
// {
//    cout << ch << " " ;
//   ch++;
//    col++;

// }
// cout << endl;
// row++;

//     } 

//                                       // Pattern 13          

//         int n ; 
//     cin >> n ;
//     int row = 1;
   

//     while(row<=n){
// int col = 1;
// char ch = 'A' + col + row - 2;

// while (col<= n )
// {
//    cout << ch << " " ;
//   ch++;
//    col++;

// }
// cout << endl;
// row++;

//     } 


//                                       // Pattern 14        

//         int n ; 
//     cin >> n ;
//     int row = 1;
//    char ch = 'A';

//     while(row<=n){
// int col = 1 ;

// while (col<= n )
// {
//    cout << ch << " " ;
//   ch = ch+1;
//    col++;

// }
// cout << endl;
// row++;

//     } 

//                                       // Pattern 15          

//         int n ; 
//     cin >> n ;
//     int row = 1;
//     char value = 'A';
   

//     while(row<=n){
// int col = 1;


// while (col<= row ){
//    cout << value << " " ;
//   value++;
//    col++;

// }
// cout << endl;
// row++;

//     } 

//                                       // Pattern 16         

//         int n ; 
//     cin >> n ;
//     int row = 1;
    
   

//     while(row<=n){
// int col = 1;
// char ch = 'A' +row -1;

// while (col<= row ){
//    cout << ch << " " ;
//   ch = ch+1;
//    col++;

// }
// cout << endl;
// row++;

//     } 

//                                       // Pattern 17        

//         int n ; 
//     cin >> n ;
//     int row = 1;
    
   

//     while(row<=n){
// int col = 1;
// char ch = 'A' + n - row;

// while (col<= row ){
//    cout << ch << " " ;
//   ch = ch+1;
//    col++;

// }
// cout << endl;
// row++;

//     } 

//                                       // Pattern 18        

//         int n ; 
//     cin >> n ;
//     int row = 1;
       
   

//     while(row<=n){
//   int space = n-row;
//   while (space)
//   {
//     cout << " ";
//     space--;
//   }
//   int col = 1;
//   while (col<=row)
//   {
//    cout << "*";
//    col++;
//   }

//   cout << endl;
//   row++ ;
  

//     } 


//                                       // Pattern 19 home work

//         int n ; 
//     cin >> n ;
//     int row = 1;
   
       
//     while(row<=n){
//   int col = 1;
//   while (col<=n-row+1)
//   {
//    cout << "*";
//    col++;
//   }

//   cout << endl;
//   row++ ;
//     } 


//                                       // Pattern 20        

//         int n ; 
//     cin >> n ;
//     int row = 1;
//     while(row<=n){

//   int col=1;
//     int space = row-1;
//   while (space)
//   {
//     cout << " ";
//     space--;
//   }
//   while (col<=n-row+1)
//   {
//    cout << "*";
//    col++;
//   }
//   cout << endl;
//   row++ ;
//     } 

//                                       // Pattern 21       

//         int n ; 
//     cin >> n ;
//     int row = 1;
     
//     while(row<=n){

//   int col=1;
//     int space = row-1;
//   while (space)
//   {
//     cout << " ";
//     space--;
//   }
//   while (col<=n-row+1)
//   {
//    cout << row ;
   
//    col++;
//   }
//   cout << endl;
//   row++ ;
//     } 

//                                       // Pattern 22       

//         int n ; 
//     cin >> n ;
//     int row = 1;
     
//     while(row<=n){

//   int col=1;
//     int space = n-row;
//   while (space)
//   {
//     cout << " ";
//     space--;
//   }
//   while (col<=row)
//   {
//    cout << row ;
   
//    col++;
//   }
//   cout << endl;
//   row++ ;
//     } 

//                                       // Pattern 23       

//          int n ; 
//     cin >> n ;
//     int row = 1;
//     int count = 1;
     
//     while(row<=n){

//   int col=1;
//     int space = n-row;
//   while (space)
//   {
//     cout << " ";
//     space--;
//   }
//   while (col<=row)
//   {
//    cout << count ;
//    count++;
//    col++;
//   }
//   cout << endl;
//   row++ ;
//     }

//                                          Pattern 24

         int n ; 
    cin >> n ;
    int i = 1;
    while(i<=n){
  int j=1;
    int space = n-i;
  while (space)
  {
    cout << " ";
    space--;
  }
  while (j<=i)
  {
    cout << j;
    j++;
  }
int start = i-1;
while (start)
{
    cout << start ;
    start--;
}
  cout << endl;
  i++ ;
    }
                   //                 // Pattern 25 Tagda Homework 

  //         int n ; 
  //   cin >> n ;
  //   int i = 1;
  //   while(i<=n){
  // int j=1;
  // while (j<=n-i+1)
  // {
  //   cout << j;
  //   j++;
  // }
  //    int space = i-1;
  // while (space)
  // {
  //   cout << "*";
  //   space--;
  // }
  //   j=n-i+1;
  // while (j >=1)
  // {
  //   cout << j;
  //   j--;
  // }
  // cout << endl;
  // i++ ;
  //   }
}
