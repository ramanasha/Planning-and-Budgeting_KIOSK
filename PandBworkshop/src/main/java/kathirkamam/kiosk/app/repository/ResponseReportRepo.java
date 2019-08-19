package kathirkamam.kiosk.app.repository;

import kathirkamam.kiosk.app.model.ResponseReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseReportRepo extends JpaRepository<ResponseReport,Long> {

    @Query("SELECT COUNT(response) FROM ResponseReport WHERE laId =:laId AND counterId =:counterId")
    public int findCounterById(String laId, String counterId);

}