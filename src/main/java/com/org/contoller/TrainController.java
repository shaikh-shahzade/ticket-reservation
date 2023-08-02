package com.org.contoller;

import com.org.model.Train;
import com.org.model.TrainSchedule;
import com.org.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.core.ControllerEntityLinks;
import org.springframework.hateoas.server.mvc.ControllerLinkRelationProvider;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.lang.reflect.Method;
import java.util.List;

@RestController
@RequestMapping("train")
public class TrainController {
    @Autowired
    private TrainService trainService;

    @GetMapping
    public CollectionModel<Train>  getAllTrains() throws NoSuchMethodException {
        Method method = TrainController.class.getMethod("getTrainById", Long.class);
         Link link = WebMvcLinkBuilder.linkTo(method).withRel("getUserById");
        CollectionModel<Train> ent = CollectionModel.of(trainService.getAllTrains() , link);
        return ent;

    }
   @GetMapping("{id}")
    public Train getTrainById(@PathVariable Long id)
    {
        return trainService.getTrainById(id);
    }
    @PostMapping
    public Train addTrain(@RequestBody Train train)
    {
        return trainService.addTrain(train);
    }
    @PutMapping
    public Train updateTrainDetails(@RequestBody Train train)
    {
        return trainService.updateTrainDetails(train);
    }
    @DeleteMapping
    public Train deleteTrain(@RequestBody Long id)
    {
        return trainService.deleteTrain(id);
    }
}
