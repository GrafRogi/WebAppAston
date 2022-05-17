package org.example.controllers;

import org.example.models.Tracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

/**
 * @author Igor Gorokh
 */

@Controller
@RequestMapping("/tracker")
public class TrackersController {

    private final TaskTrackerDAO taskTrackerDAO;

    @Autowired
    public TrackersController(TaskTrackerDAO taskTrackerDAO) {
        this.taskTrackerDAO = taskTrackerDAO;
    }

    /**
     * Получаем все трекинги из DAO и передаём их на отображение в представление
     */

    @GetMapping()
    public String getAllTrackers(Model taskTrackModel) {
        taskTrackModel.addAttribute("trackers", taskTrackerDAO.getAllTrackers());
        return "trackers/alltrack";
    }

    /**
     * Получаем трекинг одно человека по имени из DAO и передаём их на отображение в представление
     */

    @GetMapping("/{studentName}")
    public String show(@PathVariable("studentName") int studentName, Model taskTrackModel) {
        taskTrackModel.addAttribute("tracker", taskTrackerDAO.show(studentName));
        return "trackers/show";
    }

    /**
     * добавляем новый трекинг в базу
     */

    @GetMapping("/new")
    public String newTrack(Model taskTrackModel) {
        taskTrackModel.addAttribute("tracker", new Tracker());
        return "trackers/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("traker") Tracker tracker) {
        taskTrackerDAO.save(tracker);
        return "redirect:/trackers";
    }
}

