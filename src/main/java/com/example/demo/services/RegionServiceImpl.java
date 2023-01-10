package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.Region;
import com.example.demo.repositories.RegionRepository;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionRepository regionRepository;

    @Override
    public List<Region> getAll() {
        // TODO Auto-generated method stub
        return regionRepository.findAll();
    }

    @Override
    public Region getById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean save(Region region) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
