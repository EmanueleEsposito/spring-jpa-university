/*
 * package jana60.Controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.boot.autoconfigure.SpringBootApplication; import
 * org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
 * import org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestMapping;
 * 
 * @Controller
 * 
 * @RequestMapping("/") //L'ho inserito perchè altrimenti non mi avviava Spring
 * e mi dava errore, ho cercato su google e ho trovato questo
 * 
 * @SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
 * public class DepartmentsController { //metodo home
 * 
 * @GetMapping public String home(Model model) { // lista sei dipartimenti
 * List<String> departmentsList = List.of("Dipartimento di Biologia",
 * "Dipartimento di Fisica e astronomia",
 * "Dipartimento di Ingegneria civile, edile e ambientale",
 * "Dipartimento di Ingegneria dell'informazione", "Dipartimento di Matematica",
 * "Dipartimento di Medicina", "Dipartimento di Neuroscienze",
 * "Dipartimento di Scienze chimiche",
 * "Dipartimento di Scienze economiche e aziendali",
 * "Dipartimento di Scienze economiche e aziendali",
 * "Dipartimento di Scienze politiche, giuridiche e studi internazionali",
 * "Dipartimento di Scienze statistiche",
 * "Dipartimento di Studi linguistici e letterari");
 * model.addAttribute("departmentsList", departmentsList); return "home"; } }
 */