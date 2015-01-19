

/**
 * CDCollection, CD archive system
 */
public class CDCollection {

    private final static int NUM_CDS=100;
    private CD[] collection;
    private double totalCost;
    private int count;

    public CDCollection() {

        count = 0;
        totalCost = 0.0;
        collection = new CD[NUM_CDS];
    }

    /**
     * Add a CD to collection
     * 
     * @param cd CD to add to collection
     */
    public void addCD(CD cd) {

        if (count == collection.length)
            increaseSize();
        collection[count] = cd;
        count++;
        totalCost +=cd.getPrice();

    }
    public String toString() {

        String report = "-------------------------------------------------------------\n";

        report += "CD samlingen min\n\n";
        report += "Antall CDer " + count + "\n";
        report += "Totale kostnader " +  String.format("%4.2f", totalCost) + "\n";
        report += "Oversikt over CDer: " + "\n";

        for (int cd=0; cd <count; cd++) {
            report += collection[cd] + "\n" ;
        }

        return report;        
    }
    /**
     * Remove a CD from collection
     * 
     * @param title Title of album to be removed
     * @param artist Artist of album to be removed
     * @return true if found and removed, else false
     */
    public boolean removeCD(String title, String artist) {

        for (int cd=0; cd <count; cd++) {
            if(collection[cd].getTitle().equals(title) && collection[cd].getArtist().equals(artist)){
            	totalCost -=collection[cd].getPrice();
            	for (int i =cd; i<count; i++) {
            		collection[i] = collection[i+1] ;
            	}
            	count--;
            	return true;
            }
        }
        return false;

    }
    
	private void increaseSize() {
		
	    CD[] temp = new CD[collection.length *2];
	
	    // Kopier fra gammel til ny tabell
	    for (int cd=0; cd < collection.length; cd++) {
	        temp[cd]= collection[cd] ;
	    }
	    collection = temp;
	}

}


