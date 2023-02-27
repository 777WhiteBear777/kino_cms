package lab.space.kino_cms.repository;

import lab.space.kino_cms.model.Seo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeoRepository extends JpaRepository<Seo, Long> {
}