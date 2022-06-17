package model;

import utils.enums.RoleType;

import java.util.Date;

public class Coach extends User {
    private TrainingHistory trainingHistory;

    public Coach(String username, String password, String name, String surname, String gender, Date birthDate,
                 RoleType role, TrainingHistory trainingHistory) {
        super(username, password, name, surname, gender, birthDate, role);
        this.trainingHistory = trainingHistory;
    }

    public TrainingHistory getTrainingHistory() {
        return trainingHistory;
    }

    public void setTrainingHistory(TrainingHistory trainingHistory) {
        this.trainingHistory = trainingHistory;
    }
}
