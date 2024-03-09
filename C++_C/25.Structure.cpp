#include <iostream>
using namespace std;
 
struct employee
{
    /* data */
    int eId;
    char favChar;
    int salary;
};
 
int main()
{
    struct employee Harry;
    Harry.eId = 1;
    Harry.favChar = 'c';
    Harry.salary = 120000000;
    cout << "eID of Harry is " << Harry.eId << endl;
    cout << "favChar of Harry is " << Harry.favChar << endl;
    cout << "salary of Harry is " << Harry.salary << endl;
    return 0;
}

