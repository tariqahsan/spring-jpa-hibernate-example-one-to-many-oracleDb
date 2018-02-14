package org.tahsan.jpa.springjpahibernateexample.resource;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tahsan.jpa.springjpahibernateexample.model.ProductManufacturer;
import org.tahsan.jpa.springjpahibernateexample.repository.ProductManufacturerRepository;
import java.util.List;

@RequestMapping("/rest/productmanufacturer")
@RestController
public class ProductManufacturerController {

    private ProductManufacturerRepository productManufacturerRepository;

    public ProductManufacturerController(ProductManufacturerRepository productManufacturerRepository) {
        this.productManufacturerRepository = productManufacturerRepository;
    }

    @GetMapping(value = "/all")
    public List<ProductManufacturer> getProductManufacturer() {
        return productManufacturerRepository.findAll();
    }

   @RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<?> addUser(@RequestBody ProductManufacturer productManufacturer) {
	   System.out.println("Inserting data into tables using /save ...");
	   return new ResponseEntity<>(productManufacturerRepository.save(productManufacturer), HttpStatus.CREATED);
	}
    
    @PostMapping(value = "/add")
    public List<ProductManufacturer> create(@RequestBody final ProductManufacturer productManufacturer){
    	System.out.println("Inserting data into ESET tables ...");
    	productManufacturerRepository.save(productManufacturer);
    	//UsersContact usersContact = new UsersContact();
        /*Users users = new Users();
        UsersLog usersLog = new UsersLog();
        usersLog.setLog("HI Youtube");

        UsersLog usersLog2 = new UsersLog();
        usersLog2.setLog("HI Viewers");

        users.setTeamName("Development")
                .setSalary(10000)
                .setName("John Doe")
                .setUsersLogs(Arrays.asList(usersLog, usersLog2));

        usersContact.setPhoneNo(11111)
                .setUsers(users);

        //persist
        productManufacturerRepository.save(usersContact);*/

    	return productManufacturerRepository.findAll();
    }
    
    @GetMapping(value = "/update/{name}")
    public List<ProductManufacturer> update(@PathVariable final String name) {

    	ProductManufacturer productManufacturer = new ProductManufacturer();
        /*Users users = new Users();
        UsersLog usersLog = new UsersLog();
        usersLog.setLog("HI Youtube");

        UsersLog usersLog2 = new UsersLog();
        usersLog2.setLog("HI Viewers");

        users.setTeamName("Development")
                .setSalary(10000)
                .setName(name)
                .setUsersLogs(Arrays.asList(usersLog, usersLog2));

        usersContact.setPhoneNo(11111)
                .setUsers(users);*/

        //persist
        productManufacturerRepository.save(productManufacturer); 

        //getall
        return productManufacturerRepository.findAll();


    }


}
