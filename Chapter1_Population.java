public class Chapter1_Population {
    public static void main (String[] args){
       
        int currentPopulation = 312032486;
        
        // Number of seconds in a year (365 days * 24 hours * 60 minutes * 60 seconds)
        int seconds = 365 * 24 * 60 * 60;
        
        
        double birth = 1.0 / 7;  
        double death = 1.0 / 13; 
        double immigration = 1.0 / 45; 

        
        for (int year = 1; year <= 5; year++) {
            // Calculate population change in one year
            double populationChange = (birth - death + immigration) * seconds;
            
            // Update the population
            currentPopulation += (int) populationChange;
          
            //Display the output
            System.out.println("Population after year " + year + ": " + currentPopulation);
        }
    }
}
