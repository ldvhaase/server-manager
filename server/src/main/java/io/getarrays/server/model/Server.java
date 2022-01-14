package io.getarrays.server.model;

import io.getarrays.server.enumeration.Status;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import java.util.Objects;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Server {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column(unique = true)
    @NotEmpty(message = "IP Address field cannot be empty or null")
    private String ipAddress;

    private String name;
    
    private String memory;

    private String type;

    private String imageUrl;

    private Status status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Server server = (Server) o;
        return id != null && Objects.equals(id, server.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
