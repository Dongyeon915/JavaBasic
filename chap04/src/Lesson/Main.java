package Lesson;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    try {
      String s = bufferedReader.readLine();
      System.out.println(s);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}



