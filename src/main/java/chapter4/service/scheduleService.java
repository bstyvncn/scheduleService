package chapter4.service;

import chapter4.model.schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class scheduleService implements IScheduleService{
    @Autowired
    chapter4.repositories.scheduleRepository scheduleRepository;

    @Override
    public List<schedule> viewSchedule(int filmID) {
        List<schedule> s = scheduleRepository.viewScheduleByFilm(filmID);

        return s;
    }
}
//5. Menampilkan jadwal dari film tertentu