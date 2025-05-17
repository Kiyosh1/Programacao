#include <iomanip>
#include <ios>
#include <iostream>
#include <ostream>

int main(int argc, char *argv[]) {
  double A, B, C, tri, cir, trap, quad, retan;

  std::cin >> A;
  std::cin >> B;
  std::cin >> C;

  tri = A * C / 2;
  cir = 3.14159 * (C * C);
  trap = (A + B) * C / 2;
  quad = B * B;
  retan = A * B;

  std::cout << "TRIANGULO: " << std::fixed << std::setprecision(3) << tri
            << std::endl;
  std::cout << "CIRCULO: " << std::fixed << std::setprecision(3) << cir
            << std::endl;
  std::cout << "TRAPEZIO: " << std::fixed << std::setprecision(3) << trap
            << std::endl;
  std::cout << "QUADRADO: " << std::fixed << std::setprecision(3) << quad
            << std::endl;
  std::cout << "RETANGULO: " << std::fixed << std::setprecision(3) << retan
            << std::endl;
  return 0;
}
