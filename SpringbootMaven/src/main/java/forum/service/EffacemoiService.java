/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.entity.Effacemoi;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author admin
 */
public interface EffacemoiService extends CrudRepository<Effacemoi, Long>{ //CrudRepository(type d'entité à gérer, type de la classe primaire ici id)
    
    
    
    
}
