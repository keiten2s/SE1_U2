package Team_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;

public class Tester {

    private Programmierer1 a;

    @BeforeEach
    public void setUP() throws Exception{

       a = new Programmierer1();
    }



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
        String[] s = new String[]{"A","B","C"};
        assertTrue(a.isWellSorted(s));

    }

    @Test
    @DisplayName("Array mit gleichem Inhalt")
    void siequals(){
     //   assertEquals();

    }

}
