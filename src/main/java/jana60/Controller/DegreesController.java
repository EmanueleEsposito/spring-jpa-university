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

	@GetMapping("/departments/{id}")
	public String departmentsDetail(Model model, @PathVariable(name = "id") Integer id) {
		Optional<Degrees> queryResult = repo.findById(id);
		if (queryResult.isPresent()) {
			Degrees degrees = queryResult.get();
			model.addAttribute("degrees", degrees);
			return "degreesDetail";
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Country not found");
		}

	}
}
