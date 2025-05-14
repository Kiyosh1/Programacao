#include <iostream>
int main(){
    int N;
    std::cin >> N;

    if(N > 2 && N % 2 == 0){
        std::cout << "YES" <<'\n';
    }else{
        std::cout <<"NO" << '\n'; 
    }
    return 0;
}
