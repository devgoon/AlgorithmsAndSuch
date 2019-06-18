/*
 * Copyright (c) 2019 Thermo Fisher Scientific
 * All rights reserved.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 *
 */
public class JunctionBoxes
{
    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args)
    {
        String[] sboxes = new String[] { "mi2 job mid pet", "wz3 34 54 398", "a1 alps cow bar", "x4 45 21 7" };

        // String[] sboxes = new String[]
        // {
        // "t2 13 121 98", "r1 box ape bit", "b4 xi me nu", "br8 eat nim did", "w1 has uni gry", "f3 54 53 51"
        // };

        List<JunctionBox> junctionBoxes = new ArrayList<>();

        for (String box : sboxes)
        {
            junctionBoxes.add(new JunctionBox(box));

        }

        Collections.sort(junctionBoxes, new SortByOlderGeneration());

        for (JunctionBox junctionBox : junctionBoxes)
        {
            System.out.println(junctionBox);
        }
    }
}


/**
 * Junction JunctionBox
 */
class JunctionBox
{
    /** id */
    String id;

    /** version */
    String version;

    /**
     * Describes a junction box
     *
     *
     * @param box
     */
    public JunctionBox(String box)
    {
        this.id = box.substring(0, box.indexOf(" "));
        this.version = box.substring(box.indexOf(" ") + 1);
    }

    /**
     * Begin the digit?
     * @return
     */
    public boolean beginsWithDigit()
    {
        return Character.isDigit(version.toCharArray()[0]) ? true : false;
    }
    public String toString()
    {
        return id + " " + version;
    }

}


/**
 * Sort Comparator
 */
class SortByOlderGeneration implements Comparator<JunctionBox>
{
    @Override
    public int compare(JunctionBox o1, JunctionBox o2)
    {
        if (o1.beginsWithDigit() && !o2.beginsWithDigit())
        {
            return 1;
        }

        if (!o1.beginsWithDigit() && o2.beginsWithDigit())
        {
            return -1;
        }

        return o1.version.compareTo(o2.version);
    }
}

