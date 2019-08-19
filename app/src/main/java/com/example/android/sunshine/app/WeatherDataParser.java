package com.example.android.sunshine.app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class WeatherDataParser {


    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
//        JSONObject json =  new JSONObject(weatherJsonStr);
//        JSONObject jsonDay = (JSONObject) json.getJSONArray("list").get(dayIndex);
//        System.out.println(jsonDay.getJSONObject("main"));


                JSONObject json =  new JSONObject(weatherJsonStr);
                JSONObject jsonDay = (JSONObject) json.getJSONArray("list").get(dayIndex);
                if(jsonDay == null){
                    return -1;
                }
                JSONObject jsontemp = jsonDay.getJSONObject("main");

                System.out.println(jsontemp.getDouble("max"));

                return jsontemp.getDouble("max");
            }

    /**
     * Given a string of the form returned by the api call:
     * http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7
     * retrieve the maximum temperature for the day indicated by dayIndex
     * (Note: 0-indexed, so 0 would refer to the first day).
     */


    public static void main(String[] args) throws JSONException{
        String weatherJsonStr = "{\"cod\":\"200\",\"message\":0.0126,\"cnt\":7,\"list\":[{\"dt\":1566194400,\"main\":{\"temp\":290.43,\"temp_min\":288.318,\"temp_max\":290.43,\"pressure\":1013.51,\"sea_level\":1013.51,\"grnd_level\":1004.76,\"humidity\":89,\"temp_kf\":2.11},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}],\"clouds\":{\"all\":100},\"wind\":{\"speed\":2.47,\"deg\":258.736},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-08-19 06:00:00\"},{\"dt\":1566205200,\"main\":{\"temp\":289.74,\"temp_min\":288.161,\"temp_max\":289.74,\"pressure\":1013.09,\"sea_level\":1013.09,\"grnd_level\":1004.06,\"humidity\":94,\"temp_kf\":1.58},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}],\"clouds\":{\"all\":100},\"wind\":{\"speed\":1.73,\"deg\":247.306},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-08-19 09:00:00\"},{\"dt\":1566216000,\"main\":{\"temp\":289.33,\"temp_min\":288.281,\"temp_max\":289.33,\"pressure\":1013.55,\"sea_level\":1013.55,\"grnd_level\":1004.41,\"humidity\":91,\"temp_kf\":1.05},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}],\"clouds\":{\"all\":97},\"wind\":{\"speed\":1.63,\"deg\":277.492},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-08-19 12:00:00\"},{\"dt\":1566226800,\"main\":{\"temp\":288.93,\"temp_min\":288.4,\"temp_max\":288.93,\"pressure\":1014.04,\"sea_level\":1014.04,\"grnd_level\":1004.8,\"humidity\":89,\"temp_kf\":0.53},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}],\"clouds\":{\"all\":100},\"wind\":{\"speed\":1.58,\"deg\":275.758},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-08-19 15:00:00\"},{\"dt\":1566237600,\"main\":{\"temp\":289.361,\"temp_min\":289.361,\"temp_max\":289.361,\"pressure\":1015,\"sea_level\":1015,\"grnd_level\":1006.01,\"humidity\":83,\"temp_kf\":0},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04d\"}],\"clouds\":{\"all\":96},\"wind\":{\"speed\":2.39,\"deg\":253.758},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-08-19 18:00:00\"},{\"dt\":1566248400,\"main\":{\"temp\":290.154,\"temp_min\":290.154,\"temp_max\":290.154,\"pressure\":1014.4,\"sea_level\":1014.4,\"grnd_level\":1005.85,\"humidity\":81,\"temp_kf\":0},\"weather\":[{\"id\":803,\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04d\"}],\"clouds\":{\"all\":67},\"wind\":{\"speed\":3.6,\"deg\":251.318},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-08-19 21:00:00\"},{\"dt\":1566259200,\"main\":{\"temp\":289.861,\"temp_min\":289.861,\"temp_max\":289.861,\"pressure\":1013.59,\"sea_level\":1013.59,\"grnd_level\":1005.36,\"humidity\":82,\"temp_kf\":0},\"weather\":[{\"id\":803,\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04n\"}],\"clouds\":{\"all\":57},\"wind\":{\"speed\":4.07,\"deg\":271.337},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-08-20 00:00:00\"}],\"city\":{\"id\":5375480,\"name\":\"Mountain View\",\"coord\":{\"lat\":37.3894,\"lon\":-122.0833},\"country\":\"US\",\"population\":74066,\"timezone\":-25200,\"sunrise\":1566134824,\"sunset\":1566183458}}";
        getMaxTemperatureForDay(weatherJsonStr,1);

    }

}
