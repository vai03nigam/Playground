#include<iostream>
using namespace std;
int main()
{
   long int n,s=2;
  cin>>n;
  if(n==1 || n==2)
  {
    cout<<"0";
  }
  else if(n==3)
  {
    cout<<"2";
  }
  else if(n>3)
  {
    int i;
    for(i=1;i<n-2;i++)
    {
      s=(s*2 +2)%10000000007;
    }
    cout<<s;
  }
    return(0);
}