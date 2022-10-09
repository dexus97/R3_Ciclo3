package com.usa.ciclo3.r3.crudrepository;

import com.usa.ciclo3.r3.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {

}
