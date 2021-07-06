public class Main {
    public static void main(String[] args){
        PageHistory p = new PageHistory();
        p.markVisited("Google.com");
        p.markVisited("facebook.com");
        p.markVisited("linkedin.com");
        p.markVisited("Google.com");

        System.out.println("is facebook.com in pagehistory?");
        System.out.println(p.visited("facebook.com"));

        System.out.println("is upwork.com in pagehistory?");
        System.out.println(p.visited("upwork.com"));

        System.out.println("Contains duplicates?");
        System.out.println(p.wereDuplicatesVisited());

        System.out.println("\n\nVisited urls:");
        for (int i=0;i<p.getHistory().length;i++){
            System.out.println(p.getHistory()[i]);
        }
    }
}
