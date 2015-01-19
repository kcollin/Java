
/**
 * TrackInfo describes a music/film track
 *
 */
public class Track {

    private String title;
    private String composer;
    private double time;
    private int rating;
    
    /**
     * 
     * @param composer 	Composer of track
     * @param title		Title of track
     * @param time		Duration of track
     * @param rating	Rating (stars) for track
     */
    public Track( String composer, String title, double time, int rating){

        this.composer = composer;
        this.title = title;
        this.time = time;
        this.rating = rating;
    }
    
    /**
     * @return String with description of Track
     */
    public String toString() {

        String description;
        description = "Tittel: " + String.format("%-20s",title) + "\t" + "Komponist: " + composer + "\t";
        description += "Varighet: " + String.format("%4.2f",time) + "\t" + "Rating: ";
        for(int i=0; i<rating; i++) description += "*";
        return description;
    }
    /**
     * 
     * @return double duration of track
     */
    public double finnTid(){
        return time;
    }
}
