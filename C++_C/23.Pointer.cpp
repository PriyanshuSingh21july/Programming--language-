#include <iostream>
using namespace std;
 
int main()
{
    int a = 10;
    cout << "Address of variable a is " << &a << endl;
    
    cout << "Value of variable a stored at address " << &a << " is " << (*(&a)) << endl;
    return 0;
}
