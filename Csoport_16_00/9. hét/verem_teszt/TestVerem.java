import java.util.List;

public class TestVerem {
    public static void main(String[] args) {
        givenNumber_append_storesNumber();
        givenVerem_size_returnsCountOfItems();
        givenVerem_isEmpty_returnsIfVeremIsEmpty();
    }

    public static void givenNumber_append_storesNumber() {
        // Arrange
        Verem verem = new Verem();

        // Act
        verem.append(10);

        // Assertion
        assert verem.size() == 1;
        assert verem.isEmpty() == false;
        assert verem.pop() == 10;

        System.out.println("OK");
    }

    public static void givenVerem_size_returnsCountOfItems() {
        // Arrange
        Verem verem = new Verem(List.of(1, 2));

        // Act + Assertion
        assert verem.size() == 2;

        System.out.println("OK");
    }

    public static void givenVerem_isEmpty_returnsIfVeremIsEmpty() {
        // Arrange
        Verem verem = new Verem();

        // Act + Assertion
        assert verem.isEmpty() == true;

        verem.append(0);

        assert verem.isEmpty() == false;

        System.out.println("OK");
    }
}
