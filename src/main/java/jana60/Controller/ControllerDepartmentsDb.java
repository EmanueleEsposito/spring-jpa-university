package jana60.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.Model.Departments;
import jana60.Repository.DepartmentsRepository;

@Controller
@RequestMapping("/")
public class ControllerDepartmentsDb {
	@Autowired
	private DepartmentsRepository repo;

	@GetMapping
	public String homepage() {
		return "home";
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/departments")
	public String departments(Model model) {
		List<Departments> departmentsList = (List<Departments>) repo.findAll();
		model.addAttribute("departmentsList", departmentsList);
		return "departments";
	}

	@GetMapping("/department/{id}")
	public String departmentsDetail(Model model, @PathVariable(name = "id") Integer departmentsPrimaryKey) {
		Departments currentDepartment = repo.findById(departmentsPrimaryKey).get();
		model.addAttribute("departments", currentDepartment);
		return "departmentDetail";
	}
}
