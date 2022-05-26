package com.mycompany.app;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.File;
import java.io.IOException;

public class App {
  public static void main(String[] args) throws IOException {
    // using default font standard.flf, obtained from maven artifact
    String asciiArt1 = FigletFont.convertOneLine("Olá Mundo!");
    System.out.println(asciiArt1);              
  }
}