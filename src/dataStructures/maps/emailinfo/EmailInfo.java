package dataStructures.maps.emailinfo;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * EmailInfo.
 *
 * @author BCIT
 * @version 2020
 */
public class EmailInfo {
    private HashMap<String, String> addressBook;

    /**
     * Constructor for objects of class EmailInfo.
     */
    public EmailInfo() {
        addressBook = new HashMap<String, String>();
    }

    /**
     * Formats a name to lower case.
     *
     * @param nameToFormat a String
     * @return a formatted name as a String
     */
    public String formatName(String nameToFormat) {

        if (nameToFormat == null) {
            return null;
        }
        return nameToFormat.trim().toLowerCase();
    }

    /**
     * Formats email address.
     *
     * @param address email address to format
     */
    private String formatAddress(String address) {

        if (address == null) {
            return null;
        }
        return address.trim().toLowerCase();
    }

    /**
     * Adds a friends to the address book.
     *
     * @param friend the friend's name
     * @param email  the friend's email address.
     */
    public void addFriend(String friend, String email) {
        addressBook.put(formatName(friend), formatAddress(email));
    }

    /**
     * Removes a friend from the address book. The name passed in can be in
     * upper case, lower case, or mixed. The friend and their email will be
     * removed from the address book.
     *
     * @param friend the friend to remove.
     */
    public void removeFriend(String friend) {
        addressBook.remove(formatName(friend));
    }

    /**
     * Returns an email address based on friend's name. The name passed in can
     * be in upper case, lower case, or mixed. The friend's email address will
     * be returned.
     *
     * @param friend the friend for whom the address is required.
     * @return the friend's email address as a String
     */
    public String getAddress(String friend) {
        return addressBook.get(formatName(friend));
    }

    /**
     * Displays any friends with the specified address - there might be more
     * than one.
     *
     * @param address the email address to search for
     */
    public void findFriends(String address) {
        boolean friendFound = false;
        address = formatAddress(address);
        for (String person : addressBook.keySet()) {
            if (getAddress(formatAddress(person)).equals(address)) {
                friendFound = true;
                System.out.println(person + " has address " + address);
            }
        }
        if (!friendFound) {
            System.out.println("No match found for " + address);
        }
    }

    /**
     * Lists all friends and their email addresses.
     */
    public void listAll() {
        for (String friend : addressBook.keySet()) {
            System.out.println(friend + "\t\t" + addressBook.get(friend));
        }
    }

    /**
     * List all friends and their addresses, sorted by friend name - The sort is
     * alphabetical based on whatever name is entered.
     */
    public void listSorted1() {
        TreeSet<String> friendsSorted = new TreeSet<String>();
        friendsSorted.addAll(addressBook.keySet());
        for (String friend : friendsSorted) {
            System.out.println(friend + " " + addressBook.get(friend));
        }
    }

    /**
     * List all friends and their addresses, sorted by friend name.
     */
    public void listSorted2() {
        TreeSet<String> friendsSorted = new TreeSet<String>(addressBook.keySet());
        for (String friend : friendsSorted) {
            System.out.println(friend + " " + addressBook.get(friend));
        }
    }
}
