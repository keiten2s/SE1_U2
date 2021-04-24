package Team_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class Tester {

   /* @BeforeEach
    public void setUP(){

     //   String[][] a = new Programmierer1();
    }*/



    @Test
    @DisplayName("Array ist  vorhanden")
    void isnull(){
      //  assertNull(a);

    }

    @Test
    @DisplayName("Array ist leer")
    void isempty(){
       // assertTrue();

    }


    @Test
    @DisplayName("Array sind Buchstaben")
    void isletters(){
     //   assertTrue();

    }

  
    @Test
    @DisplayName("Array ist sortiert")
    void issorted(){
        assertTrue(Programmierer1.iswellSorted("A,B,C"));

    }

    @Test
    @DisplayName("Array mit gleichem Inhalt")
    void siequals(){
     //   assertEquals();

    }

}
