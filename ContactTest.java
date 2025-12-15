import com.lexi.contacts.Contact;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 *
 * @author Lexi
 */
public class ContactTest {
    
    public ContactTest() {
        Contact contact = new Contact("123456789","Alexandria","Palm","1234567890","123 cassandra plaza");
        assertTrue(contact.getContactId().equals("123456789"));
        assertTrue(contact.getFirstName().equals("Alexandria"));
        assertTrue(contact.getLastName().equals("Palm"));
        assertTrue(contact.getPhone().equals("1234567890"));
        assertTrue(contact.getAddress().equals("123 cassandra plaza"));
    }
    @Test
    void testContactIdLengthShort(){
        Assertions.assertDoesNotThrow(()->{
            new Contact("12345","Apple","Baanana","1234567890","10 main street");
        });
    }
    @Test
    void testContactIdNull(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Contact(null,"Apple","Baanana","1234567890","10 main street");
        });
    }
    @Test
    void testContactIdExact(){
        Assertions.assertDoesNotThrow(()->{
            new Contact("1234567890","Apple","Baanana","1234567890","10 main street");
        });
    }
    @Test
    void testContactIdLengthLong(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Contact("12345678901234567890","Apple","Baanana","1234567890","10 main street");
        });
    }
    @Test
    void testFirstNameLengthLong(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Contact("12345","Appleappleapple","Baanana","1234567890","10 main street");
        });
    }
    @Test
    void testFirstNameLengthShort(){
        Assertions.assertDoesNotThrow(()->{
            new Contact("12345","Apple","Baanana","1234567890","10 main street");
        });
    }
    @Test
    void testFirstNameExact(){
        Assertions.assertDoesNotThrow(()->{
            new Contact("12345","AppleApple","Baanana","1234567890","10 main street");
        });
    }
    @Test
    void testFirstNameNull(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Contact("12345",null,"Baanana","1234567890","10 main street");
        });
    }
    @Test
    void testLastNameLengthShort(){
        Assertions.assertDoesNotThrow(()->{
            new Contact("12345","Apple","Baanana","1234567890","10 main street");
        });
    }
    @Test
    void testLastNameLengthLong(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Contact("12345","Apple","Bananananana","1234567890","10 main street");
        });
    }
    @Test
    void testLastNameLengthExact(){
        Assertions.assertDoesNotThrow(()->{
            new Contact("12345","Apple","Banananana","1234567890","10 main street");
        });
    }
    @Test
    void testLastNameNull(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Contact("12345","Apple",null,"1234567890","10 main street");
        });
    }
    @Test
    void testPhoneExact(){
        Assertions.assertDoesNotThrow(()->{
            new Contact("12345","Apple","banana","1234567890","10 main street");
        });
    }
    @Test
    void testPhoneLengthShort(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Contact("12345","Apple","banana","1234","10 main street");
        });
    }
    @Test
    void testPhoneLengthLong(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Contact("12345","Apple","banana","12345678901234567890","10 main street");
        });
    }
    @Test
    void testPhoneNull(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Contact("12345","Apple","banana",null,"10 main street");
        });
    }
    @Test
    void testPhoneIsDigit(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Contact("12345","Apple","banana","Orange","10 main street");
        });
    }
    @Test
    void testAddressNull(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Contact("12345","Apple","banana","1234567890",null);
        });
    }
    @Test
    void testAddressLong(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Contact("12345","Apple","banana","1234567890","1234567890123456789012345678901234567890");
        });
    }
    @Test
    void testAddressShort(){
        Assertions.assertDoesNotThrow(()->{
            new Contact("12345","Apple","banana","1234567890","10 main street");
        });
    }
    @Test
    void testAddressExact(){
        Assertions.assertDoesNotThrow(()->{
            new Contact("12345","Apple","banana","1234567890","123456789012345678901234567890");
        });
    }
}