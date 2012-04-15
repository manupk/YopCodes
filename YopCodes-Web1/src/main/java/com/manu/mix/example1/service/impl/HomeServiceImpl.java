package com.manu.mix.example1.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manu.mix.example1.dao.HomeDAO;
import com.manu.mix.example1.service.HomeService;

@Service
@Transactional
public class HomeServiceImpl implements HomeService {

    @Autowired
    private HomeDAO buswayDAO;

}
