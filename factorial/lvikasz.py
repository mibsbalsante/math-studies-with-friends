def factorial(n):
    if n == 0:
        return 1

    elif n == 1:
        return 1

    elif n == 2:
        return 2

    return n * factorial(n - 1)