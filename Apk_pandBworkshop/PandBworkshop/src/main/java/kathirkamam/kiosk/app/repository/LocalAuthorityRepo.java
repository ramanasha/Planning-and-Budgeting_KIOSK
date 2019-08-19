package kathirkamam.kiosk.app.repository;

import kathirkamam.kiosk.app.model.LocalAuthority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalAuthorityRepo extends JpaRepository<LocalAuthority,Long> {

    @Query("SELECT laName FROM LocalAuthority WHERE referenceId =:referenceId")
    public String findLocalAuthorityByReferenceId(@Param("referenceId") String referenceId);

    @Query("SELECT referenceId FROM LocalAuthority WHERE laName =:laName")
    public String findReferenceIdByName(@Param("laName") String laName);

}
