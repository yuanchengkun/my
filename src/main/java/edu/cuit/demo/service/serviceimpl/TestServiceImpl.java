package edu.cuit.demo.service.serviceimpl;

import edu.cuit.demo.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public void print() {
        System.out.println("我是impl");
    }
}
