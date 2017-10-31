def getPrimeList(minNum, maxNum):
    primes = []
    for i in range(minNum, maxNum):
        notPrime = 1
        for j in range(2, i):
            if( i % j == 0 and j != i ) :
                notPrime = 0
        if notPrime == 1 :
            primes.append(i)
    return primes

def palindrome(allPrimes):
    palindromes = []
    for i in range(0, len(allPrimes)):
        strPrime = str(allPrimes[i])
        revPrime = ''.join(reversed(strPrime))
        if strPrime == revPrime:
            palindromes.append(allPrimes[i])        
    return palindromes
    

minNumber = 2
maxNumber = 10000
pimeList = []
palindromeList = []
primeList = getPrimeList(minNumber, maxNumber)
palindromeList = palindrome(primeList)
print(palindromeList)
