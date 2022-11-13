public class TestMain {
    
    public static void main(String[] args) {
        givenNumber_duplaz_returnsDuplicate();
    }

    public static void givenNumber_duplaz_returnsDuplicate() {
        assert Main.duplaz(0) == 0;
        assert Main.duplaz(2) == 4;
        assert Main.duplaz(4) == 8;

        System.out.println("OK");
    }
}
