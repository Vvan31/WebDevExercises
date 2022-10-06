function countPrimes(n){
    let count = 0;
    if (n >= 2){
        for (let i = 2; i < n; i++) {
            if(isPrime(i)){ count++;}
        }
    }
    return count;
}

    function isPrime(n){
        for (let i = 2; i < n; i++) {
            if(n % i === 0) return false; 
        }
          return true; 
    }

countPrimes(100);