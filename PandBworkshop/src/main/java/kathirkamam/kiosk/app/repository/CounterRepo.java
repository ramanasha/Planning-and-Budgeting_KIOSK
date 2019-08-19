package kathirkamam.kiosk.app.repository;

import kathirkamam.kiosk.app.model.Counter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CounterRepo extends JpaRepository<Counter,Long> {

    @Query("SELECT counterName FROM Counter WHERE laId =:laId AND counterId =:counterId")
    public String findCounterById(@Param("laId") String laId, @Param("counterId") String counterId);

    @Query("SELECT counterId FROM Counter WHERE laId =:laId AND counterName =:counterName")
    public String findCounterByName(@Param("laId") String laId, @Param("counterName") String counterName);

    @Query("SELECT counterId FROM Counter WHERE laId =:laId")
    public List<String> getCounterIdByLaId(@Param("laId") String laId);

}
