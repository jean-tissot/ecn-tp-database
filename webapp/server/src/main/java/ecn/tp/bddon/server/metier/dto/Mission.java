package ecn.tp.bddon.server.metier.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "client", uniqueConstraints = @UniqueConstraint(columnNames = { "mission_id" }))
@Data
@NoArgsConstructor
public class Mission implements Serializable {

    @Id
    @Column(name = "mission_id")
    protected int id;

    @Column(name = "loading_time")
    protected String loadingTime;

    @ManyToOne
    @JoinColumn(name = "loading_point")
    protected LoadingPoint loadingPoint;

    @ManyToOne
    @JoinColumn(name = "driver")
    protected Driver driver;

    @ManyToOne
    @JoinColumn(name = "truck")
    protected Truck truck;

}
