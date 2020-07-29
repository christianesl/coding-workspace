package MortgageCadence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;

public class US203724_MultiRowRelationship {

    public static void readFileAndGetValues(HashSet<String> mainList, String filePath) throws FileNotFoundException {
        FileReader fr = new FileReader(new File(filePath));
        BufferedReader br = new BufferedReader(fr);

        String line = "";
        try {
            while ((line = br.readLine()) != null) {
                if (line.charAt(0) == '1') {
                    line = line.replace("\t", "");
                    mainList.add(line.trim().substring(2));
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Problems reading the file. " + filePath);
        }
    }

    public static void compareSets(HashSet<String> listSet, HashSet<String> builtSet) {
        // input validation
        if (listSet == null || listSet.size() == 0) {
            System.out.println("listSet is empty.");
            return;
        }

        if (builtSet == null || builtSet.size() == 0) {
            System.out.println("Set2 is empty.");
            return;
        }

        for (String s1value : listSet) {
            if (!builtSet.contains(s1value)) {
                System.out.println("Built set doesnt contain this table: " + s1value);
            }
        }


    }


    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("US_203724 - Multi-Row Relationship");
        String[] files = new String[3];
        files[0] = "C:\\Users\\christian.saldana\\OneDrive\\02 Mortgage Cadence\\02 User Stories\\US_203724 - Multi-row relationships\\list of tables individual fields2.txt";
        files[1] = "C:\\Users\\christian.saldana\\OneDrive\\02 Mortgage Cadence\\02 User Stories\\US_203724 - Multi-row relationships\\list of tables GRID.txt";
        files[2] = "C:\\Users\\christian.saldana\\OneDrive\\02 Mortgage Cadence\\02 User Stories\\US_203724 - Multi-row relationships\\list of tables HCM.txt";
        HashSet<String> complete_list = new HashSet<>();

        // create a super Set from all the grid/hcm/data list panel expected values
        for (int i = 0; i < files.length; i++) {
            readFileAndGetValues(complete_list, files[i]);
        }

        // create Set from current data list panel values
        String builtFile = "C:\\Users\\christian.saldana\\OneDrive\\02 Mortgage Cadence\\02 User Stories\\US_203724 - Multi-row relationships\\list of tables HCM.txt";
        HashSet<String> buildSet = new HashSet<>();
        readFileAndGetValues(buildSet, builtFile);

        // compare and see which values are missing in the built.
        compareSets(complete_list, buildSet);


    }


}
