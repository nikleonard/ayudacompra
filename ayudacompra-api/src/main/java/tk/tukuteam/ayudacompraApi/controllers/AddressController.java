package tk.tukuteam.ayudacompraApi.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.tukuteam.ayudacompraApi.model.Address;
import tk.tukuteam.ayudacompraApi.repository.AddressRepository;

@RestController
@RequestMapping(value="/api/v1/address")
public class AddressController {
	@Autowired
	private AddressRepository addressRepo;

	
	@GetMapping("/{idUser}")
	public List<Address> getIdUserfromAddress(@PathVariable("idUser") UUID idUser){
		return addressRepo.findByIdUser(idUser);
	}
	
	@GetMapping("/{addressName}")
	public List<Address> getAddressNamefromAddress(@PathVariable("addressName") String addressName){
		return addressRepo.findByAddressName(addressName);
	}
	
	@GetMapping("/{addressNumber}")
	public List<Address> getAddressNumberfromAddress(@PathVariable("addressNumber") String addressNumber){
		return addressRepo.findByAddressNumber(addressNumber);
	}
	
	@GetMapping("/{block}")
	public List<Address> getBlockfromAddress(@PathVariable("block") String block){
		return addressRepo.findByBlock(block);
	}
	
	@GetMapping("/{county}")
	public List<Address> getCountyfromAddress(@PathVariable("county") String county){
		return addressRepo.findByCounty(county);
	}
	
	@GetMapping("/{city}")
	public List<Address> getCityfromAddress(@PathVariable("city") String city){
		return addressRepo.findByCity(city);
	}
	
	@GetMapping("/{province}")
	public List<Address> getProvincefromAddress(@PathVariable("province") String province){
		return addressRepo.findByProvince(province);
	}

	
	@GetMapping("/{region}")
	public List<Address> getRegionfromAddress(@PathVariable("region") String region){
		return addressRepo.findByRegion(region);
	}
	
	@GetMapping("/{country}")
	public List<Address> getCountryfromAddress(@PathVariable("country") String country){
		return addressRepo.findByCountry(country);
	}
	
	
	
	
	
	

}
