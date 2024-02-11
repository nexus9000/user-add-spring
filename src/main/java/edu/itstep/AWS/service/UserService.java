package edu.itstep.AWS.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.itstep.AWS.dto.UserDTO;
import edu.itstep.AWS.repository.UserJpaRepository;

@Service
@Transactional
public class UserService {
 @Autowired	
 private UserJpaRepository useRepository;
 
 public List<UserDTO>listAll(){
	 return useRepository.findAll();
 }
 public void save(UserDTO user) {
	 useRepository.save(user);
 }
 public UserDTO get(Long id) {
	 return useRepository.findById(id).get();
 }
 public void delete(Long id) {
	 useRepository.deleteById(id);
 }
}
