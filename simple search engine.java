import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleSearchEngine {
    private List<String> dataset;

    public SimpleSearchEngine() {
        dataset = new ArrayList<>();
    }

    public void addData(String data) {
        dataset.add(data);
    }

    public List<String> searchData(String query) {
        List<String> results = new ArrayList<>();

        for (String data : dataset) {
            if (data.toLowerCase().contains(query.toLowerCase())) {
                results.add(data);
            }
        }

        return results;
    }

    public static void main(String[] args) {
        SimpleSearchEngine searchEngine = new SimpleSearchEngine();
        searchEngine.addData("Lorem ipsum dolor sit amet");
        searchEngine.addData("consectetur adipiscing elit");
        searchEngine.addData("sed do eiusmod tempor incididunt");
        searchEngine.addData("ut labore et dolore magna aliqua");
        searchEngine.addData("Ut enim ad minim veniam");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Search Engine");
        System.out.println("Enter your search query: ");
        String query = scanner.nextLine();

        List<String> results = searchEngine.searchData(query);
        if (results.isEmpty()) {
            System.out.println("No results found.");
        } else {
            System.out.println("Search results:");
            for (String result : results) {
                System.out.println(result);
            }
        }
    }
}
