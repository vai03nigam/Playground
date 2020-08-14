#include<iostream>
using namespace std;

double power(double b,int a)
{
  int i;
  double pow=1;
  for(i=0;i<a;i++)
  {
   pow=pow*b;	
  }
  return(pow);
}

int main()
{
  int y,n;
  double p,s,j,j1,sq,emi,sum,mi,bank[2];
  cin>>p>>y;
  int i,k,yrs,y1,l=0;
  for(k=0;k<2;k++)
  {
     cin>>n;
     sum=0;
    for(i=0;i<n;i++)
    {
      cin>>yrs;
      cin>>s;
      mi=0;
      j=s/1200;
      j1=1+j;
      y1=yrs*12;
      sq=power(j1,y1);
      emi=p*(j/(1-(1/(sq))));
      mi=emi*y1;
      sum=sum+mi;
    }
    	bank[l++]=sum;
  }
      if(bank[0]<bank[1])
      {
        cout<<"Bank A";
      }
      else
      {
         cout<<"Bank B";
      }
  return 0;
}