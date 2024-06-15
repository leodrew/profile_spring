package com.example.profile.Service;

import com.example.profile.model.ProfileRepostiory;
import com.example.profile.model.Proflie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProFileService {

    @Autowired
    ProfileRepostiory profileRepostiory;

    public List<Proflie> getProflies() {
        return profileRepostiory.listWeather();
    }
}
