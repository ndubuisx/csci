/*
* Emmanuel Ndubuisi
* CSCI 306 - Fibonacci
* February 20, 2020
*/

#include <iostream>
using namespace std;

int main() {
  int first = 0;
  int second = 1;
  int next = 0;

  for (int i=1; i<=7; ++i)
  {
    if (i == 1)
    {
      cout << first << "\n ";
      continue;
    }

    if (i == 2)
    {
      cout << second << "\n";
      continue;
    }

    next = first + second;
    first = second;
    second = next; 

    cout << next << "\n";

  }

  return 0;
}
