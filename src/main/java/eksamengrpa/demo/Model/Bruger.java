package eksamengrpa.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// har fjernet extend superbruger prøver uden
@Entity
public class Bruger implements List<Bruger> {
    @Id
    private int bruger_id;
    private String email;
    private String firstName;
    private String lastName;
    private long telephone;
    private String gender; 
    private int age;
    private String country;
    private String department;
    private String funktion;
    private String education;

    public Bruger(String email, String firstName, String lastName, long telephone, String gender, int age, String country, String department, String funktion, String education) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.gender = gender;
        this.age = age;
        this.country = country;
        this.department = department;
        this.funktion = funktion;
        this.education = education;
    }

    public Bruger() {

    }

    public int getBruger_id() {
        return bruger_id;
    }

    public void setBruger_id(int bruger_id) {
        this.bruger_id = bruger_id;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFunktion() {
        return funktion;
    }

    public void setFunktion(String funktion) {
        this.funktion = funktion;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Bruger{" +
                "telephone=" + telephone +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", department='" + department + '\'' +
                ", funktion='" + funktion + '\'' +
                ", education='" + education + '\'' +
                '}';
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Bruger> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Bruger bruger) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Bruger> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Bruger> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Bruger get(int index) {
        return null;
    }

    @Override
    public Bruger set(int index, Bruger element) {
        return null;
    }

    @Override
    public void add(int index, Bruger element) {

    }

    @Override
    public Bruger remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Bruger> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Bruger> listIterator(int index) {
        return null;
    }

    @Override
    public List<Bruger> subList(int fromIndex, int toIndex) {
        return null;
    }
}
