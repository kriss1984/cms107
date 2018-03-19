package com.kriss.cms.service;

import com.kriss.cms.mybatis.dao.CarDao;
import com.kriss.cms.mybatis.dto.CarRegist;

public class CarService {

    CarDao carDao = new CarDao();
    public void save(CarRegist carRegist){
        carDao.saveReg(carRegist);
    }
}
