package silva.henrique.financeiro_casa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "buys")
public class Buy implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Double price;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date date;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, updatable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "payment_method_id", nullable = false, updatable = false)
    private PaymentMethod paymentMethod;
    @ManyToOne
    @JoinColumn(name = "card_id", nullable = true)
    private Card card;
}
