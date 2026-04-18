public class books {
    public static void main (String[] args){
        String[] categories = {"Fition", "Nepali"};
        String[][] titles = {
            {"Asahamati - 5"},
            {"Muna Madan"}
        };
        double [][] Price= {
            {750.0},
            {500.0}
        };
        for (int i = 0; i< categories.length; i++) {
            System.out.println ("Category:" + categories[i]);
            for (int j=0; j<titles[i].length; j++){
                if (titles[i][j] != null){
                    System.out.println("Title:" + titles[i][j]);
                } System.out.println("Price:" + Price[i][j]); 
            }
        }
    }
}