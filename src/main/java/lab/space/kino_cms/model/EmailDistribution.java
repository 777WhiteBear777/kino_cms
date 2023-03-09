package lab.space.kino_cms.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "email_distributions")
@Data
public class EmailDistribution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "email_distribution_id")
    private List<Template> templates;
}
