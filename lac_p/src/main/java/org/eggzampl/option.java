package org.eggzampl;

import org.apache.lucene.queryparser.classic.ParseException;
import java.io.IOException;

public class option {
    public static void main(String[] args) {
        String choice = args[0];

        switch (choice) {
            case "--help" -> {
                System.out.println("\n--search:  search from existing index");
                System.out.println("           FORMAT --search <word to be searched> <path of indexed files>");
                System.out.println("\nNote: Index needs to be created before searching it");
            }
            case "--search" -> {
                try {
                    System.out.println("Reading from existing Index");
//                  read_index.Main("1");

                    read_index.Main(args[1], args[2]);
                } catch (IOException | ParseException e) {
                    System.err.println("Error Occurred, Files Not Indexed Properly");
                }
            }

            default -> System.out.println("Wrong Input");
        }
    }

}
