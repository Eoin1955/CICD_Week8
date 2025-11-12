package ie.atu.week7cicd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final PersonRepository personRepository;

    public DataLoader(PersonRepository personRepository) {this.personRepository = personRepository;}

    @Override
    public void run(String... args) throws Exception {
        Address address1 = new Address("Galway", "H91X5RD");
        Person testData = new Person("Eoin", "eoin@gmail.com", "587465", "Student", "Engineering", address1);
        //address 2
        Address address2 = new Address("Mayo", "F31N762");
        Person testdata2 = new Person("Anz", "eoin@gmail.com", "587465", "Student", "Engineering", address2);

        Address address3 = new Address("Roscommon", "F31N5742");
        Person testData3 = new Person("Lance", "eoin@gmail.com", "587465", "Student", "Engineering", address3);

        personRepository.save(testData);
        personRepository.save(testdata2);
        personRepository.save(testData3);
    }
}
