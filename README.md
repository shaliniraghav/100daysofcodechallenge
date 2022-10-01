#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    const char*number[10]={"one","two","three","four","five","six","seven", "eight","nine"};
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
