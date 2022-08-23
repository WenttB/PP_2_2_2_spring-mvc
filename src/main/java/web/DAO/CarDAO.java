package web.DAO;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {
    private List<Car> cars;
    {
        cars = new ArrayList<Car>();
        cars.add(new Car(1,11111,"Banshee"));
        cars.add(new Car(2,22222,"Infernus"));
        cars.add(new Car(3,33333,"Turismo"));
        cars.add(new Car(4,44444,"Cheetah"));
        cars.add(new Car(5,55555,"Bullet"));

    }
    public List<Car> listCar () {
        return cars;
    }

    public List<Car> printCar(List<Car> carList,int count) {

        if (count == 0 || count >5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
        }
}
