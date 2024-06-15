package com.example.profile.Rest;

import com.example.profile.Service.ProFileService;
import com.example.profile.model.Proflie;
import com.example.profile.vo.StandResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProflieRest {
    private static Logger logger = LoggerFactory.getLogger(ProflieRest.class);
    @Autowired
    ProFileService proFileService;

    @GetMapping("getProFlie")
    public StandResponse<?> getProFlie() {
        try {
            return new StandResponse<>(true, proFileService.getProflies());
        } catch (Exception exception) {
            logger.error("Get profile failed,please check Db connection", exception);
            throw exception;
        }
    }

}
