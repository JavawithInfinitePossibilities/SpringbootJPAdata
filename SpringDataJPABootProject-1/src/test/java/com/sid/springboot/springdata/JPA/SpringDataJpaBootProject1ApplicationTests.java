package com.sid.springboot.springdata.JPA;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.sid.springboot.springdata.JPA.model.db.BankAccount;
import com.sid.springboot.springdata.JPA.model.db.Check;
import com.sid.springboot.springdata.JPA.model.db.Contractor;
import com.sid.springboot.springdata.JPA.model.db.CreditCard;
import com.sid.springboot.springdata.JPA.model.db.Image;
import com.sid.springboot.springdata.JPA.model.db.Manager;
import com.sid.springboot.springdata.JPA.model.db.Product;
import com.sid.springboot.springdata.JPA.model.db.Student;
import com.sid.springboot.springdata.JPA.model.db.Vehicle2Wheeler;
import com.sid.springboot.springdata.JPA.model.db.Vehicle4Wheeler;
import com.sid.springboot.springdata.JPA.model.db.componentMapping.Address;
import com.sid.springboot.springdata.JPA.model.db.componentMapping.Customer;
import com.sid.springboot.springdata.JPA.model.db.componentMapping.CustomerId;
import com.sid.springboot.springdata.JPA.model.db.componentMapping.Employee;
import com.sid.springboot.springdata.JPA.model.db.relassociation.manytomanyR.Programmer;
import com.sid.springboot.springdata.JPA.model.db.relassociation.manytomanyR.Project;
import com.sid.springboot.springdata.JPA.model.db.relassociation.onetomanyR.Client;
import com.sid.springboot.springdata.JPA.model.db.relassociation.onetomanyR.PhoneNumber;
import com.sid.springboot.springdata.JPA.model.db.relassociation.onetoone.Driver;
import com.sid.springboot.springdata.JPA.model.db.relassociation.onetoone.License;
import com.sid.springboot.springdata.JPA.model.dto.IStudentDTO;
import com.sid.springboot.springdata.JPA.model.dto.StudentDTO;
import com.sid.springboot.springdata.JPA.repositories.IEmployeeRepo;
import com.sid.springboot.springdata.JPA.repositories.IMageDBRepo;
import com.sid.springboot.springdata.JPA.repositories.IPaymentRepo;
import com.sid.springboot.springdata.JPA.repositories.IPersonRepo;
import com.sid.springboot.springdata.JPA.repositories.IProductRepo;
import com.sid.springboot.springdata.JPA.repositories.IStudentRepo;
import com.sid.springboot.springdata.JPA.repositories.IVehicleRepo;
import com.sid.springboot.springdata.JPA.repositories.relassociation.ICustomerRepo;
import com.sid.springboot.springdata.JPA.repositories.relassociation.manytomanyR.IProgrammerRepo;
import com.sid.springboot.springdata.JPA.repositories.relassociation.onetomanyR.IClientRepo;
import com.sid.springboot.springdata.JPA.repositories.relassociation.onetoone.ILicenseRepo;
import com.sid.springboot.springdata.JPA.services.IBankAccountService;

@SpringBootTest
class SpringDataJpaBootProject1ApplicationTests {

	@Autowired
	private IProductRepo iProductRepo;

	@Autowired
	private IEmployeeRepo iEmployeeRepo;

	@Autowired
	private IStudentRepo iStudentRepo;

	@Autowired
	private IPaymentRepo iPaymentRepo;

	@Autowired
	private IPersonRepo iPersonRepo;

	@Autowired
	private IVehicleRepo iVehicleRepo;

	@Autowired
	private IClientRepo iClientRepo;

	@Autowired
	private IProgrammerRepo iProgrammer;

	@Autowired
	private ILicenseRepo iLicenseRepo;

	@Autowired
	private EntityManager entityManager;

	@Autowired
	private IBankAccountService ibankAccountServices;

	@Autowired
	private IMageDBRepo iMageDBRepo;

	@Autowired
	private ICustomerRepo iCustomerRepo;

	@Disabled
	@Test
	public void testCreateProduct() {
		Product product = new Product("Iphone", "Iphone Apple", 1000d);
		Product saveProduct = iProductRepo.save(product);
		System.out.println(saveProduct);
	}

	@Disabled
	@Test
	public void testReadProduct() {
		Optional<Product> product = iProductRepo.findById(40);
		if (product.isPresent()) {
			System.out.println(product.get());
		}
	}

	@Disabled
	@Test
	public void testUpdateProduct() {
		Optional<Product> productOptional = iProductRepo.findById(40);
		if (productOptional.isPresent()) {
			Product product = productOptional.get();
			product.setPrice(1200);
			iProductRepo.save(product);
		}
	}

	@Disabled
	@Test
	public void testDeleteProduct() {
		Optional<Product> productOptional = iProductRepo.findById(21);
		if (productOptional.isPresent()) {
			Product product = productOptional.get();
			iProductRepo.delete(product);
		}
	}

	@Disabled
	@Test
	public void testfiindByNameProduct() {
		List<Product> products = iProductRepo.findByName("Kenstar");
		products.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testfiindByNameAndDescriptionProduct() {
		List<Product> products = iProductRepo.findByNameAndDescription("customer care", "Bosch-customer care");
		products.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testfindByPriceGreaterThanEqualProduct() {
		List<Product> products = iProductRepo.findByPriceGreaterThanEqual(1000d);
		products.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testPagingFindAllProduct() {
		Page<Product> products = iProductRepo.findAll(PageRequest.of(40, 5));
		products.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testSortFindAllProduct() {
		iProductRepo.findAll(Sort.by(Direction.DESC, "name", "price")).forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testSortOrderFindAllProduct() {
		iProductRepo.findAll(Sort.by(new Sort.Order(Direction.DESC, "price"), new Sort.Order(Direction.ASC, "name"))).forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testPageSortOrderFindAllProduct() {
		iProductRepo.findAll(PageRequest.of(4, 5, Direction.DESC, "price")).forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testCustomPagableFindByNameProduct() {
		List<Product> products = iProductRepo.findByNameLike("%Kenstar%", PageRequest.of(2, 3, Direction.DESC, "price"));
		products.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testCreateemployee() {
		Address address = new Address("101", "Bangalire", "Karnatak", "560037", "India");
		Employee employee = new Employee("Sid", "Sahu", address);
		Employee saveEmployee = iEmployeeRepo.save(employee);
		System.out.println(saveEmployee);
	}

	@Disabled
	@Test
	public void testSaveStudent() {
		Student student = new Student("Susmita", "Sahu", 90);
		iStudentRepo.save(student);
	}

	@Disabled
	@Test
	public void testFindAllStudent() {
		List<Student> allStudent = iStudentRepo.findAllStudent();
		allStudent.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testFindAllFirstAndLastNameOfStudent() {
		List<Object[]> allStudent = iStudentRepo.findAllFirstAndLastNameOfStudent();
		allStudent.stream().forEach(s -> System.out.println("First Name :" + s[0] + "  Last Name:" + s[1]));
	}

	@Disabled
	@Test
	public void testFindAllStudentOfFirstName() {
		List<Student> allStudent = iStudentRepo.findAllStudentOfFirstName("sid");
		allStudent.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testFindAllStudentBetweenScores() {
		List<Student> allStudent = iStudentRepo.findAllStudentBetweenScores(50, 90);
		allStudent.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testFindAllStudentBetweenScoresUsingStudentDTO() {
		List<StudentDTO> allStudent = iStudentRepo.findAllStudentBetweenScoresUsingStudentDTO(50, 90);
		allStudent.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testInsertStudent() {
		iStudentRepo.insertStudent("Welcome", "in Spring", 95);
	}

	/*
		@Disabled
		@Test
		public void testInsertStudentUsingJPQL() {
			iStudentRepo.insertStudentUsingJPQL("Welcome", "in Spring", 96);
		}
	*/

	@Disabled
	@Test
	public void testfindAllStudentPageable() {
		List<Student> allStudentPageable = iStudentRepo.findAllStudentPageable(PageRequest.of(0, 5, Direction.DESC, "firstName"));
		allStudentPageable.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testFindAllStudentBetweenScoresUsingStudentDTONativeSQL() {
		List<IStudentDTO> allStudent = iStudentRepo.findAllStudentBetweenScoresUsingStudentDTONativeSQL(50, 90);
		allStudent.stream().forEach(s -> System.out.println("First Name : " + s.getFirstName() + " Last Name : " + s.getLastName()));
	}

	@Disabled
	@Test
	public void testCreatePayment() {
		CreditCard creditCard = iPaymentRepo.save(new CreditCard(1200, "123567890"));
		Check check = iPaymentRepo.save(new Check(1500, "12345690"));
		System.out.println(creditCard);
		System.out.println(check);
	}

	@Disabled
	@Test
	public void testCreatePerson() {
		Contractor contractor = iPersonRepo.save(new Contractor("sidhant", "sahu", "123567890", "098745631"));
		Manager manager = iPersonRepo.save(new Manager("Sarang", "Joshi", "098745631"));
		System.out.println(contractor);
		System.out.println(manager);
	}

	@Disabled
	@Test
	public void testCreateVehicle() {
		Vehicle4Wheeler vehicle4Wheeler = iVehicleRepo.save(new Vehicle4Wheeler("KA-53 2422", "Car", "SUV", "AUDI"));
		Vehicle2Wheeler vehicle2Wheeler = iVehicleRepo.save(new Vehicle2Wheeler("KA-53 2224", "Byke", "Racing", "Bajaj"));
		System.out.println(vehicle4Wheeler);
		System.out.println(vehicle2Wheeler);
	}

	@Disabled
	@Test
	public void testCreateClientPhone() {
		PhoneNumber phoneNumber = new PhoneNumber("1234567890", "Vodaphone");
		PhoneNumber phoneNumber2 = new PhoneNumber("0987654321", "Vodaphone");
		PhoneNumber phoneNumber3 = new PhoneNumber("0369852147", "Vodaphone");
		Set<PhoneNumber> phoneNumbers = new HashSet<PhoneNumber>(Arrays.asList(phoneNumber, phoneNumber2, phoneNumber3));
		Client entity = new Client("siddhant", phoneNumbers);
		phoneNumber.setClient(entity);
		phoneNumber2.setClient(entity);
		phoneNumber3.setClient(entity);
		Client saveClient = iClientRepo.save(entity);
	}

	@Disabled
	@Test
	public void testCreateClientPhoneNumber() {
		PhoneNumber phoneNumber = new PhoneNumber("1234567890", "Airtel");
		PhoneNumber phoneNumber2 = new PhoneNumber("0987654321", "Airtel");
		PhoneNumber phoneNumber3 = new PhoneNumber("0369852147", "Airtel");
		Client entity = new Client("siddhant");
		entity.addPhoneNumber(phoneNumber);
		entity.addPhoneNumber(phoneNumber2);
		entity.addPhoneNumber(phoneNumber3);
		Client saveClient = iClientRepo.save(entity);
	}

	@Disabled
	@Test
	@Transactional
	public void testSelectClientPhoneNumber() throws InterruptedException {
		Client client = iClientRepo.findById(3).get();
		//System.out.println(client);
		Thread.sleep(5000);
		client.setName("kunmun");
		Set<PhoneNumber> phoneNumbers = client.getPhoneNumbers();
		phoneNumbers.stream().forEach(phno -> {
			if (phno.getType() != null) {
				phno.setType("Air-tel");
			}
		});
		iClientRepo.save(client);
	}

	@Disabled
	@Test
	public void testMtoMProgrammerProjectNumber() {
		Programmer programmer = new Programmer("sid sahu", 1000);
		Project project = new Project("IMOS-1");
		Project project2 = new Project("ETD-1");
		programmer.addProject(project);
		programmer.addProject(project2);
		iProgrammer.save(programmer);
	}

	@Disabled
	@Test
	@Transactional
	public void testMtoMSelectProgrammerProjectNumber() {
		Programmer programmer = iProgrammer.findById(1).get();
		System.out.println(programmer + " project :" + programmer.getProjects());
	}

	@SuppressWarnings("deprecation")
	@Disabled
	@Test
	public void testOneToOneDriverlicense() {
		License license = new License("Bike", new Date(2010, 01, 01), new Date(2020, 12, 31));
		Driver driver = new Driver("Sid", "Sahu", 33);
		license.setDriver(driver);
		driver.setLicense(license);
		iLicenseRepo.save(license);
	}

	@Disabled
	@Test
	@Transactional
	public void testSelectOneToOneDriverlicense() {
		Session session = entityManager.unwrap(Session.class);
		License license = iLicenseRepo.findById(1).get();

		iLicenseRepo.findById(1);
		session.evict(license);
		iLicenseRepo.findById(1);
	}

	@Disabled
	@Test
	public void testBankAccountTransactio() {
		BankAccount from = ibankAccountServices.save(new BankAccount("Sid", 1000));
		BankAccount to = ibankAccountServices.save(new BankAccount("Sus", 500));

		ibankAccountServices.transactionAccount(from, to, 500);
	}

	@Disabled
	@Test
	public void testImageBLOB() throws IOException {
		File file = new File("C:\\test\\IMG_0576.jpg");
		byte[] fileByte = new byte[(int) file.length()];
		FileInputStream inputStream = new FileInputStream(file);
		inputStream.read(fileByte);
		Image image = new Image("Sid.jpg", fileByte);
		iMageDBRepo.save(image);
	}

	@Disabled
	@Test
	public void testReadImageBLOB() throws IOException {
		Image image = iMageDBRepo.findById(1).get();
		FileOutputStream outputStream = new FileOutputStream(new File("C:\\test\\" + image.getName()));

		outputStream.write(image.getData());
		outputStream.flush();
		outputStream.close();
	}

	@Test
	public void testSaveCustomer() {
		CustomerId id = new CustomerId(1, "ZYX@gmail.com");
		Customer customer = new Customer(id, "ZYX");
		Customer saveCustomer = iCustomerRepo.save(customer);
	}
}
