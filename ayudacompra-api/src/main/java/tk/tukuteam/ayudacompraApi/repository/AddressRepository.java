package tk.tukuteam.ayudacompraApi.repository;

import java.util.List;
import java.util.UUID;

import tk.tukuteam.ayudacompraApi.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, UUID>{
	List<Address> findByIdUser(UUID idUser);
	List<Address> findByAddressName(String addressName);
	List<Address> findByAddressNumber(String addressNumber);
	List<Address> findByBlock(String block);
	List<Address> findByCounty(String county);
	List<Address> findByCity(String city);
	List<Address> findByProvince(String province);
	List<Address> findByRegion(String region);
	List<Address> findByCountry(String country);

}
