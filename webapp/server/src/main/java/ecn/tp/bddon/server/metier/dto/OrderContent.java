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
@Table(name = "client", uniqueConstraints = @UniqueConstraint(columnNames = { "order_content_id" }))
@Data
@NoArgsConstructor
public class OrderContent implements Serializable {

    @Id
    @Column(name = "order_content_id")
    protected int id;

    protected int quantity;

    @Column(name = "desired_delivery_date")
    protected String desiredDeliveryDate;

    @ManyToOne
    @JoinColumn(name = "product")
    protected Product product;

    @ManyToOne
    @JoinColumn(name = "order")
    protected Order order;

    @ManyToOne
    @JoinColumn(name = "delivery_point")
    protected DeliveryPoint deliveryPoint;

}
