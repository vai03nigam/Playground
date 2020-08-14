#include<bits/stdc++.h>
using namespace std;

int main()
{
  int n;
  cin>>n;
  int a[n][n],points[10000];
  points[0]=0;points[1]=0;
  int i,j;
  int count=0,index=2;
  for(i=0;i<(n+1)/2;i++)
  {
    //for rightword
    for(j=i;j<=n-i-1;j++)
    {
      a[i][j]=++count;
      if(count%11==0)
      {
         points[index++]=i;
         points[index++]=j;
      }
    }
    // for downword
   for(j=i+1;j<=n-i-1;j++)
   {
     a[j][n-i-1]=++count;
      if(count%11==0)
      {
         points[index++]=j;
         points[index++]=n-i-1;
      }
   }
   // for leftward
    for(j=n-i-2;j>=i;j--)
    {
       a[n-i-1][j]=++count;
       if(count%11==0)
      {
         points[index++]=n-i-1;
         points[index++]=j;
       }
    }
    // for upward
    for(j=n-i-2;j>i;j--)
    {
      a[j][i]=++count;
       if(count%11==0)
      {
         points[index++]=j;
         points[index++]=i;
       }
     }
    }
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      {
       cout<<a[i][j]<<"\t";
      }
      cout<<endl;
    }
  cout<<"Total Power points : "<<index/2<<endl;
  
  for(i=0;i<index;i=i+2)
  {
   cout<<"("<< points[i] << ", " << points[i+1] <<")";
    cout<<endl;
  }
} 
        
        
        
    