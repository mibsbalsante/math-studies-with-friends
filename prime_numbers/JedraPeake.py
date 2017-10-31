def getPrimeList(minNum, maxNum):
    for i in range(minNum, maxNum):
        notPrime = 1
        for j in range(2, i):
            if( i % j == 0 and j != i ) :
                notPrime = 0
        if notPrime == 1 :
            print(i, end=" ")

minNumber = 2
maxNumber = 100
getPrimeList(minNumber, maxNumber)