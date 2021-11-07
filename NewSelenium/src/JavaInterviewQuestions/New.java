package JavaInterviewQuestions;

import java.util.*;

//Program to count the frequency of the elements in a List
public class New
{
 public static void main(String[] args) {

     List<String> list = Arrays.asList("B", "A", "A", "C", "B", "A", "01", "01");

     Set<String> distinct = new HashSet<>(list);
     for (String s: distinct) {
         System.out.println(s + ": " + Collections.frequency(list, s));
     }
 }
}
