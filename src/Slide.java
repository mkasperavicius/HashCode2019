public class Slide {
    Boolean isV_;
    Image[] images;
    List<String> Tags;

    Slide(Image image, Boolean isV){
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

    private int getNumTags(){
        return Tags.size();
    }
}
