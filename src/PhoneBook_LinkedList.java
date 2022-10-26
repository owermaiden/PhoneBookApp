import java.util.List;

public interface PhoneBook_LinkedList {

    boolean isEmpty();

    int size();

    void printPhoneBook();

    void add(Contact contact);

    PhoneBookNode findByFirstName(String firstName);

    List<PhoneBookNode> findAllByLastName(String lastName);

    void deleteByFirstName(String firstName);

    void deleteAllMatchingLastName(String lastName);

    List<PhoneBookNode> findAll();
}
