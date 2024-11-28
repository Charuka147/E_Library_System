package edu.icet.crm.entity;

import edu.icet.crm.model.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name="publisher")
public class PublisherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    private Integer publisherId;

    @Column(name = "publisher_name", nullable = false)
    private String publisherName;

    @OneToMany(mappedBy = "publisherEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<BookEntity> books;
}
