class Arrays {
    public static void main(String[] args) {

        int N = 5;
        double[] a = new double[N];
        // randomValues(a);
        // copyToAnotherArray(a, N);
        // average(a);
        // maximum(a, N);

        String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        // int i = (int) (Math.random() * RANKS.length);
        // int j = (int) (Math.random() * SUITS.length);
        // System.out.println(RANKS[i] + " of " + SUITS[j]);

        String[] deck = new String[RANKS.length * SUITS.length];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
                System.out.println(RANKS[i] + " of " + SUITS[j]);
            }
        }

        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            // r = 18
            String temp = deck[r]; // temp = deck[18]
            deck[r] = deck[i]; // deck[18] = deck[0]
            deck[i] = temp; // deck[0] = temp
        }
    };

    static void randomValues(double[] a) {
        // create an array with N random values
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.round(Math.random() * a.length);
        }
        ;
    }

    static void average(double[] a) {
        // compute the average of array values
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        ;
        double average = sum / a.length;
        System.out.println("This is the average value " + average);
    };

    static void copyToAnotherArray(double[] a, int N) {
        double[] b = new double[N];
        for (int i = 0; i < N; i++) {
            b[i] = a[i];
            System.out.println(b[i]);
        }
        ;
    };

    static void maximum(double[] a, int N) {
        double max = a[0];
        for (int i = 1; i < N; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("Maximum is " + max);
    };

}