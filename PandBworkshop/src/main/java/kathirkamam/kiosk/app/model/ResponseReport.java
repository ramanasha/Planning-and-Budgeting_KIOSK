package kathirkamam.kiosk.app.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "response")
@EntityListeners(AuditingEntityListener.class)
public class ResponseReport implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long responseId;

    private String laId;

    private String counterId;

    private String questionId;

    private String response;

    @Column(nullable = false, updatable = false)
    private String date;

    private String gender;

    private String ethnicity;

    private String ageCategory;


    public String getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLaId() {
        return laId;
    }

    public void setLaId(String laId) {
        this.laId = laId;
    }

    public String getCounterId() {
        return counterId;
    }

    public void setCounterId(String counterId) {
        this.counterId = counterId;
    }

    @Override
    public String toString() {
        return "ResponseReport{" +
                "responseId=" + responseId +
                ", laId='" + laId + '\'' +
                ", counterId='" + counterId + '\'' +
                ", questionId='" + questionId + '\'' +
                ", response='" + response + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", ageCategory='" + ageCategory + '\'' +
                '}';
    }
}
