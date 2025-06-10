class Demo {
    public static void main(String args[]) {
        long fibo = 1;
        long a = 1;
        for (int i = 0; i <100; i++) {
            System.out.println("F(" + i + ") = " + fibo);
            long b = a + fibo;
            a = fibo;
            fibo = b;
        }
    }
}