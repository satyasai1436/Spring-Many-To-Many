package in.satya.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.satya.Entity.Person1;
import in.satya.Entity.Role;
import in.satya.person1Repo.person1Repo;
import in.satya.roleRepo.roleRepo;

@Service
public class serviceClass {
	
	@Autowired
	private person1Repo pRepo;
	@Autowired
	private roleRepo rRepo;
	
	
	@SuppressWarnings("unchecked")
	public void setData() {
		Person1 p=new Person1();
		p.setpName("Satya");
		p.setpSalary(10000.2);
		
		
		
		
		Role r=new Role();
		r.setRname("Manager");
		r.setGender("Male");
		
		Role r1=new Role();
		r1.setRname("Lead");
		r1.setGender("Male");
		
		Role r2=new Role();
		r2.setRname("Worker");
		r2.setGender("Male");
		
		
		
		
		//Association  
		
		
		p.setRole(Arrays.asList(r,r1,r2));
	
		pRepo.save(p);
		//rRepo.save(r);	
	}
	public void getPerson(Integer pId) {
		Optional<Person1> id = pRepo.findById(pId);
		if(id.isPresent()) {
			Person1 list = id.get();
			List<Role> role = list.getRole();
			role.forEach(System.out::println);
		}
		
		
	}
	

}
