package silva.henrique.financeiro_casa.enums;

import lombok.Getter;

@Getter
public enum PaymentMethod {
    AVISTA("à vista"),
    CREDITO("Crédito");

    private String method;

    PaymentMethod(String method) {
        this.method = method;
    }
}
