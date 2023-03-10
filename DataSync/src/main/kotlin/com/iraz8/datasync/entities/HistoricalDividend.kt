package com.iraz8.datasync.entities

import jakarta.persistence.*
import java.math.BigDecimal
import java.util.*

@Entity
class HistoricalDividend {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    val id: Long? = null

    @JoinColumn(name = "symbol")
    val symbol: String
    val date: Calendar?
    val adjDividend: BigDecimal?

    constructor(yahooHistoricalDividend: yahoofinance.histquotes2.HistoricalDividend) {
        this.symbol = yahooHistoricalDividend.symbol
        this.date = yahooHistoricalDividend.date
        this.adjDividend = yahooHistoricalDividend.adjDividend
    }
}