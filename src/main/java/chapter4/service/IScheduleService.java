package chapter4.service;

import chapter4.model.schedule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IScheduleService {
    List<schedule> viewSchedule(int filmID);

}
