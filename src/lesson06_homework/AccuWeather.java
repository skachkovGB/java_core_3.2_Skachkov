package lesson06_homework;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;


public class AccuWeather {
    private static final OkHttpClient okHttpClient = new OkHttpClient();

    private static final String PROTOCOL = "https";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String API_VERSION  = "v1";
    private static final String FORECAST_TYPE = "daily";
    private static final String FORECAST_PERIOD = "5day";
    //апи преподавателя
    //private static final String API_KEY = "0d1tNZJPfzzT3qGokM18FGGxAUpt7hpj";

    //мой апи
    private static final String API_KEY = "mgPjd6vwVXp3KnfFrsGw0xJ9czVQz36u";

    private static final String SAINT_PETERSBURG_KEY = "";  // не нашел
    private static final String MOSCOW = "294021";
    private static final String LONDON = "328328";
    private static final String NEW_YORK = "349727";



    public void getWeather() throws IOException{

        OkHttpClient client = new OkHttpClient();


        // Сегментированное построение URL
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(BASE_HOST)
                .addPathSegment(FORECASTS)
                .addPathSegment(API_VERSION )
                .addPathSegment(FORECAST_TYPE)
                .addPathSegment(FORECAST_PERIOD)
                .addPathSegment(MOSCOW)
                .addQueryParameter("apikey", API_KEY)
                //.addQueryParameter("language", "ru-ru") // кодировка не настроена, ру не читается
                //.addQueryParameter("metric", "true")
                .build();

        System.out.println(url.toString());

        // При необходимости указать заголовки
        Request request = new Request.Builder()
                //.addHeader("accept", "application/json")
                .url(url)
                .build();

        /*Response oneDayForecastResponse = okHttpClient.newCall(request).execute();
        String weatherResponse = oneDayForecastResponse.body().string();
        System.out.println(weatherResponse);*/

        String jsonResponse = client.newCall(request).execute().body().string();
        System.out.println(jsonResponse);
    }
}





