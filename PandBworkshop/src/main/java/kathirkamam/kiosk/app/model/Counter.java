package kathirkamam.kiosk.app.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "counter")
@EntityListeners(AuditingEntityListener.class)
public class Counter implements Serializable {


    @Id
    @Column(nullable = false, updatable = false)
    private String counterId;

    private String laId;

    private String counterName;

    public Counter(String laId, String counterId, String counterName) {
        this.laId = laId;
        this.counterId = counterId;
        this.counterName = counterName;
    }

    public Counter() {
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

    public String getCounterName() {
        return counterName;
    }

    public void setCounterName(String counterName) {
        this.counterName = counterName;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "laId='" + laId + '\'' +
                ", counterId='" + counterId + '\'' +
                ", counterName='" + counterName + '\'' +
                '}';
    }
}
