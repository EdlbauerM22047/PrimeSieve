public class naturalNumberCalculator {

    int obergrenze;

    public void AlgorithmusfürSummeAusPrimzahlen(){

    EratosthenesPrimeSieve primeSieve=new EratosthenesPrimeSieve(obergrenze);
        for(int i=4;i<obergrenze;i+=2){
            for(int n=2;n<i/2;n++){
                    if(primeSieve.isPrime(n)){
                        if(primeSieve.isPrime(i-n)){
                           
                        }
                    }
            }
        }


    }

    public naturalNumberCalculator(int obergrenze) {
        this.obergrenze = obergrenze;
    }
}
