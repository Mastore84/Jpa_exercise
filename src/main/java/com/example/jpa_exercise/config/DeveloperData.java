package com.example.jpa_exercise.config;

import com.example.jpa_exercise.entity.Address;
import com.example.jpa_exercise.entity.Citizen;
import com.example.jpa_exercise.repository.AddressRepository;
import com.example.jpa_exercise.repository.CitizenRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeveloperData implements ApplicationRunner{
    private final AddressRepository addressRepository;

    public DeveloperData(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Address a1 = new Address("Lyngbyvej 1", "Lyngby", "2800");
        Citizen citizen1 = new Citizen("Kurt", "Wonnegut", "a@b.dk","123");
        Citizen citizen2 = new Citizen("Hanne", "Wonnegut", "h@b.dk", "234");
        a1.addCitizen(citizen1);
        a1.addCitizen(citizen2);
        addressRepository.save(a1);

        System.out.println("------- Select statements here --------");
        Address address_1 = addressRepository.findById(a1.getId()).get();
        System.out.println(address_1.getStreet());
        System.out.println("Press Enter to continue");
        System.in.read();
        System.out.println("Citizens: " + address_1.getCitizens().size());
    }
}
