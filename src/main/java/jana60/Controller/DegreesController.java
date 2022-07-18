package jana60.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.Model.Degrees;
import jana60.Repository.DegreesRepository;

@Controller
@RequestMapping("/degrees")
public class DegreesController {
	@Autowired
	private DegreesRepository repo;

	@GetMapping
	public String degreesList(Model model) {
		model.addAttribute("degreesList", repo.findAll());
		return "degrees";
	}

	@GetMapping("/{departmentId}")
	public String degreesDetail(Model model, @PathVariable(name = "departmentId") Integer degreesPrimaryKey) {
		// select su db sulla tabella regions per quella primary key
		Degrees currentDegrees = repo.findById(degreesPrimaryKey).get();
		model.addAttribute("degrees", currentDegrees);
		return "degreesDetail";
	}

}
