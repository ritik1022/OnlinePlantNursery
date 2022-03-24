package in.capgemini.onlineplantnurseryapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.capgemini.onlineplantnurseryapplication.models.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address,Integer>{

}
