package com.github.evgenylizogubov.solva.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "transaction")
@Getter
@Setter
public class Transaction extends AbstractBaseEntity {
    @Column(name = "account_from", nullable = false)
    @NotNull
    private Long accountFrom;
    
    @Column(name = "account_to", nullable = false)
    @NotNull
    private Long accountTo;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "currency_shortname", nullable = false)
    @NotNull
    private CurrencyShortname currencyShortname;
    
    @Column(name = "sum", nullable = false)
    @NotNull
    private BigDecimal sum;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "expense_category", nullable = false)
    @NotNull
    private ExpenseCategory expenseCategory;
    
    @Column(name = "date_time", nullable = false)
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ssXX")
    private OffsetDateTime dateTime;
}
