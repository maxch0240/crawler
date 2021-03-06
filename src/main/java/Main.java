import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String seedUrl = "https://en.wikipedia.org/wiki/Elon_Musk";
        //String[] terms = {"Tesla", "Musk", "Gigafactory", "Elon Musk"};
        String[] terms = {"I", "not", "it", "is"};
        int maxDepth = 2, pageLimit = 50;
        int topNReports = 20;

        Crawler crawler = new Crawler(maxDepth, pageLimit, terms, topNReports);
        crawler.crawl(1, seedUrl, new ArrayList<>());

        System.out.println("\nBest matches\n");

        for (String entry : crawler.getBestMatches())
        {
            System.out.println(entry);
        }

        crawler.CSVWriter();
    }
}
