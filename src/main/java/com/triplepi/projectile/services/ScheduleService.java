package com.triplepi.projectile.services;

import com.triplepi.projectile.models.domain.ScheduleItemDTO;
import com.triplepi.projectile.models.im.ScheduleItemActionIM;
import com.triplepi.projectile.repositories.ScheduleItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScheduleService {

    private final ScheduleItemRepository scheduleItemRepository;

    @Autowired
    public ScheduleService(ScheduleItemRepository scheduleItemRepository) {
        this.scheduleItemRepository = scheduleItemRepository;
    }

    public void addScheduleItems(List<ScheduleItemDTO> scheduleItemDTOs) {
        scheduleItemRepository.saveAll(scheduleItemDTOs);
    }

    public void saveAction(Long scheduleItemId, ScheduleItemActionIM scheduleItemActionIM) {
        ScheduleItemDTO scheduleItemDTO = scheduleItemRepository.getOne(scheduleItemId);
        if (scheduleItemDTO.getStatus() == ScheduleItemDTO.StatusEnum.NEW && scheduleItemActionIM.getAction() == ScheduleItemActionIM.ActionEnum.START) {
            scheduleItemDTO.setStatus(ScheduleItemDTO.StatusEnum.STARTED);
            scheduleItemDTO.setFactStartDate(LocalDateTime.now());
        }
        if (scheduleItemDTO.getStatus() == ScheduleItemDTO.StatusEnum.STARTED && scheduleItemActionIM.getAction() == ScheduleItemActionIM.ActionEnum.STARTEXECUTION) {
            scheduleItemDTO.setStatus(ScheduleItemDTO.StatusEnum.EXECUTIONSTARTED);
            scheduleItemDTO.setFactStartExecutionDate(LocalDateTime.now());
        }
        if (scheduleItemDTO.getStatus() == ScheduleItemDTO.StatusEnum.EXECUTIONSTARTED && scheduleItemActionIM.getAction() == ScheduleItemActionIM.ActionEnum.SUSPEND) {
            scheduleItemDTO.setStatus(ScheduleItemDTO.StatusEnum.SUSPENDING);
        }
        if (scheduleItemDTO.getStatus() == ScheduleItemDTO.StatusEnum.SUSPENDING && scheduleItemActionIM.getAction() == ScheduleItemActionIM.ActionEnum.RESUME) {
            scheduleItemDTO.setStatus(ScheduleItemDTO.StatusEnum.EXECUTIONSTARTED);
        }
        if (scheduleItemActionIM.getAction() == ScheduleItemActionIM.ActionEnum.FINISH) {
            scheduleItemDTO.setStatus(ScheduleItemDTO.StatusEnum.FINISHED);
            scheduleItemDTO.setFactFinishDate(LocalDateTime.now());
        }
        if (scheduleItemActionIM.getAction() == ScheduleItemActionIM.ActionEnum.EXECUTEPARTIAL) {
            scheduleItemDTO.setQuarantineCount(scheduleItemDTO.getQuarantineCount() + scheduleItemActionIM.getProgress().getQuarantine().getCount());
            scheduleItemDTO.setFactCount(scheduleItemDTO.getFactCount() + scheduleItemActionIM.getProgress().getProcessed().getCount());
        }
        scheduleItemRepository.save(scheduleItemDTO);
    }

    public List<ScheduleItemDTO> getSchedule(String begin, String end, Long workCenterId) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:SSZ");
        LocalDateTime beginDateTime = LocalDateTime.parse(begin, dateTimeFormatter);
        LocalDateTime endDateTime = LocalDateTime.parse(end, dateTimeFormatter);
        return scheduleItemRepository.findAll().stream().filter(x -> x.getStartDate().isAfter(beginDateTime) && x.getFactFinishDate().isBefore(endDateTime) && x.getWorkCenter().getId().equals(workCenterId)).collect(Collectors.toList());
    }
}
