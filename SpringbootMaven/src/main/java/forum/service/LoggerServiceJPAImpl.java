/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import java.util.Date;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service("log-jpa")
public class LoggerServiceJPAImpl implements LoggerService{

    @Override
    public void log(String message) {
        
        System.out.println(new Date() + "logJPA");
    }
    
}
