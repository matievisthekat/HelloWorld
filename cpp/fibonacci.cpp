#include <iostream>
#include <vector>

using namespace std;

vector<int> fib(int n)
{
  if (n == 1)
  {
    vector<int> d;
    d.push_back(0);
    d.push_back(1);
    return d;
  }
  else
  {
    vector<int> s = fib(n - 1);
    s.push_back(s[s.size() - 1] + s[s.size() - 2]);
    return s;
  }
}

int main()
{
  int n = 8;
  std::string str = "";

  vector<int> nums = fib(n);

  for (int i = 0; i < nums.size(); i++)
  {
    str += to_string(nums[i]) + " ";
  }

  std::cout << str << "\n";

  return 0;
}
