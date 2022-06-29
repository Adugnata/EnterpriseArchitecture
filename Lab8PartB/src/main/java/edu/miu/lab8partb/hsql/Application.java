package edu.miu.lab8partb.hsql;
import edu.miu.lab8partb.hsql.domain.Person;
import edu.miu.lab8partb.hsql.domain.Pet;
import edu.miu.lab8partb.hsql.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	PersonRepo personRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		StopWatch sw = new StopWatch();

		sw.start();
		computeSave10000();
		sw.stop();

		System.out.println("---------saving compute------------- ");
		System.out.println("save in second "+sw.getTotalTimeSeconds());


		sw.start();
		computeRetrieve10000();
		sw.stop();

		System.out.println("---------retrieve compute------------- ");
		System.out.println("retrieve in second "+sw.getTotalTimeSeconds());



	}

	private void computeRetrieve10000() {
		personRepository.findAll();
	}

	public void computeSave10000(){
		for (int i = 1; i<= 10000; i++ ){
			Person p = new Person("First "+i,"Last "+i);
			for (int j = 1; j <=10 ; j++) {
				p.addPet(new Pet("p"+j,i));
			}
			personRepository.save(p);
		}
	}
}
