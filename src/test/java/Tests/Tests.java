/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import com.rodriguez.movilbackend.Movilbackend;
import com.rodriguez.movilbackend.dao.DirectionRepository;
import com.rodriguez.movilbackend.dao.EmailRepository;
import com.rodriguez.movilbackend.dao.PersonRepository;
import com.rodriguez.movilbackend.dao.PhoneRepository;
import com.rodriguez.movilbackend.enums.EstadoCivil;
import com.rodriguez.movilbackend.enums.Sexo;
import com.rodriguez.movilbackend.model.Direction;
import com.rodriguez.movilbackend.model.Email;
import com.rodriguez.movilbackend.model.Person;
import com.rodriguez.movilbackend.model.Phone;
import java.util.Calendar;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 *
 * @author Usuario iTC
 */
@SpringBootTest
@ContextConfiguration(classes = Movilbackend.class)
public class Tests {
    
   @Autowired
   private PersonRepository personRepository;
   
   @Autowired
   private EmailRepository EmailRepository;
   
   @Autowired
   private PhoneRepository PhoneRepository;
   
   @Autowired
   private DirectionRepository DirectionRepository;
   
   
   @Test
   public void testing(){
       
       Calendar fecha = Calendar.getInstance();
       fecha.set(1981, 1, 1);
       
       Person persona = new Person();
       persona.setCedula("1105704116");
       persona.setNombre("Lander Rodriguez");
       persona.setFechaNacimiento(fecha.getTime());
       persona.setEstadoCivil(EstadoCivil.SOLTERO);
       persona.setSexo(Sexo.HOMBRE);
       
       persona= personRepository.save(persona);
       
       Phone phone = new Phone();
       phone.setPhone("0980105669");
       phone.setPerson(persona);
       phone.setPerson(persona);
       
       phone= PhoneRepository.save(phone);
       
       Email Email = new Email();
       
       Email.setEmail("slanderodriguez@gmail.com");
       Email.setPerson(persona);
       Email= EmailRepository.save(Email);
       
       Direction direction = new Direction();
       
       direction.setDirection("La Argelia");
       direction.setPerson(persona);
       direction= DirectionRepository.save(direction);
   }
}