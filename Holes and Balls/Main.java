#include<bits/stdc++.h>
using namespace std;

int main()
{
  int i;
  int holes;
  cin>>holes;
  int a[holes];
  for(i=0;i<holes;i++)
  {
    cin>>a[i];
  }
  
  int balls;
  cin>>balls;
  int b[balls];
  for(i=0;i<balls;i++)
  {
     cin>>b[i];
  }
 
 
  // finding arrangement
  int j;
  int c[holes];
  memset(c,0,sizeof(c));

  for(i=0;i<balls;i++)
  {
    int flag=0;
      for(j=holes-1;j>=0;j--)
      {
        if(b[i]<=a[j] && c[j]<=j)
        {
          c[j]++;
          cout<<j+1<<" ";
          break;
        }
        if(j==0)
        {
          flag=1;
        }
      }
    if(flag==1)
    {
      cout<<"0 ";
    }
  }
  
  return 0;
}