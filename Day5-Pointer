TOPIC:Pointer
PROBlEM:
The function is declared with a void return type, so there is no value to return,
Modify the values in memory so that a contains their sum and b contains their absoluted difference.
a'=a+b;
b'=|a-b|;

SOLUTION:
#include <stdio.h>
#include<iostream>
#include<cstdlib>
using namespace std;
void update(int *a,int *b) {
   int sum=*a+*b;
    int diff=abs(*b-*a);
    *a=sum;
    *b=diff;
       
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
     cin>>a>>b;
     update(pa,pb);
     cout<<a<<endl<<b;
   
   return 0;
}
