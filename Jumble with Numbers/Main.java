#include<iostream>
using namespace std;

int main()
{
   int t1,t2,m;
  cin>>t1>>t2>>m;
  int i=1,s=0,count=0;
  int flag=0;
  if(t1>0 && t2>0 && m>0)
  {
  while(s<=t2)
  {
    s=i*(i*2-1);
    if(s>=t1 && s<=t2)
    {
      count++;
      if(count==m)
      {
        cout<<s;
        flag=1;
        break;
      }
    }
    i++;
  }
  if(flag==0)
  {
     cout<<"No number is present at this index";
  }
  }
  else
  {
    cout<<"Invalid Input";
  }
  return 0;
}