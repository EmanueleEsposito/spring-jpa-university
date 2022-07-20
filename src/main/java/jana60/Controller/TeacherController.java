package jana60.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import jana60.Model.Teacher;
import jana60.Repository.TeacherRepository;

@Controller
@RequestMapping("/teachers")
public class TeacherController {
	@Autowired
	private TeacherRepository repo;

	@GetMapping
	public String teachersList(Model model) {
		model.addAttribute("teacherList", repo.findAll());
		return "teachers";
	}

	@GetMapping("/detail/{id}")
	public String teacherDetail(Model model, @PathVariable(name = "id") Integer id) {

		Optional<Teacher> queryResult = repo.findById(id);
		if (queryResult.isPresent()) {
			Teacher teacher = queryResult.get();
			model.addAttribute("teacher", teacher);
			return "teacherDetail";
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "teacher not found");
		}

	}
}
