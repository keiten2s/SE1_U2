package Team_1;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;

public class Tester {

    private Programmierer1 a;

    @BeforeEach
    public void setUP() throws Exception{

       a = new Programmierer1(new String[][]{{ "A" , "C"}, {"C", "D"}, {"B", "C"}});

    }


    @Test
    @DisplayName("Array ist sortiert")
    public void issorted(){
        String[] s = new String[]{"A","B","C"};
        assertTrue(a.isWellSorted(s));

      }

    @Test
    @DisplayName("Array ist unsortiert")
    public void isnotsorted(){
       String[] s = new String[]{"B","A","C"};
       assertTrue(a.isWellSorted(s));

    }

    @Test
    @DisplayName("Array ist leer")
    public void isempty(){

      String[] s = new String[]{""};
      assertTrue(a.isWellSorted(s));

    }


    @Test
    @DisplayName("Array sind Buchstaben")
    public void isletters(){
      String[] s = new String[]{"B","A","C","2"};
      assertFalse(a.isWellSorted(s));
    }

    
    @Test
    @DisplayName("Array mit gleichem Inhalt")
    public void siequals(){
      String[] s = new String[]{"A","A"};
      assertFalse(a.isWellSorted(s));
    }













    @Test
    @DisplayName("Array ist sortiert, verschachtelte")
    public void issortedschachtelt(){
        String[][] v = {{"A", "B"}, {"B", "C"}}; 
        a = new Programmierer1(v);

        String[] s = new String[]{"A","B","C"};
        assertTrue(a.isWellSorted(s));

      }

    @Test
    @DisplayName("Array ist unsortiert, verschachtelte")
    public void isnotsortedschachtelt(){
       String[][] v = {{"A", "B"}, {"B", "C"}};
       a = new Programmierer1(v);

       String[] s = new String[]{"B","A","C"};
       assertTrue(a.isWellSorted(s));

    }

    @Test
    @DisplayName("Array ist leer, verschachtelte")
    public void isemptyschachtelt(){
      String[][] v = {{"A", "B"}, {"B", "C"}};
      a = new Programmierer1(v);

      String[] s = new String[]{""};
      assertTrue(a.isWellSorted(s));
    }


    @Test
    @DisplayName("Array sind Buchstaben, verschachtelte")
    public void islettersschachtelt(){
      String[][] v = {{"A", "B"}, {"B", "C"}};
      a = new Programmierer1(v);

      String[] s = new String[]{"B","A","C","2"};
      assertFalse(a.isWellSorted(s));
    }


    @Test
    @DisplayName("Array mit gleichem Inhalt, verschachtelte")
    public void siequalsschachtelt(){
      String[][] v = {{"A", "B"}, {"B", "C"}};
      a = new Programmierer1(v);

      String[] s = new String[]{"A","A"};
      assertFalse(a.isWellSorted(s));
    }

}
