/*
int arr[] = {1, 2, 3}; //

int arr[3];
arr[0] = 1, arr[1] = 2, arr[2] = 3; //



#include <iostream>
using namespace std;
 
int main()
{
    int arr[] = {1, 2, 3};
    cout << arr[1] << endl; //
}




#include <iostream>
using namespace std;
 
int main()
{
    int arr[] = {1, 2, 3};
    arr[2] = 8; //changing the element on index 2 //
    cout << arr[2] << endl;
}

*/


#include <iostream>
using namespace std;
 
int main()
{
    int arr[] = {1, 2, 3};
   for(int i=0; i<sizeof(arr) / sizeof(int);i++)
   {
   	cout<<arr[i]<<" ";
   }
}








