package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Address;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import com.example.demo.entity.User;
import com.example.demo.service.AddressService;

@RestController
@RequestMapping("/api")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/addresses/{id}")
    public Address addAddress(@PathVariable Long id, @RequestBody Address address) {
        return addressService.addAddress(id, address);
    }

    @GetMapping("/addresses/{id}")
    public List<Address> getAddresses(@PathVariable Long id) {
        return addressService.getAddresses(id);
    }

    @GetMapping("/getUser/{id}") // get user from the address id (bidirectional relation)
    public User getUserFromAddress(@PathVariable Long id) {
        return addressService.getUserFromAddress(id);
    }
}