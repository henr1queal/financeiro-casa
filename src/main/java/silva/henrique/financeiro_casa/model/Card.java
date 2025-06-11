package silva.henrique.financeiro_casa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "cards")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String lastFourDigits;
    private int bestBuyDate;
    private int due_date;

    @ManyToOne
    @JoinColumn(name = "home_id", nullable = false)
    private Home home;
}
