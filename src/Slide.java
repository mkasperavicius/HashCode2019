import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Slide {
    Boolean isV_;
    Image[] images;
    private List<String> Tags;

    Slide(Image image, Boolean isV){
        isV_= isV;
        if(!isV){
            images = new Image[1];
            images[0] = image;
        }
        else{
            images = new Image[2];
            images[0] = image;
        }
    }

    private int getNumTags(){
        return Tags.size();
    }
}
