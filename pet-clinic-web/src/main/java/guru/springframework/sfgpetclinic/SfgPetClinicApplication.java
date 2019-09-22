package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.bootstrap.DataLoader;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args)  throws Exception{
        OwnerService os = new OwnerServiceMap();
        VetService vs = new VetServiceMap();

        DataLoader dl = new DataLoader(os, vs);
        //dl.run();
        SpringApplication.run(SfgPetClinicApplication.class, args);
        //dl.run("xx");
    }
}
