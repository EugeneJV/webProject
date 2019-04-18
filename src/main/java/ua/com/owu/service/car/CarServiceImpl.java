package ua.com.owu.service.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.CarDAO;
import ua.com.owu.entity.Car;

import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;

    @Override
    public void save(Car car) {
        carDAO.save(car);
    }

    @Override
    public List<Car> findAll() {
        return carDAO.findAll();
    }

    @Override
    public Car findOne(int id) {
        return carDAO.findOne(id);
    }
}
