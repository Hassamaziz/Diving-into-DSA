#include <iostream>
using namespace std;
int power(int a,int b){
    int ans = 1;
    for (int i = 1; i <=b; i++)
    {
           ans = ans * a;
    }
    return ans;
    
}

int power2(){

    cout<<"Enter base number: ";
   int num;
    cin>>num;
    cout<<"\nEnter exponent: ";
   int exp;
    cin>>exp;
    int ans = 1;
    for (int i = 1; i <=exp; i++)
    {
           ans = ans * num;
    }
    return ans;
    
}

int isEven(int a){
  
  if(a&1){
    return 0;
  }
    return 1;
  
}

int factorial(int n){
    
    int fact = 1;
    for (int i = 1; i <=n; i++)
    {
        fact = fact * i;
    }
    return fact;
    
}

int nCr(int n,int r){
    int num = factorial(n);
    int den = factorial(r) * factorial(n - r);
    return num/den;


}

void printCounting(int num) {

    for(int i=1; i<=num; i++) {
        cout<< i << " ";
    }
    cout<<endl;
}

bool isPrime(int n ) {
   for(int i = 2; i < n; i++){
       if(n % i == 0) {
      
          return 0;
        }
   }
   return 1;
}

int AP(int n)
{
  int ap=3*n+7;
  return ap;
}

int setBits(int n){
  //set all the bits in a number to 1 and return the count of set bits.
  int count = 0 ;
  while (n!=0)
  {
    if(n&1){
      count ++;
    }
    n >>= 1;

    
  }
  return count;
  
}

int setBits2(int a)
{
  int count = 0;
  while(a!=0)
  {
    if(a&1)
    {
      count++;
    }
    a=a>>1;
  }
  return count; 
}
int main(){
    // cout<<"Enter the base number: ";
    // int num;
    // cin>>num;
    // cout<<"\nEnter the exponent: ";
    // int exp;
    // cin>>exp;
    // int answer =  power(num,exp);

    // cout << answer;


    // int answer2 = power2();
    // cout << "\n\nThe result is : "<<answer2 ;


             //   Is even Function 

    // int num;
    // cin >> num;
    // if(isEven(num)){
    //     cout << "Your number is even";
    // }
    // else{
    //     cout << "Your number is odd";
    // } 



            //             // Factorial function
            //   int num;
            //   cin >> num;
            //   cout << "Factorial of " << num << " is " << factorial(num) << endl;

    //                             // nCr Function 

    //    int n , r;
    //    cout << "Enter a value for n and r \n";
    //    cin >> n >> r;
    //    cout << n << " C " << r << " = " << nCr(n,r) << endl;

    //                                  // Print Counting

    //    int n ;
    //    cin >> n;
    //    printCounting(n);    

        //                             // Prime or Not

        // int num;
        // cout << "Enter a Number to check whether it's prime or not : ";
        // cin >> num;
        // if (isPrime(num)) {
        //     cout << num << " is a prime number." << endl;
        //     } else {
        //         cout << num << " is not a prime number." << endl;
        //         }

        //                             //  Homework question 1
        // int n;
        // cin >> n;
        //   int ans=AP(n);
        // cout<<"Answer is="<<ans<<endl;

                                      // Homework Question 2

        int a,b;
  cin>>a>>b;
  int ans1=setBits(a);
  int ans2=setBits2(b);
  cout<<"Set bits of A="<<ans1<<endl;
  cout<<"Set bits of B="<<ans2<<endl;
  int ans=ans1+ans2;

  cout<<"Total set bits of A and B are ="<<ans<<endl;

 

}