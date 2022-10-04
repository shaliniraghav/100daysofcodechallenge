TOPIC: Loop statements

Problem:
For each integer n in the inclusive interval[a,b] :
If 1<=n<=9 , then print the English representation of it in lowercase. That is "one" for 1 , "two" for 2 , and so on.
Else if n>9 and it is an even number, then print "even".
Else if n>9 and it is an odd number, then print "odd".

SAMPLE INPUT:
  8
  11
SAMPLE OUTPUT:
 eight
 nine
 even
 odd

SOLUTION:
#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    const char*number[10]={"one","two","three","four","five","six",  "seven", "eight","nine"};
    int a,b;
    cin>>a>>b;
    for ( int i=a; i<=b;i++) {
       if(i>=1 && i<=9){
           cout<<number[i-1]<<endl;
       }
       else if (i>9) {
       if(i%2==0){
           cout<<"even"<<endl;
       }
       else {
         cout<<"odd"<<endl;
       }
       }
    }
          return 0;

}
