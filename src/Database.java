import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Database {
  ArrayList<Person> personList = new ArrayList<>();

    public void addPerson(Person person){
        this.personList.add(person);
    }
    public void sort(){
        personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
    public void printYoungPeopleNames(){
        sort();
        for (int i = 0; i < this.personList.size(); i++) {
            if(this.personList.get(i).getAge() >= 18 && this.personList.get(i).getAge() <=30){
                System.out.println(this.personList.get(i).getName());
            }
        }

    }
}
