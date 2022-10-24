class Main {
    public static void main(String[] args) {
        Game g1 = new Game("Subnautica", "84%", "43 hours");
        Game g2 = new Game("Danganronpa 1", "82%", "28.5 hours");
        Game g3 = new Game("Immortals Fenyx Rising", "77%", "41.5 hours");
    
        System.out.println(g1);
        System.out.println(g1.getTitle());
        System.out.println(g1.getScore());
        System.out.println(g1.getTime());
        System.out.println(g1.isBetterThan(g2));
        System.out.println(g3.isBetterThan(g2));
        System.out.println(g3.isLongerThan(g2));

        Playlist winter = new Playlist();
        winter.add(g1);
        winter.add(g2);
        winter.add(g3);
        System.out.println(winter.getBestGame());
        System.out.println(winter.getLongestGame());
        System.out.println(winter.getShortestGame());
    }
}