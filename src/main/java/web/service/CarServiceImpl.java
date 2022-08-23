package web.service;

import org.springframework.stereotype.Component;
import web.DAO.CarDAO;
import web.DAO.CarDAOImpl;
import web.models.Car;

import java.util.List;
@Component
public class CarServiceImpl implements CarDAO,CarService {

    private final CarDAO cd = new CarDAOImpl();

    public List<Car> printCar(int count) {
        return cd.printCar(count);
    }
}
