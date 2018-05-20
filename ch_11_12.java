import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ch_11_12
{
    /* Write a method contains3 that accepts a list of strings as a parameter and returns true if any
single string occurs at least 3 times in the list, and false otherwise. Use a map as auxiliary storage. */

    public static void main(String[] args)
    {
        List<String> singleList = new ArrayList<>();
        singleList.add("a");
        singleList.add("ab");
        singleList.add("a");
        singleList.add("abc");
        singleList.add("a");
    }

}

