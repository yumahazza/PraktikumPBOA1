public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik(3, 5);
        int Q1, Q2;
        double J1, J2;

        T1.setAbsis(-3);
        T1.setOrdinat(6);
        T1.printTitik();
        T2.printTitik();
        
        Q1 = T1.getKuadran();
        Q2 = T2.getKuadran();
        System.out.println(Q1);
        System.out.println(Q2);

        J1 = T1.getJarakPusat();
        J2 = T2.getJarak(T1);
        System.out.println(J1);
        System.out.println(J2);

        

    }
}
