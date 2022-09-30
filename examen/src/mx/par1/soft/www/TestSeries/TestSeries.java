public class TestSeries {

    public static void main(String[] args) {
        Serie s = new Serie();
        int n = s.genNumero(100);

        s.fibo(n);

        int p = s.fiboN(3, 11);

        System.out.println(p);

    }

}
