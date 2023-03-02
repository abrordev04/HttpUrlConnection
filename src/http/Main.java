package http;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URL baseUrl = new URL("https://nbu.uz/en/exchange-rates/json/");
            HttpURLConnection urlConnection = (HttpURLConnection) baseUrl.openConnection();
            System.out.println("Yuklanmoqda...");

            InputStream inputStream;

            if (urlConnection.getResponseCode() >= 200 && urlConnection.getResponseCode() < 300) {
                System.out.println("Ma'lumotlar muvaffaqqiyatli yuklandi!");
                inputStream = urlConnection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String line;
                StringBuilder builder = new StringBuilder();
                while ((line = bufferedReader.readLine()) != null) {
                    builder.append(line+"\n");
                }
                System.out.println(builder);

            } else {
                System.out.println("Tarmoqqa ulanib bo'lmadi");
                inputStream = urlConnection.getErrorStream();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
