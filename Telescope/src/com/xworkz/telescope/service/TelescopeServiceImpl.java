package com.xworkz.telescope.service;

import com.xworkz.telescope.dto.TelescopeDto;
import com.xworkz.telescope.repository.TelescopeRepository;
import com.xworkz.telescope.repository.TelescopeRepositoryImpl;

public class TelescopeServiceImpl implements TelescopeService{
    @OverrideAdd commentMore actions
    public boolean save(TelescopeDto telescopeDto) {
        if (telescopeDto == null) {
            System.out.println("DTO is null");
            return false;
        }

        String date = telescopeDto.getDate();
        if (date == null || date.trim().isEmpty()) {
            System.out.println("Invalid date");
            return false;
        }
        System.out.println("valid date");
        int count = telescopeDto.getCount();
        if (count < 0) {
            System.out.println("Invalid count");
            return false;
        }
        System.out.println("valid count");
        boolean soapUsed = telescopeDto.isSoapUsed();
        if (!soapUsed) {
            System.out.println("Soap must be used");
            return false;
        }
        System.out.println("valid");
        String location = telescopeDto.getLocation();
        if (location == null || location.trim().isEmpty()) {
            System.out.println("Invalid location");
            return false;
        }
        System.out.println("valid location");

        int duration = telescopeDto.getDuration();
        if (duration < 0) {
            System.out.println("Invalid duration");
            return false;
        }
        System.out.println("valid duration");
        String remarks = telescopeDto.getRemarks();
        if (remarks != null && remarks.trim().length() > 0 && remarks.trim().length() < 3) {
            System.out.println("Remarks too short");
            return false;

        }
        System.out.println("valid remarks");

        TelescopeRepository telescopeRepository=new TelescopeRepositoryImpl();
        telescopeRepository.parser(telescopeDto);
        return true;
    }
}

