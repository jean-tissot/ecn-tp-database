package ecn.tp.bddon.server.metier.dto.postgres;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "\"order\"")
@Data
@NoArgsConstructor
public class Order implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "client")
    private Client client;

}
