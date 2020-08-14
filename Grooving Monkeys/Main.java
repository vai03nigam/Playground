#include<iostream>
using namespace std;

int main()
{
  int t;
  cin>>t;
  while(t--)
  {
    int n,i;
    cin>>n;
    char alpha[n],a1[n],a2[n];
    char ch='a';
    int a[n];
    for(i=0;i<n;i++)
    {
      cin>>a[i];
       alpha[i]=ch++;
      a1[i]=alpha[i];
    }
    int count1=0,time=1;
    while(1)
    {
      int i;
       count1=0;
      for(i=0;i<n;i++)
      {
        a2[a[i]-1]=a1[i];
      }
      for(i=0;i<n;i++)
      {
       if(a2[i]==alpha[i])
       {
         count1++;
       }
      }
        if(count1==n)
        {
          break;
        }
       else
       {
         for(i=0;i<n;i++)
         {
           a1[i]=a2[i];
         }
       }
        time++;
      }
     cout<<time<<endl; 
  }
  return 0;
}