package util;


import State.KeyDB;
import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {

    public static KeyDB[] fileService() {
        Gson gson = new Gson();
        String reads = "";
        try {
            Path path = Paths.get("src/data/key.json");
            reads = Files.readString(path);
    }catch (IOException exception){
            exception.printStackTrace();
        }
        KeyDB[]keyDBS = gson.fromJson(reads,KeyDB[].class);
        return keyDBS;
        }
}


