#include<iostream>
using namespace std;
int main(){
	int num1,num2,op;
  	cout<<"Enter first number : ";
    cin>>num1;
  	cout<<"Enter second number : ";
  	cin>>num2;
  	cout<<"Menu\n"
    "1.Addition\n"
    "2.Subtraction\n"
    "3.Multiplication\n"
    "4.Division\n"
    "5.Remainder\n";
    cin>>op;
  	switch(op){
      case 1:
        cout<<num1+num2;
        break;
      case 2:
        cout<<num1-num2;
        break;
      case 3:
        cout<<num1*num2;
        break;
      case 4:
        cout<<num1/num2;
        break;
      case 5:
        cout<<num1%num2;
        break;
      default :
        cout<<"Invalid operation";
        break;
    }
  	
  	
}