#include <iostream>
#include <string>

class Student {
private:
    int rollNumber;
    std::string name;
    double fee;

public:
    // Parameterized constructor
    Student(int roll, const std::string& studentName, double studentFee) {
        rollNumber = roll;
        name = studentName;
        fee = studentFee;
    }

    // Member function to display student information
    void display() {
        std::cout << "Roll Number: " << rollNumber << "\n";
        std::cout << "Name: " << name << "\n";
        std::cout << "Fee: " << fee << "\n";
    }
};

int main() {
    // Creating an object of the Student class using the parameterized constructor
    Student student1(101, "John Doe", 5000.0);

    // Displaying student information
    student1.display();

    return 0;
}


