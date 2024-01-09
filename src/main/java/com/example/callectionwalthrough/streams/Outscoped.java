package com.example.callectionwalthrough.streams;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public class Outscoped {
    public void checkObject(){
        String values = "{\"scope\":\"default\",\"token_type\":\"Bearer\",\"expires_in\":259,\"refresh_token\":\"21f2b0ce6842890c9edabab226c073d1\",\"access_token\":\"2cd5476d35043223ffffb4d296bab49d\"}";
        String value = "[\n" +
                "    true,\n" +
                "    \"lorem ipsum\",\n" +
                "    {\n" +
                "        \"city\": \"chicago\",\n" +
                "        \"name\": \"jon doe\",\n" +
                "        \"age\": \"22\"\n" +
                "    }\n" +
                "]";
        JSONObject jsonData;
        try {
            jsonData = new JSONObject(value);
//            String getData = jsonData.getString("access_token");
            System.out.println("Json Data "+jsonData);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
