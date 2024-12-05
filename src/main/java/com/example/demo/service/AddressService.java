package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Address;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.AddressRepository;
import java.util.Optional;
import java.util.List;

import com.example.demo.entity.User;

@Service
public class AddressService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    // Save the user address
    public Address addAddress(Long userId, Address address) {
        Optional<User> user = userRepository.findById(userId);
        if(user.isPresent()) {
            address.setUser(user.get());
            return addressRepository.save(address);
        }
        throw new RuntimeException("User not found");
    }
    
    //get all the user addresses
    public List<Address> getAddresses(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        if(user.isPresent()) {
            return user.get().getAddresses();
        }
        throw new RuntimeException("User not found");
    }

    public User getUserFromAddress(Long id) {
        return addressRepository.findById(id).get().getUser();
    }
}