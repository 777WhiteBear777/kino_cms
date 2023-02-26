package lab.space.kino_cms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lab.space.kino_cms.model.common.MappedEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table
@Data
@EqualsAndHashCode(callSuper = true)
public class TopBannerBlocks extends MappedEntity {
    @Column(length = 150)
    private String image;
    @Column(length = 150)
    private String url;
    @Column(length = 500)
    private String text;
    @ManyToOne
    private TopBanner topBanner;
}
