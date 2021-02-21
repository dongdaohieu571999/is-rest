package com.is.issystem.commons;

import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.stream.Collectors;

public class Function {
    public static JSONObject convertToJsonObject(HttpServletRequest request) throws IOException {
        String jsonString = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
        jsonString.replaceAll("\t","");
        jsonString.replaceAll("\n","");
        JSONObject jsonObject = new JSONObject(jsonString);
        return jsonObject;
    }
}
