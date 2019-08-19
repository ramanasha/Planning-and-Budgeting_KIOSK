package kathirkamam.kiosk.app.model;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "local_Authority")
@EntityListeners(AuditingEntityListener.class)
public class LocalAuthority implements Serializable {

    @Id
    @Column(nullable = false, updatable = false)
    private String referenceId;


    private String laName;


    public LocalAuthority() {
    }

    public LocalAuthority(String laName, String referenceId) {
        this.laName = laName;
        this.referenceId = referenceId;
    }


    public String getLaName() {
        return laName;
    }

    public void setLaName(String laName) {
        this.laName = laName;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    @Override
    public String toString() {
        return "LocalAuthority{" +
                ", laName='" + laName + '\'' +
                ", referenceId='" + referenceId + '\'' +
                '}';
    }
}
