package seedu.address.model.person;

/**
 * Represents a Remark in the address book.
 */
public class Remark {
    public final String value;

    public Remark(String remark) {
        this.value = remark;
    }

    @Override
    public String toString() {
        return value;
    }
}
