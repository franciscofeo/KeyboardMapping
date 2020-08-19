package br.com.praticas.KeyboardMappingProject.test;

import br.com.praticas.KeyboardMappingProject.classes.AnalyzeText;
import br.com.praticas.KeyboardMappingProject.classes.Text;

import java.io.IOException;

public class KMTest {
    public static void main(String[] args) throws IOException {

        String fileName = "textFile.txt";

        // Creating a file
        Text myFile = new Text(fileName, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In id fermentum sapien. Sed cursus, massa et porta feugiat, diam metus pellentesque turpis, eget commodo sapien massa eget nibh. Ut vitae est facilisis, vulputate magna et, sagittis ligula. Maecenas ante magna, vehicula vel porttitor non, tincidunt ut odio. Maecenas blandit ligula at nisl hendrerit, eu mattis metus ullamcorper. In lobortis vitae purus non aliquam. In quis diam justo. Sed elementum, nibh vitae eleifend ultrices, sem est venenatis lectus, ac aliquam nibh magna non dui. ");
        myFile.createTextFile();
        myFile.writeTextFile();

        // Analyzing a file
        AnalyzeText myText = new AnalyzeText(fileName);
        myText.readText(fileName);

        // Statistics
        myText.percents(myFile);
    }
}
