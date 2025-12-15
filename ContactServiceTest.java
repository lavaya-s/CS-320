import com.lexi.contacts.Contact;
import com.lexi.contacts.ContactService;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Lexi
 */
public class ContactServiceTest {
    
    public ContactServiceTest() {
        
    }
    @Test
    public void testAddContact(){
        ContactService x = new ContactService();
        Assertions.assertDoesNotThrow(()->{
            x.addContact("12345","Apple","Baanana","1234567890","10 main street");
        });
    }
    @Test
    public void testRemoveContact(){
        ContactService x = new ContactService();
        x.addContact("12345","Apple","Baanana","1234567890","10 main street");
        Assertions.assertDoesNotThrow(()->{
            x.deleteContact("12345");
        });
    }
    @Test
    public void testUpdateFirstName(){
        ContactService x = new ContactService();
        x.addContact("12345","Apple","Baanana","1234567890","10 main street");
        Assertions.assertDoesNotThrow(()->{
            x.updateFirstName("12345","Banana");
            assertEquals("Banana", x.getContact("12345").getFirstName()); 
        });
    }
    @Test
    public void testUpdateLastName(){
        ContactService x = new ContactService();
        x.addContact("12345","Apple","Baanana","1234567890","10 main street");
        Assertions.assertDoesNotThrow(()->{
            x.updateLastName("12345","Orange");
            assertEquals("Orange", x.getContact("12345").getLastName()); 
        });
    }
    @Test
    public void testUpdatePhone(){
        ContactService x = new ContactService();
        x.addContact("12345","Apple","Baanana","1234567890","10 main street");
        Assertions.assertDoesNotThrow(()->{
            x.updatePhone("12345","1111111111");
        });
        assertEquals("1111111111", x.getContact("12345").getPhone()); 
    }
    @Test
    public void testUpdateAddress(){
        ContactService x = new ContactService();
        x.addContact("12345","Apple","Baanana","1234567890","10 main street");
        Assertions.assertDoesNotThrow(()->{
            x.updateAddress("12345","102 public road");
            assertEquals("102 public road", x.getContact("12345").getAddress()); 
        });
    }
}