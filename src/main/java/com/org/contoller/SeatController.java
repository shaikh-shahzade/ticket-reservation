package com.org.contoller;

import com.org.model.Seat;
import com.org.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("seats")
public class SeatController {
    @Autowired
    private SeatService seatService;
    @GetMapping
    public List<Seat> getAllSeats()
    {
        return seatService.getAllSeats();
    }
    @PostMapping
    public Seat createSeats(@RequestBody Seat seat)
    {
        return seatService.createSeats();
    }
    @PutMapping
    public Seat updateSeats(@RequestBody Seat seat)
    {
        return seatService.updateSeats();
    }
    @DeleteMapping
    public Seat deleteSeats(@PathVariable Seat seat)
    {
        return seatService.deleteSeats();
    }

}
