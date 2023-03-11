package lab.space.kino_cms.model;

import jakarta.persistence.*;
import lab.space.kino_cms.model.common.MappedEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "cinema_infos")
@Data
@EqualsAndHashCode(callSuper = true)
public class CinemaInfo extends MappedEntity {
    @Column(length = 100)
    private String cinemaName;
    private boolean disabled;
    @Column(length = 500)
    private String address;
    @Column(length = 100)
    private String coordinates;
    @Column(length = 150)
    private String logo;
    private boolean isDefault;
    @Transient
    private MultipartFile file;
    @ManyToOne(fetch = FetchType.LAZY )
    public ContactsPage contactsPage;
}
