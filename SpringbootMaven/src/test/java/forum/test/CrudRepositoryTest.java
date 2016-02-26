/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.test;

import forum.entity.Effacemoi;
import org.springframework.beans.factory.annotation.Autowired;
import forum.service.EffacemoiService;
import forum.spring.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class CrudRepositoryTest {
    
    @Autowired 
    private EffacemoiService service;
    
    @Test
    public void test(){
        Effacemoi e = new Effacemoi();
        service.save(e);
    }
            
        
    
}
