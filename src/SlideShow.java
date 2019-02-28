import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SlideShow {
    private LinkedList<Image> sortedH;
    private LinkedList<Image> sortedV;


    public SlideShow() throws FileNotFoundException {
    }



    Collections.sort(images, )

    private static List<Image> loadInput() throws FileNotFoundException {
        Scanner reader = new Scanner(new File("a_example.txt"));
        int numOfInputs = reader.nextInt();
        List<Image> images = new ArrayList<>();
        boolean isVertical;
        for (int i = 0; i < numOfInputs; i++) {

            reader.nextLine();
            if (reader.next() == String.valueOf('V')) {
                isVertical = true;
            } else {
                isVertical = false;
            }
            int numOfTags = reader.nextInt();
            String[] tags_i = new String[numOfTags];
            for (int k = 0; k < numOfTags; k++) {
                tags_i[i] = reader.next();
            }
            Image tmp = new Image(isVertical, tags_i, numOfTags, i);
            images.add(tmp);
        }

        return images;

}



