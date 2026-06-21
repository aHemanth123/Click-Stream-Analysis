import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.UUID;

public class ClickstreamDataGenerator {

    public static void main(String[] args) {

        String csvFile = "../data/clickstream_data.csv";

        String[] urls = {
                "/home",
                "/products",
                "/cart",
                "/checkout",
                "/profile"
        };

        String[] errors = {
                "none",
                "none",
                "none",
                "404",
                "500"
        };

        Random random = new Random();

        try (FileWriter writer = new FileWriter(csvFile)) {

            writer.append(
                "user_id,session_id,url_visited,page_load_time_ms,transactions,error_code\n"
            );

            for (int i = 1; i <= 100; i++) {

                String userId =
                        "user_" + (random.nextInt(20) + 1);

                String sessionId =
                        UUID.randomUUID().toString();

                String url =
                        urls[random.nextInt(urls.length)];

                int pageLoadTime =
                        500 + random.nextInt(2500);

                int transaction =
                        random.nextInt(10) == 0 ? 1 : 0;

                String error =
                        errors[random.nextInt(errors.length)];

                writer.append(
                        userId + "," +
                        sessionId + "," +
                        url + "," +
                        pageLoadTime + "," +
                        transaction + "," +
                        error + "\n"
                );
            }

            System.out.println(
                    "100 clickstream records generated!"
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
