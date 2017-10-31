#include <iostream>

using namespace std;



int Divisionressuc(int Dividendo, int Divisor,int contd=0){

  while (Dividendo >0){
    Dividendo = Dividendo-Divisor;
   contd++; 

}
 return contd;
}


int main()
{

int x,y,control=0;

while(control==0){

cout<<"Insert the first positive number"<<endl;
cin>>x;
cout<<"Insert the second positive number"<<endl;
cin>>y;

if(x>=0 && y>=0){

control=1;

}
else

cout<<"One of the numbers is not positive"<<endl;

}
cout<<"The division between "<<x<<" and "<<y<<" is: "<<Divisionressuc(x,y);

}


