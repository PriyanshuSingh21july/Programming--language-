#include<iostream>
using namespace std;
class rectangle
{
	public:
		int l,b,area;
		void input()
		{
			cout<<"Enter value l";
			cin>>l;
			cout<<"Enter value b";
			cin>>b;
			
		}
		void calulate()
		{
		 area=l*b;
		}
		void show()
		{
			cout<<"Area of rectangle :"<<area;
		}
		
	
 } ;
 
 int main()
 {
 	rectangle rec;
 	rec.input();
 	rec.calulate();
 	rec.show();
 }
