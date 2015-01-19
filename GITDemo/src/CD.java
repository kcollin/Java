
/**
 * CD class
 * 
 * Del 1 av oppgaven
 */

public class CD {

   private String title, artist;
   private double price;
   private int tracks;
   private String[] songs;
  
    /**
    * Construct a CD with given parameters
    * 
    * @param  title 		CD title
    * @param  artist 		CD artist
    * @param  price	 		CD price
    */

    public CD ( String title, String artist, double price){

        this.title = title;
        this.artist = artist;
        this.price = price;
        this.songs = new String[1];
    }
    /**
     * 
     * @param song Add song to CD
     */
    public void addSong(String song){
    	if (tracks == songs.length) increaseSize();
    	songs[tracks++] = song;
    }
    /**
     * 
     * @return CD title
     */
    public String getTitle() {
    	return title;
    }
    /**
     * 
     * @return CD artist
     */
    public String getArtist() {
    	return artist;
    }
    /**
     * 
     * @return CD number of tracks
     */
    public int getTracks() {
    	return tracks;
    }
    /**
     * 
     * @return String array with tracks
     */
    public String[] getSongs(){
    	return songs;
    }
    /**
     * 
     * @return Track array with tracks

    public Track[] getSongs(){
    	return songs;
    }
     */
    
    /**
     * 
     * @return CD price
     */
    public double getPrice(){
    	return price;
    }
    
    /**
     * @return String Description of CD with all tracks
     */
    public String toString() {

        String description;
        description = "\n" + title + "\t" + artist + "\t" + "Kr " + String.format("%4.2f", price) + "\n";
        int teller = 0;
        if (songs.length != 0)
        
        {
            description += "\n";
            for (int num=0; num < tracks; num ++)
                description += "Spor " + ++teller + "\t" + songs[num] +"\n";
        }
    
        //description += "\nLengste spor er: " + finnLengsteSpor();

        return description;

    }
	private void increaseSize() {
		
	    String[] temp = new String[songs.length *2];
	
	    // Kopier fra gammel til ny tabell
	    System.arraycopy(songs, 0, temp, 0, songs.length);
	    songs = temp;
	}
    
 	
}