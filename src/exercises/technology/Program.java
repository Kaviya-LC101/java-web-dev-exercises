package exercises.technology;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Program {
    Computer dell;
    Laptop  lennova;
@Before
public void  createComputerObject(){
dell =new Computer("Window",120,4);
lennova= new Laptop("Window",150,6,true);
}
    @Test
   public void emptyTest(){
        assertEquals(10,10,.001);
    }
    @Test
    public void checkSystemMemory(){
         dell.addSystemMemory(2);
         assertEquals(6,dell.getSystemMemoryRAM(),.001);
    }
    @Test
    public void checkSystemStorage(){
        dell.addexternalStorage(60);
        assertEquals(180,dell.getTotalSystemStorage(),.001);
    }
    @Test
    public void childLaptopAccessParentMethod(){
     lennova.addexternalStorage(20);
     assertEquals(170,lennova.getTotalSystemStorage(),.001);
    }
//    @Test
//    public void abstractEntityComputerUniqueId() {
//        assertEquals(1, dell.getComputerId(), .001);
//    }
//    @Test
//    public void abstractEntityComputerUniqueId(){
//        assertEquals(1,dell.getUniId(),.001);
//    }
//    @Test
//    public void abstractEntityLaptopUniqueId(){
//     assertEquals(2,lennova.getUniId(),.001);
//    }

}
