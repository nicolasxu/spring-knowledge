// 1. What is a java bean? 
/*
	A java object, usually created by new operator or IOC contrainer. 
*/

// 2. What is dependency injection in Spring? 
/*
	Java Spring create an object and assign the newly created object to a variable. 
	This mechanism is provided by Spring IOC(Inverson Of Controller) container.
*/

// 3. Whato does Spring IOC contrainer do? 
/*
	IOC contrainer manages the beans. 
	1) Create a service, e.g. GoodMorningService => @Component
		 - Mark the bean definition
	2) Give the service object to variable => @Autowired
		 - Wire the variable for holding the bean object

	Spring uses annotation to know service bean definition, 
	and where to assign the bean to. 
*/

// Example: 

@Component
class GoodMorningService {
	public String sayHi() {
		return "Good Morning";
	}
}

public class DependencyInjectionExample {
	
	@Autowired
	GoodMorningService service;

	@Test
	public void dummyTest() {
		System.out.println(service.sayHi());
	}
}