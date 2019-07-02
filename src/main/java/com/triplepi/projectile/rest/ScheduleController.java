package com.triplepi.projectile.rest;

import com.triplepi.projectile.models.domain.ScheduleItemDTO;
import com.triplepi.projectile.models.im.ScheduleItemActionIM;
import com.triplepi.projectile.services.ScheduleService;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @PostMapping
    public void addScheduleItem(@RequestBody List<ScheduleItemDTO> scheduleItemDTOList){
        scheduleService.addScheduleItems(scheduleItemDTOList);
    }

    @GetMapping
    public List<ScheduleItemDTO> getSchedule(@RequestParam String begin, @RequestParam String end, @RequestParam Long workCenterId) throws ParseException {
        return scheduleService.getSchedule(begin,end,workCenterId);
    }

    @GetMapping("/actions/{id}")
    public void saveAction(@PathVariable Long id, @RequestBody ScheduleItemActionIM scheduleItemActionIM){
        scheduleService.saveAction(id,scheduleItemActionIM);
    }

}
