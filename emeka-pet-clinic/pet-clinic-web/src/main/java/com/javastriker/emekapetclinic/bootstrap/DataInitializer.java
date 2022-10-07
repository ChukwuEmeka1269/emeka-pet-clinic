package com.javastriker.emekapetclinic.bootstrap;

import com.javastriker.emekapetclinic.model.Owner;
import com.javastriker.emekapetclinic.model.Vet;
import com.javastriker.emekapetclinic.services.OwnerService;
import com.javastriker.emekapetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading up Owners..........");
        Owner owner1 = new Owner();
        owner1.setFirstName("Emeka");
        owner1.setLastName("Ukwuoma");
        owner1.setId(1L);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Cristiano");
        owner2.setLastName("Ronaldo");
        owner2.setId(2L);
        ownerService.save(owner2);

        System.out.printf("Loaded up %d Owners........", ownerService.count());
        System.out.println();


        System.out.println("Loading up Vets............");
        Vet vet1 = new Vet();
        vet1.setFirstName("Morris");
        vet1.setFirstName("Chukwuebuka");
        vet1.setId(1L);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Rose");
        vet2.setFirstName("Ade");
        vet2.setId(2L);
        vetService.save(vet2);

        System.out.printf("Loaded up %d Vets..........", vetService.count());
        System.out.println();



    }
}
