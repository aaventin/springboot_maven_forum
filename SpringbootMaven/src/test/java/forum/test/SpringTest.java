/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.test;

import forum.service.LoggerServiceConsoleImpl;
import forum.service.MonService;
import forum.service.SecurityService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import forum.spring.SpringConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author ETY
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class SpringTest {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    @Qualifier("A")
    private MonService monServ;

    @Autowired
    @Qualifier("SecurityServiceMock")
    private SecurityService securservMock;

    @Autowired
    @Qualifier("SecurityServiceImpl")
    private SecurityService securservImpl;
    
    @Autowired
    private LoggerServiceConsoleImpl l1;
    
    @Autowired
    private LoggerServiceConsoleImpl l2;

    //@Test
    public void doNadaOK() {
        System.out.println(monServ);
    }

    //@Test
    public void securiteServiceMockOK() {
        securservMock.check();
    }

    //@Test
    public void securiteServiceImplOK() {
        securservImpl.check();
    }
    
    @Test
    public void testSingleton(){
        Assert.assertTrue(l1 == l2);
    }

}
