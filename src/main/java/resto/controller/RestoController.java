package resto.controller;


import resto.model.RestoParams;
import resto.service.RestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestoController {

	@Autowired
	private RestoService restoService;

	@GetMapping("/resto/")
	public int getResto(@RequestParam int x, @RequestParam int y, @RequestParam int n) {

		return restoService.getResto(x, y, n);
	}

	@PostMapping("/resto/")
	public int postResto(@RequestBody RestoParams restoParams) {

		return restoService.getResto(restoParams.getX(), restoParams.getY(), restoParams.getN());
	}


}
