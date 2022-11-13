public class TestDupla {
    public static void main(String[] args) {
        givenNumber_duplaz_returnsDuplicate();
    }

    public static void givenNumber_duplaz_returnsDuplicate() {
        assert Dupla.duplaz(0) == 0;
        assert Dupla.duplaz(4) == 8;
        assert Dupla.duplaz(-2) == -4;

        System.out.println("OK");
    }
}
