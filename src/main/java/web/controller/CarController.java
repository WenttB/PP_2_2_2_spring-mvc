package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;

@Controller
@RequestMapping(value = "/cars")
public class CarController {
    private CarDAO carDAO;
    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()
    public String printCar (@RequestParam(value = "count", defaultValue = "5") int count , Model model) {
        model.addAttribute("cars", carDAO.printCar(carDAO.listCar(),count));

        return "cars";
    }
}
