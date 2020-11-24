public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String correctUrl = url.replace("bots","odds");
        String correctUrl2 = correctUrl.replace("//","://"); // via simple replacement
        System.out.println(correctUrl2);
    }
}
