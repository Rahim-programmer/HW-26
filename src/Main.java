import State.KeyDB;
import util.FileService;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        FileService fileService = new FileService();
        KeyDB []keyDBS = FileService.fileService();
//        System.out.println(Arrays.toString(keyDBS));
    }
}