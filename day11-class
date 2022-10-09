TOPIC:Class

PROBLEM:
Input will consist of four lines.
The first line will contain an integer, representing the age. The second line will contain a string, consisting of lower-case Latin characters ('a'-'z'), representing the first_name of a student.
The third line will contain another string, consisting of lower-case Latin characters ('a'-'z'), representing the last_name of a student.
The fourth line will contain an integer, representing the standard of student.
Note: The number of characters in first_name and last_name will not exceed 50. use your class members to set and then get the elements of the Student class

***Sample Input***

15
john
carmack
10

***Sample Output***

15
carmack, john
10

15,john,carmack,10
 
SOLUTION:
#include <iostream>
#include <sstream>
using namespace std;
 class Student{ 
     public:
       int age;
      string fname;
      string lname;
      int standard;
      
    void set_data(int a, string First_name, string Last_name,int std){
          age=a;
          fname= First_name;
          lname =Last_name;
          standard= std;
        }
      void show_data(){
        cout<<age<<endl;
        cout<<lname<<", "<<fname<<endl;
        cout<<standard<<endl;
        cout<<endl;
        cout<<age<<","<<fname<<","<<lname<<","<<standard;  
      }  
 };
int main() {
    Student  st;
    int a;
    string fname;
    string lname;
    int standard;
    cin>> a >> fname >> lname >> standard;
    st.set_data(a,fname,lname,standard);
    st.show_data();
     
    return 0;
}

