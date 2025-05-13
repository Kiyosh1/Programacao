#include <iomanip>
#include <iostream>

int main(int argc, char *argv[]) {

  double raio, area, pi;

  std::cin >> raio;
  pi = 3.14159;
  area = pi * raio * raio;

  std::cout << "A=" << std::fixed << std::setprecision(4) << area << '\n';
  return 0;
}
