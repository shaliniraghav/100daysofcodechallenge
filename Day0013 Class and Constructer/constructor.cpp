Topic:-class and constructer
Description:-Design a class named Box whose dimensions are integers and private to the class. The dimensions are labelled: length l , breadth b, and height h .
The default constructor of the class should initialize l ,b ,h and 0 to .
The parameterized constructor Box(int length, int breadth, int height) should initialize Box's l,b and h to length, breadth and height.
The copy constructor Box(Box B ) should set l,b and h to B's l,b,h and , respectively.
Apart from the above, the class should have 4 functions:
int getLength() - Return box's length
int getBreadth() - Return box's breadth
int getHeight() - Return box's height
long long CalculateVolume() - Return the volume of the box

***Constraints***
0<=l,b,h<=10^5;

****Sample Input****
5
2 3 4 5
4
5
4
2 4 6 7
****Sample Output****
3 4 5
60
3 4 5
60
4 6 7

****Code****
#include<bits/stdc++.h>

using namespace std;
class Box{
    public:
        int l,b,h;
        Box(){
            l=b=h=0;
            
        }
        Box(int a,int B,int c){
            l=a;
            b=B;
            h=c;
           
        }
        Box(Box &B){
            b = B.b;
            l = B.l;
            h = B.h;
            
        }
        ~Box(){
            
        }
        int getLength(){
            return l;
        }
        int getBreadth(){
            return b;
        }
        int getHeight(){
            return h;
        }
        long long  CalculateVolume(){
            return ((long long)l)*((long long)b)*((long long)h);
        }
        bool operator < (Box &B){
            if(l < B.l)return true;
            else if(l==B.l){
                if(b < B.b)return true;
                else if(b == B.b){
                    if(h<B.h)return true;
                    return false;
                }
                return false;   
            }
            return false;
        }
       
};
 ostream & operator <<(ostream &dout,Box B){
            dout<<B.l<<" "<<B.b<<" "<<B.h;
            return dout;
        }
  


void check2()
{
	int n;
	cin>>n;
	Box temp;
	for(int i=0;i<n;i++)
	{
		int type;
		cin>>type;
		if(type ==1)
		{
			cout<<temp<<endl;
		}
		if(type == 2)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			temp=NewBox;
			cout<<temp<<endl;
		}
		if(type==3)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			if(NewBox<temp)
			{
				cout<<"Lesser\n";
			}
			else
			{
				cout<<"Greater\n";
			}
		}
		if(type==4)
		{
			cout<<temp.CalculateVolume()<<endl;
		}
		if(type==5)
		{
			Box NewBox(temp);
			cout<<NewBox<<endl;
		}

	}
}

int main()
{
	check2();
}

