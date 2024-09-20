public class EratosthenesPrimeSieve  implements PrimeSieve{

    int max;

    public EratosthenesPrimeSieve(int max) {
        this.max = max;
    }

    @Override
    public boolean isPrime(int p) {
        int squareRootMax= (int) Math.sqrt(max);
        boolean[] gestrichen=new boolean[max];

        for(int i=2;i<max;i++){
            gestrichen[i]=false;
        }
        for(int i=2;i<squareRootMax;i++){
            if(!gestrichen[i]){
                if(i==p){
                    return true;
                }
                for(int j=i*i;j<max;j+=i){
                    gestrichen[j]=true;
                }
            }
        }
        if(!(gestrichen[p])){
            return true;
        }
        return false;
    }

    @Override
    public void printPrimes() {
        for(int i=2; i<max;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }






}
