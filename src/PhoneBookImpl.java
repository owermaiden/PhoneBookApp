import java.util.List;

public class PhoneBookImpl implements PhoneBook_LinkedList{

    public PhoneBookNode head;
    public PhoneBookNode tail;
    int size;

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printPhoneBook() {
        PhoneBookNode current = head;
        int element = 1;
        while (current != null) {
            System.out.println(element + ". " + current.contact);
            current = current.next;
            element++;
        }
    }

    @Override
    public void add(Contact contact) {
    }

    @Override
    public PhoneBookNode findByFirstName(String firstName) {
        return null;
    }

    @Override
    public List<PhoneBookNode> findAllByLastName(String lastName) {
        return null;
    }

    @Override
    public void deleteByFirstName(String firstName) {

    }

    @Override
    public void deleteAllMatchingLastName(String lastName) {

    }

    @Override
    public List<PhoneBookNode> findAll() {
        return null;
    }
}
