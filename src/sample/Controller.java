package sample;

import java.util.*;
import java.io.IOException;

public class Controller {

    public List<String> oneSylNouns =
            new ArrayList<String>(Arrays.asList("bread","girl","boy","cat","dog","fish","gift","mist","tree",
                    "frog","head","man","world","one","door"));

    public List<String> twoSylNouns =
            new ArrayList<String>(Arrays.asList("water","shower","monkey","Edo","Fuji","mountain",
                    "fire","woman","soldier","summer","whisper","lemon"));

    public List<String> oneSylVerbs =
            new ArrayList<String>(Arrays.asList("ran","ate","smiles","met","flew","lept","chased","brought",
                    "saw","fell", "drank","make","ask","call"));

    public List<String> oneSylAdjs =
            new ArrayList<String>(Arrays.asList("good","bad","fun","bright","cold","light","black","blue"));

    public List<String> article =
            new ArrayList<String>(Arrays.asList("the","a","no"));

    public List<String> preposition =
            new ArrayList<String>(Arrays.asList("of","for","in"));


    public String nouns() {
        int nounsLength = oneSylNouns.size();
        int rand1 = (int) (Math.random() * nounsLength);
        String noun = oneSylNouns.get(rand1);
        return noun;
    }

    public String dosNouns() {
        int dosNounsLength = twoSylNouns.size();
        int rand6 = (int) (Math.random() * dosNounsLength);
        String dosNoun = twoSylNouns.get(rand6);
        return dosNoun;
    }

    public String verb() {
        int verbsLength = oneSylVerbs.size();
        int rand2 = (int) (Math.random() * verbsLength);
        String verb = oneSylVerbs.get(rand2);
        return verb;
    }

    public String adjective() {
        int adjsLength = oneSylAdjs.size();
        int rand3 = (int) (Math.random() * adjsLength);
        String adjective = oneSylAdjs.get(rand3);
        return adjective;
    }

    public String arts() {
        int artLength = article.size();
        int rand5 = (int) (Math.random() * artLength);
        String art = article.get(rand5);
        return art;
    }

    public String preps() {
        int prepLength = preposition.size();
        int rand7 = (int) (Math.random() * prepLength);
        String prep = preposition.get(rand7);
        return prep;
    }

    public String lineOne() {
        return arts()
                + " " + nouns()
                + " " + verb()
                + " " + arts()
                + " " + nouns();
    }

    public String lineOneV2() {
        return dosNouns()
                + ", " + nouns()
                + " " + "and"
                + " " + nouns();
    }

    public String lineTwo() {
        return arts()
                + " " + adjective()
                + " " + dosNouns()
                + " " + verb()
                + " " + adjective()
                + " " + nouns();
    }

    public String lineTwoV2() {
        return verb()
                + " " + "quickly,"
                + " " + arts()
                + " " + dosNouns()
                + " " + verb();
    }

    public String lineThree() {
        return "at last,"
                + " " + arts()
                + " " + nouns()
                + " " + verb();
    }

    public String lineThreeV2() {
        return dosNouns()
                + " " + verb()
                + ", " + nouns()
                + " " + verb();
    }

    public String lineThreeV3() {
        return "refrigerator";
    }

    public void Haiku() {
        int rand = (int) (Math.random() * 12);

        if (rand == 1) {
            System.out.println(lineOne() + "\n" + lineTwo() + "\n" + lineThree());
        }
        else if (rand == 2)  {
            System.out.println(lineOneV2() + "\n" + lineTwo() + "\n" + lineThree());
        }
        else if (rand == 3)  {
            System.out.println(lineOne() + "\n" + lineTwoV2() + "\n" + lineThree());
        }
        else if (rand == 4) {
            System.out.println(lineOneV2() + "\n" + lineTwoV2() + "\n" + lineThree());
        }
        else if (rand == 5) {
            System.out.println(lineOne() + "\n" + lineTwo() + "\n" + lineThreeV2());
        }
        else if (rand == 6) {
            System.out.println(lineOneV2() + "\n" + lineTwo() + "\n" + lineThreeV2());
        }
        else if (rand == 7) {
            System.out.println(lineOne() + "\n" + lineTwoV2() + "\n" + lineThreeV2());
        }
        else if (rand == 8) {
            System.out.println(lineOneV2() + "\n" + lineTwoV2() + "\n" + lineThreeV2());
        }
        else if (rand == 9) {
            System.out.println(lineOneV2() + "\n" + lineTwo() + "\n" + lineThreeV2());
        }
        else if (rand == 10) {
            System.out.println(lineOne() + "\n" + lineTwoV2() + "\n" + lineThreeV2());
        }
        else if (rand == 11) {
            System.out.println(lineOneV2() + "\n" + lineTwoV2() + "\n" + lineThreeV2());
        }
        else if (rand == 12) {
            System.out.println(lineOne() + "\n" + lineTwo() + "\n" + lineThreeV3());
        }
        else {
            System.out.println(lineOneV2() + "\n" + lineTwoV2() + "\n" + lineThreeV3());
        }
    }

    public Controller() throws IOException {
        Haiku();
    }

}
