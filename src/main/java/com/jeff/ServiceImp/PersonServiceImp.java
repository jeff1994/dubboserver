package com.jeff.ServiceImp;


import com.alibaba.dubbo.config.annotation.Service;
import com.jeff.Service.PersonService;

/**
 * Created by zyc on 2017/8/9 0009.
 */
@Service(interfaceClass = PersonService.class)
public class PersonServiceImp implements PersonService {

    public  String returnPersonName(){
        return "张三";
    }

}
