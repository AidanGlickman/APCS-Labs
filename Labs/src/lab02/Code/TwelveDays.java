package lab02.Code;
public class TwelveDays {

    public String singThatSong(){

        final int NUMDAYS = 12;

        String out = "", day;

        final String[] ORDINALS = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

        for(int i = 1; i<=NUMDAYS; i++){

            day = ORDINALS[i-1];
            // Sets which day of the song should be used
            out += String.format("On the %s day of high school, my teacher gave to me\n", day);
            // creates a string using the ordinal

            switch(i){
                case 12:
                    out += "Twelve lunch detentions\n";
                case 11:
                    out += "Eleven vocab lists\n";
                case 10:
                    out += "Ten Practice Problems\n";
                case 9:
                    out += "Nine performance skits\n";
                case 8:
                    out += "Eight examinations\n";
                case 7:
                    out += "Seven lab reports\n";
                case 6:
                    out += "Six chapters' reading\n";
                case 5:
                    out += "Five Shakespeare plays!\n";
                case 4:
                    out += "Four hundred emails\n";
                case 3:
                    out += "Three rough drafts\n";
                case 2:
                    out += "Two problem sets\n";
                    out += "And a lecture about my workload.\n\n";
                    break;
                case 1: // Since the wording for the first day is different, we have to use a break after case 2 (Which also adds the alternative ending for 1), and use a separate case especially for the first day
                    out += "A lecture about my workload.\n\n";
            }
            //This switch determines which line of the song to add on each day
        }
        return(out);
    }
}
