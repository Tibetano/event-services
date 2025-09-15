package com.anigame.event_services.infrastructure.persistence.sponsorship;

import com.anigame.event_services.data.mapper.SponsorshipMapper;
import com.anigame.event_services.domain.model.Sponsorship;
import com.anigame.event_services.domain.model.SponsorshipCompanyName;
import com.anigame.event_services.domain.model.enumerate.SponsorshipType;
import com.anigame.event_services.domain.persistence.SponsorshipRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SponsorshipRepositoryImpl implements SponsorshipRepository {

    @PersistenceContext
    EntityManager entityManager;

    private final SpringDataSponsorShipRepository jpaRepo;
    private final SponsorshipMapper sponsorshipMapper;

    @Override
    public void save(Sponsorship sponsorship) {

    }

    @Override
    public List<Sponsorship> findAll() {
        var sponsorshipList = jpaRepo.findAll();
        return sponsorshipList.stream().map(sponsorshipMapper::toDomain).toList();
    }

    @Override
    public List<SponsorshipCompanyName> findAllSponsorshipCompanyName() {
        String sql = "SELECT tc.\"name\", ts.logo_link, ts.site_link, ts.\"type\" \n" +
                "FROM event_services.tb_companies tc JOIN event_services.tb_sponsorships ts ON ts.company_id = tc.id ;";
        List<Object[]> rows = entityManager.createNativeQuery(sql).getResultList();

        return rows.stream().map(
                row -> SponsorshipCompanyName.builder()
                        .name((String)row[0])
                        .logoLink((String)row[1])
                        .siteLink((String)row[2])
                        .type(SponsorshipType.valueOf((String)row[3]))
                        .build()
        ).toList();
    }

}
