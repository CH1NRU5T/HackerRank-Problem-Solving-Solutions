#include <iostream>
using namespace std;
int main()
{
    int n, p;
    cin >> n >> p;

    int pagesDifferenceFront = p;
    int pagesDifferenceBack = n - p;

    int pagesTurnedFront = pagesDifferenceFront / 2;
    int pagesTurnedBack = (p % 2 != 0 && n % 2 == 0) ? pagesDifferenceBack / 2 + 1 : pagesDifferenceBack / 2;

    if (pagesTurnedFront < pagesTurnedBack)
    {
        cout << "Case: " << 1 << endl;
        cout << pagesTurnedFront;
    }
    else if (pagesTurnedFront > pagesTurnedBack)

    {
        cout << "Case: " << 2 << endl;
        cout << pagesTurnedBack;
    }
    else
    {
        cout << "Case: " << 3 << endl;

        cout << pagesTurnedBack;
    }
}