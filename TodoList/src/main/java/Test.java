import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.todolist.spring.service.TodoService;
import org.todolist.spring.service.TodoServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringDispatcher-servlet.xml");
		TodoService todoService = (TodoServiceImpl) context.getBean("empServiceBean");
		System.out.println("Unique Employee Id: " + todoService.getClass());
	}

}
