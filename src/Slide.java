import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Slide {
    Boolean isV;
    Image[] images;

    Slide(image, isV){
        this.isV = isV;
        if(!isV){
            images = new Image[1];
            images[0] = image;
        }
        else{
            images = new Image[2];
            images[0] = image;
        }
    }
}
