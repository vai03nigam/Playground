#include<bits/stdc++.h>
using namespace std;

int main()
{
  int t;
  cin>>t;
  while(t--)
  {
   int n,i,temp;
    cin>>n;
    priority_queue<int ,vector<int> ,greater<int> > candies;
    
    for(i=0;i<n;i++)
    {
      cin>>temp;
      candies.push(temp);
    }
    int total=0;
    while(candies.size()>1)
    {
      int t1=candies.top();
      candies.pop();
      int t2=candies.top();
      candies.pop();
       total=total+(t1+t2);
       candies.push(t1+t2);
    }
      cout<<total;
  }
  }