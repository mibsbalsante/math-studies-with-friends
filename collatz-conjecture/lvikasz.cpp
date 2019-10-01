#include <iostream>
#include <vector>

using namespace std;

vector<long long int> collatz(int p) {
    vector<long long int> ret;
    long long int n = 0;
    if(p == 1){
        ret.push_back(n);
        return ret;
    }

    else{
        while(p != 1){
            if(p % 2 == 1){
                p = 3*p + 1;
            }

            else{
                p = p/2;
            }
            ret.push_back(p);
            n++;
        }
    }

    return ret;
}

int main() {
    int n = 1;
    cout << "Enter n: ";
    cin >> n;
    vector<long long int> c = collatz(n);

    for (int i = 0; i < c.size(); i++) {
        cout << c[i] << endl;
    }
    return 0;
}