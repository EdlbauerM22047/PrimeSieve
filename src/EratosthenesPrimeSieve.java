public class EratosthenesPrimeSieve  {

    int max;

    public EratosthenesPrimeSieve(int max) {
        this.max = max;
    }

   /*  PrimeSieve primeSieve=new PrimeSieve() {
        @Override
        public boolean isPrime(int p) {
           const N = 10000
            var gestrichen: array [2..N] of boolean

            // Initialisierung des Primzahlfeldes
            // Alle Zahlen im Feld sind zu Beginn nicht gestrichen
            for i = 2 to N do
                gestrichen[i] = false
            end

            // Siebe mit allen (Prim-) Zahlen i, wobei i der kleinste Primfaktor einer zusammengesetzten
            // Zahl j = i*k ist. Der kleinste Primfaktor einer zusammengesetzten Zahl j kann nicht größer
            // als die Quadratwurzel von j <= n sein.
            for i = 2 to sqrt(N) do
                if not gestrichen[i] then
            // i ist prim, gib i aus...
            print i;
            print ", ";
            // ...und streiche seine Vielfachen, beginnend mit i*i
            // (denn k*i mit k<i wurde schon als Vielfaches von k gestrichen)
            for j = i*i to N step i do
                gestrichen[j] = true
            end
            end if
            end
            // Gib die Primzahlen größer als Wurzel(n) aus - also die, die noch nicht gestrichen wurden
            for i = sqrt(N)+1 to N do
                if not gestrichen[i] then
            // i ist prim, gib i aus
            print i; ", ";
            end if
            end
        }

        @Override
        public void printPrimes() {

        }
    }*/


}
