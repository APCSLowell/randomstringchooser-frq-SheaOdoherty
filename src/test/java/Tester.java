

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;
import java.util.*;

public class Tester {

   @Test
   public void partA () {
      List<String> test = new ArrayList<>();
	   String[] wordArray = {"wheels", "on", "the", "bus"};
	   RandomStringChooser sChooser = new RandomStringChooser(wordArray);
	   for (int k = 0; k < 6; k++)
	   {
			test.add(sChooser.getNext());
	   }
	   assertEquals(6,test.size());
	   assertEquals("NONE",test.get(4));
	   assertEquals("NONE",test.get(5));
	   assertEquals(true,test.contains("wheels"));
	   assertEquals(true,test.contains("on"));
	   assertEquals(true,test.contains("the"));
	   assertEquals(true,test.contains("bus"));
   }

   @Test
   public void partB(){
      RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
      String test = "";
      for(int i = 0; i < 4; i++)
        test+=letterChooser.getNext();
      assertEquals(7,test.length());
      assertEquals("NONE",test.substring(3));
      assertEquals(true,test.contains("c"));
      assertEquals(true,test.contains("a"));
      assertEquals(true,test.contains("t"));
   }



}
