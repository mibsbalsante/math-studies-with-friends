long long int factorial_recursion(int n) {
    if (n == 0) {
        return 1;
    }

    else if (n == 1) {
        return 1;
    }

    else if (n == 2) {
        return 2;
    }

    return n * factorial_recursion(n - 1);
}

long long int factorial_iter(int n) {
    long long int ret = 1;
    for (int i = 1; i <= n; i++) {
        ret *= i;
    }

    return ret;
}