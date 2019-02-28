import java.io.*;
import java.util.*;

public class SlideShow {
    private static int numberOfSlides
    public static void main(String args[]) throws FileNotFoundException {
        SlideShow S = new SlideShow();
        numberOfSlides = 0;
    }


    public SlideShow() throws FileNotFoundException {

        List<Image> L_reversed = loadInput();
        List<Image> H_descending = sortH(L_reversed);
        List<Image> V_descending = sortV(L_reversed);
        L_reversed.sort(Comparator.comparing(Image::getNumOfTags).reversed());


    }

    private static List<Image> sortV(List<Image> L) {
        List<Image> result = new ArrayList<>();
        for (int i = 0; i < L.size(); i++) {
            if (L.get(i).isVertical()) {
                result.add(L.get(i));
            }
        }
        return result;
    }

    private static List<Image> sortH(List<Image> L) {
        List<Image> result = new ArrayList<>();
        for (int i = 0; i < L.size(); i++) {
            if (!L.get(i).isVertical()) {
                result.add(L.get(i));
            }
        }
        return result;
    }


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
            List<String> tags_i = new ArrayList<>();
            for (int k = 0; k < numOfTags; k++) {
                tags_i.add(i,reader.next());
            }
            Image tmp = new Image(isVertical, tags_i, numOfTags, i);
            images.add(tmp);
        }

        return images;

    }
    public static List <Image> mergeVertical (List <Image> verticalList ) {
    	List <Image> newList = new ArrayList<> (); 
    	
    	Slide slide;
    	
    	for (int i = 0; i<=verticalList.size(); i++) {
        	slide =  new Slide (verticalList.get(i), true);
    		 
        	slide.ta
    	}
    	return newList; 
    }
    
    private static void outputSlideShow(List<Slide> L) throws IOException {
        File Output = new File("Output");
        BufferedWriter out = new BufferedWriter(new FileWriter(Output));
        out.write(numberOfSlides);
        out.newLine();
        for(int i = 0; i < L.size(); i++)
        {
            for(int k = 0; k < L.get(i).images.length; k++)
            out.write(L.get(i).images[k].index);
            out.write(" ");
        }
        out.newLine();
        out.close();
    }

    public int minScore(Slide L, Slide R){
        List<String> common = new ArrayList<>();
        int sz = (L.getNumTags() < R.getNumTags())? R.getNumTags() : L.getNumTags();

        for(int i = 0; i< sz = (L.size))


    }
}



