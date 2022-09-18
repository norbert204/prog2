public class sztringek1
{
    // A. donuts
    // Bemenet: egy egész szám (a fánkok száma).
    // Adjunk vissza egy sztringet a köv. formában: 'Fánkok száma: <count>',
    // ahol <count> a bemenetként kapott érték.
    // Viszont ha a fánkok száma 10 vagy több, akkor a tényleges szám helyett
    // a 'sok' szót használjuk.
    // Vagyis donuts(5) visszatérési értéke 'Fánkok száma: 5', míg
    // donuts(23) visszatérési értéke 'Fánkok száma: sok'
    static String donuts(int n)
    {
        return String.format("Fánkok száma: %s", (n < 10) ? n : "sok");
    }

    // B. both_ends
    // Egy adott s sztring esetén adjunk vissza egy olyan sztringet,
    // mely az eredeti sztring első 2 és utolsó 2 karakteréből áll.
    // Vagyis 'spring' esetén a visszatérési érték 'spng'.
    // Ha az input sztring hossza 2-nél rövidebb, akkor egy üres
    // sztringet adjunk vissza.
    static String bothEnds(String s)
    {
        return "";
    }

    // C. fix_start
    // Egy adott s sztring esetén adjunk vissza egy olyan sztringet,
    // melyben az első karakter összes előfordulása helyén egy '*'
    // szerepel, kivéve a legelső pozíciót.
    // Példa: 'babble' => 'ba**le'
    // Feltételezhetjük, hogy a bemeneti sztring hossza legalább 1.
    // Tipp: s.replace(stra, strb) egy olyan sztringet ad vissza,
    // melyben az stra összes előfordulása ki van cserélve strb-re.
    static String fixStart(String s)
    {
        return "";
    }

    // D. mixUp
    // Adott két bemeneti sztring, a és b. Adjunk vissza egyetlen sztringet,
    // melyben a és b konkatenálva van úgy, hogy köztük egyetlen szóköz szerepel.
    // Ezen túl cseréljük fel a két sztring első két karakterét az eredményben.
    // Példa:
    //   'mix', 'pod' -> 'pox mid'
    //   'dog', 'dinner' -> 'dig donner'
    // Feltételezhetjük, hogy a bemeneti sztringek hossza legalább 2.
    static String mixUp(String a, String b)
    {
        return "";
    }

    static void test(String got, String expected)
    {
        String prefix = (got.equals(expected) ? " OK " : "  X ");
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    public static void main(String[] args)
    {
        test(donuts(4), "Fánkok száma: 4");
        test(donuts(9), "Fánkok száma: 9");
        test(donuts(10), "Fánkok száma: sok");
        test(donuts(99), "Fánkok száma: sok");
        System.out.println("#");
        test(bothEnds("spring"), "spng");
        test(bothEnds("Hello"), "Helo");
        test(bothEnds("a"), "");
        test(bothEnds("xyz"), "xyyz");
        System.out.println("#");
        test(fixStart("babble"), "ba**le");
        test(fixStart("aardvark"), "a*rdv*rk");
        test(fixStart("google"), "goo*le");
        test(fixStart("donut"), "donut");
        System.out.println("#");
        test(mixUp("mix", "pod"), "pox mid");
        test(mixUp("dog", "dinner"), "dig donner");
        test(mixUp("gnash", "sport"), "spash gnort");
        test(mixUp("pezzy", "firm"), "fizzy perm");
    }
}
